// App.jsx
import React, { createContext, useState } from 'react';
import { ToastContainer } from 'react-toastify';
import NavBar from './Components/Navbar';
import { Route, Routes } from 'react-router-dom';
import Home from './Components/Home';
import Products from './Components/Products';
import LogIn from './Components/LogIn';
import SignUp from './Components/SignUp';
import Footer from './Components/Footer';
import "./App.css";
import Category1 from './Components/Category1';
import Category2 from './Components/Category2';
import Category3 from './Components/Category3';
import CartSidebar from './Components/CartSidebar';
import Checkout from './Components/Checkout';

export let UserContext = createContext();

const App = () => {
  let [isLoggedIn, setIsLoggedIn] = useState(false);
  let [userData, setUserData] = useState("");
  let [cartProducts, setCartProducts] = useState([]);

  let value = { isLoggedIn, setIsLoggedIn, userData, setUserData, cartProducts, setCartProducts };

  return (
    <UserContext.Provider value={value}>
      <div className="app-wrapper">
        <ToastContainer />
        <NavBar />
        <div className="app-main">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/products" element={<Products />}>
              <Route index element={<Category1 />} />
              <Route path='category1' element={<Category1 />} />
              <Route path='category2' element={<Category2 />} />
              <Route path='category3' element={<Category3 />} />
            </Route>
            <Route path="/log-in" element={<LogIn />} />
            <Route path="/sign-up" element={<SignUp />} />
            <Route path="/checkout" element={<Checkout />} />
          </Routes>
        </div>
        <Footer />
        <CartSidebar />
      </div>
    </UserContext.Provider>
  )
}

export default App;
