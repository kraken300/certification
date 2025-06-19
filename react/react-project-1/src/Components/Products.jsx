import React from "react";
import "../App.css";

//! 18-06-2025
//? Task : Send products data (fake) from parent to child and render every data in child component
let Products = ({ products }) => {
    console.log(products);
    return (
        // <h1 style={{ color: "green" }}>Hello from the Products Component</h1>
        <div className="container">
            <section>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>IMAGE</th>
                            <th>TITLE</th>
                            <th>DESCRIPTION</th>
                            <th>PRICE</th>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            products?.map((v, i) => {
                                let { id, title, description, thumbnail, price } = v;
                                return (
                                    <tr key={i + 1}>
                                        <td>{id}</td>
                                        <td>
                                            <img src={thumbnail} alt={title} />
                                        </td>
                                        <td>{title}</td>
                                        <td>{description}</td>
                                        <td>₹ {price}</td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </table>
            </section>
        </div>
    )
}

export default Products;