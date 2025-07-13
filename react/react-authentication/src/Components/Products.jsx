import React from 'react'
import { NavLink, Outlet } from 'react-router-dom'

const Products = () => {
  return (
    <div>
      {/* <h1>Products</h1> */}

      <section className="product-container">
        <ul>
          <li>
            <NavLink to={"category1"}>Latest</NavLink>
          </li>
          <li>
            <NavLink to={"category2"}>Trending</NavLink>
          </li>
          <li>
            <NavLink to={"category3"}>Offer</NavLink>
          </li>
        </ul>
      </section>

      <Outlet />
    </div>
  )
}

export default Products
