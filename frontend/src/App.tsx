import { useState } from 'react';
import './App.css';
import AppRoutes from './Components/routes';
import {GlobalProvider}from './Contexts/Global/Global'

function App() {
  const [ isAuthenticated,setIsAuthenticated] = useState(false)

  return (
    <div className="App">
      <GlobalProvider value={{ isAuthenticated,setIsAuthenticated }}>
        <AppRoutes />
      </GlobalProvider>
    </div>
  );
}

export default App;
