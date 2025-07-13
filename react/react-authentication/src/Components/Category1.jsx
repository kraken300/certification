import axios from 'axios';
import React, { useEffect, useRef, useState } from 'react'
import { GiHamburgerMenu } from 'react-icons/gi';
import { MdClear } from 'react-icons/md';

const Category1 = () => {

    let [products, setProducts] = useState(null);

    let [productsArray, setProductsArray] = useState([]);

    let [toggle, setToggle] = useState(true);

    let sidebarRef = useRef();

    useEffect(() => {
        axios.get("http://localhost:4000/products1")
            .then(
                ({ data }) => {
                    setProducts(data);
                },
                (error) => console.log(error),
            )
    }, []);

    // console.log(products);
    console.log(productsArray);

    return (
        <>
            <div className="container">
                <p>
                    <GiHamburgerMenu className='menu' onClick={(e) => sidebarRef.current.style.display = "block"} />
                </p>
                <section>
                    {
                        products?.map((v) => {
                            return (
                                <div className="card" key={v.id}>
                                    <h2>Title : {v.title}</h2>
                                    <img src={v.thumbnail} alt={v.title} />
                                    <p>Price : <b>${v.price}</b></p>
                                    <button type="button" onClick={(e) => setProductsArray([...productsArray, v])}>Add to cart</button>

                                </div>
                            )
                        })
                    }
                </section>
            </div>

            <div className="sidebar" ref={sidebarRef}>
                <p>
                    <MdClear className='clear' onClick={(e) => sidebarRef.current.style.display = "none"} />
                </p>

                {
                    productsArray?.map((v) => {
                        return (
                            <div className="card" key={v.id}>
                                <h2>Title : {v.title}</h2>
                                <img src={v.thumbnail} alt={v.title} />
                                <p>Price : <b>${v.price}</b></p>
                                <button type="button" onClick={(e) => {
                                    let d = productsArray.find((value) => {
                                        return value.id == v.id;
                                    })

                                   
                                }}>Remove from cart</button>

                            </div>
                        )
                    })
                }

            </div>
        </>
    )
}

export default Category1
