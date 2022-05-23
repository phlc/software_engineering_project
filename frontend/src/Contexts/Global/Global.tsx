import { createContext, FunctionComponent, ReactNode, useContext } from 'react';

interface GlobalProviderProps {
    value: GlobalContextData;
}

interface GlobalContextData {
    isAuthenticated: boolean;
    setIsAuthenticated: React.Dispatch<React.SetStateAction<boolean>>;
}


export const GlobalContext = createContext({} as GlobalContextData);

export const useGlobal = () => useContext(GlobalContext)

export const GlobalProvider: FunctionComponent<GlobalProviderProps> = ({children, value = {} as GlobalContextData}) =>  (
        <GlobalContext.Provider 
            value={value}>
            {children}
        </GlobalContext.Provider>
    )
