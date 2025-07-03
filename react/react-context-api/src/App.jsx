import React, { useState } from 'react';
import Products from './Components/Products';

const App = () => {

  let [data, setData] = useState({
    name: "Samsung",
    price: 20000,
    color: "Black"
  });

  return (
    <>
      <Products data={data} />
    </>
  )
}

export default App;
