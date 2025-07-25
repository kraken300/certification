import React, { useContext, useEffect, useRef } from 'react';
import { MdClear } from 'react-icons/md';
import { UserContext } from '../App';
import { useNavigate } from 'react-router-dom';

const CartSidebar = () => {
    const { cartProducts, setCartProducts } = useContext(UserContext);
    const sidebarRef = useRef();

    useEffect(() => {
        window.toggleCart = () => {
            if (sidebarRef.current) sidebarRef.current.style.display = 'block';
        };
        window.closeCart = () => {
            if (sidebarRef.current) sidebarRef.current.style.display = 'none';
        };
    }, []);

    const navigate = useNavigate();

    const removeFromCart = (id) => {
        setCartProducts(cartProducts.filter(item => item.id !== id));
    };

    const increaseQty = (id) => {
        setCartProducts(prev =>
            prev.map(item => item.id === id ? { ...item, quantity: item.quantity + 1 } : item)
        );
    };

    const decreaseQty = (id) => {
        setCartProducts(prev =>
            prev.map(item =>
                item.id === id && item.quantity > 1
                    ? { ...item, quantity: item.quantity - 1 }
                    : item
            )
        );
    };

    return (
        <div className="sidebar" ref={sidebarRef} style={{ display: 'none' }}>
            <p>
                <MdClear className="clear" onClick={() => window.closeCart()} />
            </p>
            {cartProducts.length === 0 ? (
                <p style={{ textAlign: 'center' }}>Cart is empty</p>
            ) : (
                cartProducts.map((v) => (
                    <div className="card" key={v.id}>
                        <h2>{v.title}</h2>
                        <img src={v.thumbnail || v.image || v.images?.[0]} alt={v.title} />
                        <p>Price: <b>${v.price}</b></p>

                        <div style={{ display: 'flex', justifyContent: 'center', gap: '10px', margin: '10px 0' }}>
                            <button onClick={() => decreaseQty(v.id)}>-</button>
                            <span>{v.quantity}</span>
                            <button onClick={() => increaseQty(v.id)}>+</button>
                        </div>

                        <button onClick={() => removeFromCart(v.id)}>Remove from cart</button>
                    </div>
                ))
            )}

            {cartProducts.length > 0 && (
                <div style={{ marginTop: '1rem', textAlign: 'center' }}>
                    <button
                        onClick={() => {
                            window.closeCart();
                            navigate('/checkout');
                        }}
                        style={{
                            padding: '10px 20px',
                            backgroundColor: 'blue',
                            color: 'white',
                            border: 'none',
                            borderRadius: '4px',
                            cursor: 'pointer',
                            fontWeight: 'bold',
                            marginRight:"50px"
                        }}
                    >
                        Proceed to Checkout
                    </button>
                </div>
            )}

        </div>
    );
};

export default CartSidebar;
