import { createContext, FunctionComponent, ReactNode, useContext } from 'react';
import { AuthenticatedUser, Book } from '../../types';

interface GlobalProviderProps {
    value: GlobalContextData;
}

interface GlobalContextData {
    isAuthenticated: boolean;
    setIsAuthenticated: React.Dispatch<React.SetStateAction<boolean>>;
    books: Book[];
    setBooks: React.Dispatch<React.SetStateAction<Book[]>>;
    authenticatedUser: AuthenticatedUser;
    setAuthenticatedUser: React.Dispatch<React.SetStateAction<AuthenticatedUser>>;
    favoriteBooks: Book[];
    setFavoriteBooks: React.Dispatch<React.SetStateAction<Book[]>>;
}


export const GlobalContext = createContext({} as GlobalContextData);

export const useGlobal = () => useContext(GlobalContext)

export const GlobalProvider: FunctionComponent<GlobalProviderProps> = ({children, value = {} as GlobalContextData}) =>  (
        <GlobalContext.Provider 
            value={value}>
            {children}
        </GlobalContext.Provider>
    )
