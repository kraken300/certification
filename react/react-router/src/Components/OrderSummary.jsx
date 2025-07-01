import React from 'react'
import { useNavigate } from 'react-router-dom'

const OrderSummary = () => {

    let navigate = useNavigate();

    return (
        <div>
            <h1>Order Placed Successfully!</h1>
            <button type="button" onClick={(e) => navigate(-1)}>Go back</button>
        </div>
    )
}

export default OrderSummary
