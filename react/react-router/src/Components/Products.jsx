import React from 'react'
import { useNavigate } from 'react-router-dom'

const Products = () => {

    let navigate = useNavigate();

    return (
        <div>
            <h1>This is Products Page</h1>
            <button type="button" onClick={(e) => navigate("/order-summary")}>Place Order</button>
        </div>
    )
}

export default Products
