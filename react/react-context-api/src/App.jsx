import React, { createContext, useState } from 'react';
import Login from './pages/Login';
import Profile from './pages/Profile';

export let UserContext = createContext();

const App = () => {

  let [value, setValue] = useState(null);

  // let [data, setData] = useState({
  //   name: "Samsung",
  //   price: 20000,
  //   color: "Black"
  // });

  return (
    <UserContext.Provider value={{ value, setValue }}>
      <Login />
      <Profile />
    </UserContext.Provider>
  )
}

export default App;
