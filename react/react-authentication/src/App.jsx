import React, { createContext, use, useState } from 'react';
import { ToastContainer } from 'react-toastify';
import NavBar from './Components/Navbar';
import { Route, Routes } from 'react-router-dom';
import Home from './Components/Home';
import Products from './Components/Products';
import LogIn from './Components/LogIn';
import SignUp from './Components/SignUp';
import Footer from './Components/Footer';
import "./App.css";
import Welcome from './Components/Welcome';
import Category1 from './Components/Category1';
import Category2 from './Components/Category2';
import Category3 from './Components/Category3';


export let UserContext = createContext();

const App = () => {

  let [isLoggedIn, setIsLoggedIn] = useState(false);
  let [userData, setUserData] = useState("");

  let value = { isLoggedIn, setIsLoggedIn, userData, setUserData };

  return (
    <UserContext.Provider value={value}>

      <ToastContainer />
      <NavBar />

      <Routes>
        <Route />
        <Route path="/" element={<Home />} />

        <Route path="/products" element={<Products />}>
          <Route index element={<Category1 />} />
          <Route path='category1' element={<Category1 />} />
          <Route path='category2' element={<Category2 />} />
          <Route path='category3' element={<Category3 />} />
        </Route>

        <Route path="/log-in" element={<LogIn />} />
        <Route path="/sign-up" element={<SignUp />} />
        <Route path="/welcome" element={<Welcome />} />
      </Routes>

      <Footer />
    </UserContext.Provider>
  )
}

export default App;
