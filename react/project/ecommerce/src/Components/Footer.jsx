import React from 'react'
import { NavLink } from 'react-router-dom'

const Footer = () => {
    return (
        <footer>
            <ul>
                <li>
                    {new Date().getFullYear()} &copy; User Authentication
                </li>
                <li>
                    Made With React
                </li>
            </ul>
        </footer>
    )
}

export default Footer
