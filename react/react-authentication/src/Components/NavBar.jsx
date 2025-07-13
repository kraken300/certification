import React, { useContext } from 'react'
import { NavLink } from 'react-router-dom'
import { UserContext } from '../App'

const NavBar = () => {

    let { isLoggedIn, setIsLoggedIn, userData, setUserData } = useContext(UserContext);

    let handleLogout = (e) => {
        setIsLoggedIn(false);
        setUserData("");
    }

    return (
        <nav>
            {
                isLoggedIn ? (
                    <ul>
                        <li>
                            <NavLink to={"/"}>Home</NavLink>
                        </li>
                        <li>
                            <NavLink to={"/products"}>Products</NavLink>
                        </li>
                        <li style={{ color: "violet", fontSize: "20px" }}>
                            {userData}
                        </li>
                        <li>
                            <NavLink to={"/"} onClick={handleLogout}>Logout</NavLink>
                        </li>
                    </ul>
                ) : (
                    <ul>
                        <li>
                            <NavLink to={"/"}>Home</NavLink>
                        </li>
                        <li>
                            <NavLink to={"/products"}>Products</NavLink>
                        </li>
                        <li>
                            <NavLink to={"/log-in"}>Login</NavLink>
                        </li>
                    </ul>
                )
            }
        </nav>
    )
}

export default NavBar
