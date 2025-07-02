import React, { useEffect, useState } from 'react';

const NewProducts = () => {

  let [data, setData] = useState(null);

  useEffect(() => {
    window.fetch("https://fakestoreapi.com/products")
      .then(
        (data) => {
          data.json()
            .then(
              (products) => {
                // console.log(products);
                setData(products);
              },
              (error) => {
                console.log(error);
              },
            )
        },
        (error) => {
          console.log(error);
        },
      )
  }, []);

  return (
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
              data?.map((v, i) => {
                let { id, title, description, image, price } = v;
                return (
                  <tr key={i + 1}>
                    <td>{id}</td>
                    <td>
                      <img src={image} alt={title} />
                    </td>
                    <td>{title}</td>
                    <td>{description}</td>
                    <td>{price}</td>
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

export default NewProducts;
