import { useCallback, useEffect, useState } from "react";
import { isTemplateExpression } from "typescript";
import { getAllBooks, getBookByAuthor } from "./Api/BookApi";
import "./App.css";
import AppRoutes from "./Components/routes";
import { SignModal } from "./Components/SignModal";
import { GlobalProvider } from "./Contexts/Global/Global";
import { ToastProvider } from "./Contexts/Toast/Toast";
import { AuthenticatedUser, Book, ShoppingCartItemType } from "./types";
import { SignModalEnum } from "./types";

function App() {
  const [authenticatedUser, setAuthenticatedUser] = useState(
    {} as AuthenticatedUser
  );
  const [books, setBooks] = useState([] as Book[]);
  const [favoriteBooks, setFavoriteBooks] = useState([] as Book[]);
  const [showSignModal, setShowSignModal] = useState(SignModalEnum.UNDEFINED)
  const [shoppingCart, setShoppingCart] = useState([] as ShoppingCartItemType[])

  const getBooks = async () => {
    const response = await getAllBooks();
    setBooks(response);
  };

  const addBookToShoppingCart = useCallback((newBook: Book) => {
    console.log(newBook.id)
    const hasThisBookInTheList = shoppingCart.find((item) => item.book.id == newBook.id)
    if (!!hasThisBookInTheList) {
      const aux = shoppingCart.map((item) => ({ 
        ...item, 
        amount: item.book.id === newBook.id ? item.amount + 1 : item.amount
        }))


      setShoppingCart(aux as unknown as ShoppingCartItemType[])
    } else {
      setShoppingCart((oldItems) => [
        ...oldItems, 
        { 
          book: newBook, 
          amount: 1, 
          days: 20 + (Math.floor(Math.random() * 10))
        }])
    }
  }, [shoppingCart])

  const removeBookToShoppingCart = useCallback((bookId: number) => {
    const shoppingCartItem = shoppingCart.find((item) => item.book.id === bookId)

    if (shoppingCartItem?.amount === 1) {
      setShoppingCart((oldItems) => oldItems.filter((item) => item.book.id !== bookId))
    } else {
      const aux = shoppingCart.map((item) => ({ ...item, amount: item.book.id === bookId ? item.amount - 1 : item.amount }))

      setShoppingCart(aux as unknown as ShoppingCartItemType[])
    }
  }, [shoppingCart])

  useEffect(() => {
    getBooks();
  }, []);

  return (
    <div className="App">
      <GlobalProvider
        value={{
          books,
          setBooks,
          setAuthenticatedUser,
          authenticatedUser,
          favoriteBooks,
          setFavoriteBooks,
          showSignModal,
          setShowSignModal,
          shoppingCart,
          setShoppingCart,
          addBookToShoppingCart,
          removeBookToShoppingCart,
        }}
      >
        <ToastProvider>
          <AppRoutes />
          {

            showSignModal === SignModalEnum.SIGN_IN && (
              <SignModal showBody={0} />
            )
          }
          {
            showSignModal === SignModalEnum.SIGN_UP && (
              <SignModal showBody={1} />
            )
          }
        </ToastProvider>
      </GlobalProvider>
    </div>
  );
}

export default App;
