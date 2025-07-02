import React from 'react'
import { NavLink, Outlet, useNavigate } from 'react-router-dom'

const Products = () => {

    const navigate = useNavigate();

    const handleStyle = ({ isActive }) => {
        return {
            background: isActive && "lightblue",
            color: isActive && "black"
        }
    }

    return (
        <div>
            <h1>This is Products Page</h1>
            <button type="button" onClick={(e) => navigate("/order-summary")}>Place Order</button>

            <section className="product-container">
                <ul>
                    <li>
                        <NavLink to={"new"} style={handleStyle}>New Products</NavLink>
                    </li>

                    <li>
                        <NavLink to={"featured"} style={handleStyle}>Featured Products</NavLink>
                    </li>
                </ul>

            </section>
            <Outlet />
        </div>
    )
}

export default Products
