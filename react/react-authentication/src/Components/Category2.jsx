import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Category2 = () => {

    let [products, setProducts] = useState(null);

    useEffect(() => {
        axios.get("http://localhost:4000/products2")
            .then(
                ({ data }) => {
                    setProducts(data);
                },
                (error) => console.log(error),
            )
    }, []);

    let handleAddProduct = (e) => {

    }

    // console.log(products);

    return (
        <div className="container">
            <section>
                {
                    products?.map((v) => {
                        return (
                            <div className="card" key={v.id}>
                                <h2>Title : {v.title}</h2>
                                <img src={v.image} alt={v.title} />
                                <p>Price : <b>${v.price}</b></p>

                                <button type="button" onClick={handleAddProduct}>Add to cart</button>
                            </div>
                        )
                    })
                }
            </section>
        </div>
    )
}

export default Category2;
