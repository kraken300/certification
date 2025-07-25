import React, { useContext } from 'react';
import { UserContext } from '../App';
import { toast } from 'react-toastify';

const Checkout = () => {
  const { cartProducts, setCartProducts } = useContext(UserContext);

  const totalAmount = cartProducts.reduce(
    (sum, item) => sum + item.price * item.quantity,
    0
  );

  const handlePlaceOrder = () => {
    if (cartProducts.length === 0) {
      toast.error("Your cart is empty.");
      return;
    }

    toast.success("Order placed successfully!");
    setCartProducts([]);
  };

  return (
    <div className="container">
      <h1 style={{ marginBottom: '8px' }}>Checkout Summary</h1>

      {cartProducts.length === 0 ? (
        <p>Your cart is empty.</p>
      ) : (
        <>
          <ul>
            {cartProducts.map((item) => (
              <li key={item.id} style={{ marginBottom: '8px' }}>
                <strong>{item.title}</strong> — Qty: {item.quantity} — Price: $
                {item.price * item.quantity}
              </li>
            ))}
          </ul>

          <h2>Total: ${totalAmount.toFixed(2)}</h2>

          <div style={{ marginTop: '16px', textAlign: 'center'}}>
            <button
              onClick={handlePlaceOrder}
              style={{
                padding: '10px 20px',
                backgroundColor: 'blue',
                color: 'white',
                border: 'none',
                borderRadius: '4px',
                cursor: 'pointer',
                fontSize: '16px',
                fontWeight: 'bold',
              }}
            >
              Place Order
            </button>
          </div>
        </>
      )}
    </div>
  );
};

export default Checkout;
