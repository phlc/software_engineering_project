import { useState } from 'react';
import './App.css';
import AppRoutes from './Components/routes';
import { SignModal } from './Components/SignModal';
import {GlobalProvider}from './Contexts/Global/Global'
import { SignModalEnum } from './utils/types';

function App() {
  const [ isAuthenticated,setIsAuthenticated] = useState(false)
  const [ showSignModal,setShowSignModal] = useState(SignModalEnum.UNDEFINED)

  return (
    <div className="App">
      <GlobalProvider value={{ 
          isAuthenticated,
          setIsAuthenticated, 
          showSignModal,
          setShowSignModal 
        }}>
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
