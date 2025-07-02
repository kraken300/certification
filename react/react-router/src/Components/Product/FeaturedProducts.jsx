import axios from 'axios';
import React, { useEffect, useState } from 'react';

const FeaturedProducts = () => {

  let [data, setData] = useState(null);

  useEffect(() => {
    axios.get("https://dummyjson.com/products")
      .then(
        ({ data }) => {
          // console.log(data.products);
          setData(data.products);
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
                let { id, title, description, thumbnail, price } = v;
                return (
                  <tr key={i + 1}>
                    <td>{id}</td>
                    <td>
                      <img src={thumbnail} alt={title} />
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

export default FeaturedProducts;
