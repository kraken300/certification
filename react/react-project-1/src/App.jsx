//! 11-06-2025
//? class based component (stateful)

// import { Component } from "react";

// class App extends Component {
//     render() {
//         return (
//             <>
//                 <h1>Hello World</h1>
//                 <div>div content</div>
//             </>
//         )
//     }
// }

// export default App;

//? function based component (stateless)

// import React from "react";

// let App = () => {
//     return (
//         <h1>Hello World from function based component</h1>
//     )
// }

// export default App;

//? adding other components in App component (root component)
// import React from "react";
// import Header from "./Components/Header";
// import Products from "./Components/Products";

// class App extends React.Component {
//     render() {
//         return (
//             <>
//                 <h1 style={{ color: "red" }}>This is App Component (Root Component)</h1>
//                 <Header />
//                 <Products />
//             </>
//         )
//     }
// }

// export default App;

//! 12-06-2025
//? state in class based component
// import React from "react";

// class App extends React.Component {
// state = { name: "John", id: 123 };

//     constructor() {
//         super();
//         this.state = { name: "John", id: 123 };
//         console.log("constructor");
//         console.log(this);
//         console.log(this.state);
//     }

//     render() {
//         console.log("render()");
//         console.log(this);
//         console.log(this.state);
//         return (
//             <>
//                 <h1>name: {this.state.name}</h1>
//                 <h1>id: {this.state.id}</h1>
//             </>
//         )
//     }
// }

// export default App;

//? how to render the state value in JSX in class based component
// import React from "react";

// class App extends React.Component {

//     constructor() {
//         super();
//         this.state = {
//             employees: [
//                 {
//                     id: 11,
//                     name: "John",
//                     designation: "Developer"
//                 },
//                 {
//                     id: 12,
//                     name: "Mike",
//                     designation: "Tester"
//                 },
//                 {
//                     id: 13,
//                     name: "Smith",
//                     designation: "Analyst"
//                 },
//             ],
//             students: [
//                 {
//                     id: 21,
//                     name: "Allen",
//                     percentage: 80
//                 },
//                 {
//                     id: 22,
//                     name: "Steve",
//                     percentage: 90
//                 },
//                 {
//                     id: 23,
//                     name: "James",
//                     percentage: 85
//                 },
//             ]
//         }
//     }

//     render() {
//         return (
//             <>
//                 <div className="container">
//                     <h1 style={{ color: "red" }}>Employee Details</h1>
//                     <section>
//                         {
//                             this.state.employees.map((v, i) => {
//                                 let { id, name, designation } = v;
//                                 return (
//                                     <React.Fragment key={i + 1}>
//                                         <h2>ID : {id}</h2>
//                                         <h2>Name : {name}</h2>
//                                         <h2>Designation : {designation}</h2>
//                                         <hr />
//                                     </React.Fragment>
//                                 )
//                             })
//                         }
//                     </section>

//                     <h1 style={{ color: "blue" }}>Student Details</h1>
//                     <section>
//                         {
//                             this.state.students.map((v, i) => {
//                                 let { id, name, percentage } = v;
//                                 return (
//                                     <React.Fragment key={i + 1}>
//                                         <h2>ID : {id}</h2>
//                                         <h2>Name : {name}</h2>
//                                         <h2>Percentage : {percentage}</h2>
//                                         <hr />
//                                     </React.Fragment>
//                                 )
//                             })
//                         }
//                     </section>
//                 </div>
//             </>
//         )
//     }
// }

// export default App;

//? state in function based component
// import React, { useState } from "react";

// function App() {
//     let details = useState({ id: 10, name: "Mark", designation: "Tester" })
//     let id = useState(12);
//     let name = useState("Smith");
//     let [designation, setDesignation] = useState("Developer");

//     console.log(details);
//     console.log(id);
//     console.log(name);
//     console.log(designation);

//     return (
//         <>
//             <h1>Details</h1>
//             <h2>ID : {details[0].id}</h2>
//             <h2>Name : {details[0].name}</h2>
//             <h2>Designation : {details[0].designation}</h2>

//             <h2>ID : {id[0]}</h2>
//             <h2>Name : {name[0]}</h2>
//             <h2>Designation : {designation}</h2>
//         </>
//     )
// }

// export default App;

//? how to render the state value in JSX in function based component
// import React, { useState } from "react";

// const App = () => {

