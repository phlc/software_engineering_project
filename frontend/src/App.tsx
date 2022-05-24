import { useEffect, useState } from "react";
import { getAllBooks, getBookByAuthor } from "./Api/BookApi";
import "./App.css";
import AppRoutes from "./Components/routes";
import { GlobalProvider } from "./Contexts/Global/Global";
import { AuthenticatedUser, Book } from "./types";

function App() {
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [authenticatedUser, setAuthenticatedUser] = useState(
    {} as AuthenticatedUser
  );
  const [books, setBooks] = useState([] as Book[]);
  const [favoriteBooks, setFavoriteBooks] = useState([] as Book[]);

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
          isAuthenticated,
          setIsAuthenticated,
          books,
          setBooks,
          setAuthenticatedUser,
          authenticatedUser,
          favoriteBooks,
          setFavoriteBooks,
        }}
      >
        <AppRoutes />
      </GlobalProvider>
    </div>
  );
}

export default App;
