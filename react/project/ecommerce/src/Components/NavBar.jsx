import React, { useContext, useRef } from 'react';
import { NavLink } from 'react-router-dom';
import { UserContext } from '../App';
import { FaShoppingCart } from 'react-icons/fa';

const NavBar = () => {
    const { isLoggedIn, setIsLoggedIn, userData, setUserData, cartProducts } = useContext(UserContext);

    const handleLogout = () => {
        setIsLoggedIn(false);
        setUserData("");
    };

    return (
        <nav className="navbar">
            <ul>
                <li>
                    <NavLink to={"/"}>Home</NavLink>
                </li>
                <li>
                    <NavLink to={"/products"}>Products</NavLink>
                </li>
                {isLoggedIn ? (
                    <>
                        <li style={{ color: "violet", fontSize: "20px" }}>
                            {userData}
                        </li>
                        <li>
                            <button onClick={handleLogout}>Logout</button>
                        </li>
                        <li>
                            <FaShoppingCart
                                onClick={() => window.toggleCart()}
                                style={{ fontSize: "22px", cursor: "pointer", color:"white" }}
                            />
                            <sup>{cartProducts.length}</sup>
                        </li>
                    </>
                ) : (
                    <>
                        <li>
                            <NavLink to={"/log-in"}>Login</NavLink>
                        </li>
                    </>
                )}
            </ul>
        </nav>
    );
};

export default NavBar;