//     let data = {
//         employees: [
//             {
//                 id: 11,
//                 name: "John",
//                 designation: "Developer"
//             },
//             {
//                 id: 12,
//                 name: "Mike",
//                 designation: "Tester"
//             },
//             {
//                 id: 13,
//                 name: "Smith",
//                 designation: "Analyst"
//             },
//         ],
//         students: [
//             {
//                 id: 21,
//                 name: "Allen",
//                 percentage: 80
//             },
//             {
//                 id: 22,
//                 name: "Steve",
//                 percentage: 90
//             },
//             {
//                 id: 23,
//                 name: "James",
//                 percentage: 85
//             },
//         ]
//     }

//     const [details, setDetails] = useState(data);
//     return (
//         <>
//             <div className="container">
//                 <h1 style={{ color: "red" }}>Employee Details</h1>
//                 <section>
//                     {
//                         details.employees.map((v, i) => {
//                             let { id, name, designation } = v;

//                             return (
//                                 <React.Fragment key={i + 1}>
//                                     <h2>ID : {id}</h2>
//                                     <h2>Name : {name}</h2>
//                                     <h2>Designation : {designation}</h2>
//                                     <hr />
//                                 </React.Fragment>
//                             )
//                         })
//                     }
//                 </section>

//                 <h1 style={{ color: "blue" }}>Student Details</h1>
//                 <section>
//                     {
//                         details.students.map((v, i) => {
//                             let { id, name, percentage } = v;
//                             return (
//                                 <React.Fragment key={i + 1}>
//                                     <h2>ID : {id}</h2>
//                                     <h2>Name : {name}</h2>
//                                     <h2>Percentage : {percentage}</h2>
//                                     <hr />
//                                 </React.Fragment>
//                             )
//                         })
//                     }
//                 </section>
//             </div>
//         </>
//     )
// }

// export default App;

//! 13-06-2025
//? how to update the state value in class based component:
// import React from "react";

// class App extends React.Component {
//     constructor() {
//         super();
//         this.state = {
//             name: "abc",
//             id: 120
//         }
//     }

//     render() {
//         let { name, id } = this.state;
//         console.log(this);

//         setTimeout(() => this.setState({ name: "xyz", id: 300 }), 5000);
//         return (
//             <div className="container">
//                 <h1>Name : {name}</h1>
//                 <h2>ID : {id}</h2>
//             </div>
//         )
//     }
// }

// export default App;

//? how to update the state value in function based component:
// import React, { useState } from 'react'

// const App = () => {

//     // let [state, setState] = React.useState({name:"abcd", id:120});
//     let [name, setName] = useState("abc");
//     let [id, setId] = useState(120);

//     setTimeout(() => {
//         // setState({name:"xyz", id:300});
//         setName("xyz");
//         setId(300);
//     }, 4000);

//     return (
//         <div className='container'>
//             <h1>Name : {name}</h1>
//             <h1>ID : {id}</h1>
//         </div>
//     )
// }

// export default App;

//? count example by taking function as an argument for updater function:
// import React, { useState } from 'react'

// const App = () => {

//     let [count, setCount] = useState(0);
//     const handleClick = (e) => {
//         setCount((prev) => prev + 1);
//         setCount((prev) => prev + 1);

//         // setCount(count + 1);
//         // setCount(count + 1);
//     }
//     return (
//         <div className="container">
//             <h1 onClick={handleClick}>Count : {count}</h1>
//         </div>
//     )
// }

// export default App;

//? count example by taking function as an argument for this.setState() function:
// import React, { Component } from 'react';

// class App extends Component {
//     constructor() {
//         super();
//         this.state = {
//             count: 0
//         };
//     }

//     handleClick = (e) => {
//         this.setState((prev) => {
//             console.log(prev);
//             return { count: prev.count + 1 }
//         })
//     }

//     render() {
//         return (
//             <div className="container">
//                 <h1 onClick={this.handleClick}>Count : {this.state.count}</h1>
//             </div>
//         )
//     }
// }

// export default App;

//! 17-06-2025
//? Rendering json data in JSX
// import React, { useState } from 'react';
// import { products, demo } from "./products.json";
// import "./App.css";

// const App = () => {

