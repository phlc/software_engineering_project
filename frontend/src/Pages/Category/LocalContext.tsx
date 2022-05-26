import { createContext, FunctionComponent, useContext } from 'react';
import { Book } from '../../types';

interface LocalProviderProps {
    value: LocalContextData;
}

interface LocalContextData {
    books: Book[];
    setBooks: React.Dispatch<React.SetStateAction<Book[]>>;
}


export const LocalContext = createContext({} as LocalContextData);

export const useLocal = () => useContext(LocalContext)

export const LocalProvider: FunctionComponent<LocalProviderProps> = ({children, value = {} as LocalContextData}) =>  (
        <LocalContext.Provider 
            value={value}>
            {children}
        </LocalContext.Provider>
    )
