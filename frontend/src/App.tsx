import { useEffect, useState } from "react";
import { getAllBooks, getBookByAuthor } from "./Api/BookApi";
import "./App.css";
import AppRoutes from "./Components/routes";
import { SignModal } from "./Components/SignModal";
import { GlobalProvider } from "./Contexts/Global/Global";
import { AuthenticatedUser, Book } from "./types";
import { SignModalEnum } from "./utils/types";

function App() {
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [authenticatedUser, setAuthenticatedUser] = useState(
    {} as AuthenticatedUser
  );
  const [books, setBooks] = useState([] as Book[]);
  const [favoriteBooks, setFavoriteBooks] = useState([] as Book[]);
  const [ showSignModal,setShowSignModal] = useState(SignModalEnum.UNDEFINED)


  const getBooks = async () => {
    const response = await getAllBooks();
    setBooks(response);
  };

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
        }}
      >
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
      </GlobalProvider>
    </div>
  );
}

export default App;