//   let [data, setData] = useState(products);
//   setTimeout(() => setData(demo), 5000);
//   return (
//     <div className="container">
//       <section>
//         <table>
//           <thead>
//             <tr>
//               <th>ID</th>
//               <th>IMAGE</th>
//               <th>TITLE</th>
//               <th>DESCRIPTION</th>
//               <th>PRICE</th>
//             </tr>
//           </thead>

//           <tbody>
//             {
//               data?.map((v, i) => {
//                 let { id, title, description, price, image, thumbnail } = v;
//                 return (
//                   <tr key={i + 1}>
//                     <td>{id}</td>
//                     <td>
//                       <img src={thumbnail || image} alt={id} />
//                     </td>
//                     <td>{title}</td>
//                     <td>{description}</td>
//                     <td>{price}</td>
//                   </tr>
//                 )
//               })
//             }
//           </tbody>
//         </table>
//       </section>
//     </div>
//   )
// }

// export default App;

//? faker-js/faker package
// import React, { useState } from 'react';
// import { faker } from '@faker-js/faker';

// const App = () => {

//   let [data, setData] = useState(faker.image.avatar);

//   const handleClick = (e) => {
//     setData(faker.image.avatar)
//   }

//   console.log(data);
//   return (
//     <div>
//       <img src={data} alt="image" height={"400px"} width={"400px"} />
//       <button onClick={handleClick}>Get Image</button>
//     </div>
//   )
// }

// export default App;

//! 18-06-2025
//? increment, decrement, reset example using function based component
// import React, { useState } from "react";

// const App = () => {
//   let [count, setCount] = useState(0);

//   // const increment = (e) => setCount(count + 1);
//   const increment = (e) => setCount((prev) => prev + 1);
//   // const decrement = (e) => setCount(count - 1);
//   const decrement = (e) => setCount(function (prev) {
//     return prev - 1;
//   });
//   const reset = (e) => setCount(0);

//   return (
//     <div>
//       <h1>Count : {count}</h1>
//       <button onClick={increment}>Increment</button>
//       <button onClick={decrement}>Decremenet</button>
//       <button onClick={reset}>Reset</button>
//     </div>
//   )
// }

// export default App;

//? Sending props in FBC
// import React from 'react';
// import Child from './Components/Child';

// const App = () => {
//   return (
//     <div>
//       <Child name="JOHN" id={1} />
//       <Child name="SMITH" id={2} />
//       <Child name="MIKE" id={3} />
//     </div>
//   )
// }

// export default App;

//? Sending props in CBC
// import React, { Component } from 'react';
// import Child from './Components/Child';

// export default class App extends Component {
//   render() {
//     return (
//       <div>
//         <Child name="JOHN" id={1} />
//         <Child name="SMITH" id={2} />
//         <Child name="MIKE" id={3} />
//       </div>
//     )
//   }
// }

//! 19-06-2025
//? Task : increment, decrement, reset example using class based component
// import React from "react";

// class App extends React.Component {
//   constructor() {
//     super();
//     this.state = {
//       count: 0
//     }
//   }

//   increment = (e) => {
//     this.setState((prev) => {
//       // console.log(prev);
//       return { count: prev.count + 1 };
//     })
//   }

//   decrement = (e) => {
//     this.setState({ count: this.state.count - 1 });
//   }

//   reset = (e) => {
//     this.setState({ count: 0 });
//   }

//   // decrement(e) {
//   //   this.setState({ count: this.state.count - 1 });
//   // }

//   // reset(e) {
//   //   this.setState({ count: 0 });
//   // }

//   render() {
//     return (
//       <div>
//         <h1>Count  : {this.state.count}</h1>
//         <button onClick={this.increment}>Increment</button>
//         <button onClick={this.decrement}>Decrement</button>
//         <button onClick={this.reset}>Reset</button>
//       </div>
//     )
//   }
// }

// export default App;

//? Task : Send products data (fake) from parent to child and render every data in child component
// import React, { useState } from 'react';
// import { products } from "./products.json";
// import Products from './Components/Products';

// const App = () => {
//   let [data, setData] = useState(products);

//   return (
//     <>
//       <Products products={data} />
//     </>
//   )
// }

// export default App;

//? Task : Send state value and updater function through the props and update the state value in the child component
// import React, { useState } from 'react';
// import Child from './Components/Child';

// const App = () => {
//   let [value, setValue] = useState(0);

//   return (
//     <div>
//       <Child value={value} setValue={setValue} />
//     </div>
//   )
// }

// export default App;

