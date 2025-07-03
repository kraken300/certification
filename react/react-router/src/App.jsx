import React from 'react';
import { Route, Routes } from 'react-router-dom';
import Home from './Components/Home';
import Products from './Components/Products';
import About from './Components/About';
import Navbar from './Components/Navbar';
import OrderSummary from './Components/OrderSummary';
import "./App.css";
import PageNotFound from './Components/PageNotFound';
import FeaturedProducts from './Components/Product/FeaturedProducts';
import NewProducts from './Components/Product/NewProducts';
import Users from './Components/Users/Users';
import UserData from './Components/Users/UserData';
import Admin from './Components/Users/Admin';
import DemoRoute from './Components/routes/DemoRoute';

const App = () => {
  return (
    <>
      <Navbar />
      <DemoRoute />
      {/* <Routes>
        <Route path="/" element={<Home />} />
        
        <Route path="/products" element={<Products />} >
          <Route index element={<FeaturedProducts />} />
          <Route path="new" element={<NewProducts />} />
          <Route path="featured" element={<FeaturedProducts />} />
        </Route>

        <Route path="/about-us" element={<About />} />
        <Route path="/order-summary" element={<OrderSummary />} />

        <Route path="/users" element={<Users />}>
          <Route path=":userId" element={<UserData />} />
          <Route path="admin" element={<Admin />} />
        </Route>

        <Route path="*" element={<PageNotFound />} />
      </Routes> */}
    </>
  )
}

export default App;