import { createContext, FunctionComponent, ReactNode, useContext } from 'react';
import { ShoppingCartItemType, SignModalEnum } from '../../types';
import { AuthenticatedUser, Book } from '../../types';

interface GlobalProviderProps {
    value: GlobalContextData;
}

interface GlobalContextData {
    showSignModal: SignModalEnum;
    setShowSignModal: React.Dispatch<React.SetStateAction<SignModalEnum>>;
    books: Book[];
    setBooks: React.Dispatch<React.SetStateAction<Book[]>>;
    authenticatedUser: AuthenticatedUser;
    setAuthenticatedUser: React.Dispatch<React.SetStateAction<AuthenticatedUser>>;
    favoriteBooks: Book[];
    setFavoriteBooks: React.Dispatch<React.SetStateAction<Book[]>>;
    shoppingCart: ShoppingCartItemType[];
    setShoppingCart: React.Dispatch<React.SetStateAction<ShoppingCartItemType[]>>;
    addBookToShoppingCart: (book: Book) => void
    removeBookToShoppingCart: (bookId: number) => void
}


export const GlobalContext = createContext({} as GlobalContextData);

export const useGlobal = () => useContext(GlobalContext)

export const GlobalProvider: FunctionComponent<GlobalProviderProps> = ({children, value = {} as GlobalContextData}) =>  (
        <GlobalContext.Provider 
            value={value}>
            {children}
        </GlobalContext.Provider>
    )
