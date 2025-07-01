import React from 'react'
import { NavLink } from 'react-router-dom'

const Navbar = () => {

    const handleStyle = ({ isActive }) => {
        // console.log(isActive);
        return {
            background: isActive && "lightblue",
            color: isActive && "black",
            borderRadius: isActive && "8px"
        };
    }

    return (
        <nav>
            <ul>
                <li>
                    <NavLink to={"/"} style={handleStyle}>Home</NavLink>
                </li>

                <li>
                    <NavLink to={"/products"} style={handleStyle}>Products</NavLink>
                </li>

                <li>
                    <NavLink to={"/about-us"} style={handleStyle}>About Us</NavLink>
                </li>
            </ul>
        </nav>
    )
}

export default Navbar
