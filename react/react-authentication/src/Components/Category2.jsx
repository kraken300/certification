import { useContext, useEffect, useState } from 'react';
import { UserContext } from '../App';
import axios from 'axios';

const Category2 = () => {
    const [products, setProducts] = useState([]);
    const { cartProducts, setCartProducts } = useContext(UserContext);

    useEffect(() => {
        axios.get("http://localhost:4000/products2")
            .then(({ data }) => setProducts(data))
            .catch(console.log);
    }, []);

    const addToCart = (product) => {
        const alreadyInCart = cartProducts.find((item) => item.id === product.id);
        if (!alreadyInCart) {
            setCartProducts([...cartProducts, { ...product, quantity: 1 }]);
        }
    };

    const isInCart = (id) => cartProducts.some(p => p.id === id);

    return (
        <div className="container">
            <section>
                {products?.map((v) => (
                    <div className="card" key={v.id}>
                        <h2>{v.title}</h2>
                        <img src={v.image} alt={v.title} />
                        <p>Price: <b>${v.price}</b></p>
                        {!isInCart(v.id) && (
                            <button onClick={() => addToCart(v)}>Add to cart</button>
                        )}
                    </div>
                ))}
            </section>
        </div>
    );
};

export default Category2;
