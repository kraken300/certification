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

//! 19-06-2025
//? How to set the default value for the props
// import React, { Component } from 'react'
// import Child from './Components/Child'

// export default class App extends Component {
//   render() {
//     return (
//       <div>
//         <Child id={120} skills={["js", "java"]} />
//         <Child name={"Bob"} skills={["react", "node"]} />
//         <Child name={"David"} id={140} />
//       </div>
//     )
//   }
// }

//? props.children
// import React from 'react';
// import Child from './Components/Child';

// const App = () => {
//   return (
//     <div>
//       <Child>
//         <h1>Name : Sachin</h1>
//         <h2>ID : 123</h2>
//       </Child>

//       <Child>
//         <h1>Name : Dhoni</h1>
//         <h2>ID : 07</h2>
//       </Child>

//       <Child>
//         <h1>Name : Virat</h1>
//         <h2>ID : 80</h2>
//       </Child>
//     </div>
//   )
// }

// export default App

// //? How to transfer the data from child to parent:
// import React, { useState } from 'react';
// import Child from './Components/Child';

// const App = () => {
//   let [text, setText] = useState("");

//   function handleData(data) {
//     setText(data);
//   }
//   return (
//     <div>
//       <h1>Parent Text : {text}</h1>
//       <Child handleData={handleData} />
//     </div>
//   )
// }

// export default App;

//! 20-06-2025
//? Conditional Rendering
//? if else
// import React, { useState } from 'react';

// const App = () => {

//     let [logIn, setLogIn] = useState(false);

//     if (logIn) {
//         return (
//             <div className="container">
//                 <section>
//                     <ul>
//                         <li>HOME</li>
//                         <li>PRODUCTS</li>
//                         <li>ABOUT US</li>
//                         <li>CONTACT</li>
//                         <li>Name : Sachin</li>
//                     </ul>

//                     <aside>
//                         <button onClick={(e) => setLogIn(false)}>Logout</button>
//                     </aside>
//                 </section>
//             </div>
//         )
//     }
//     else {
//         return (
//             <div className="container">
//                 <section>
//                     <ul>
//                         <li>HOME</li>
//                         <li>PRODUCTS</li>
//                         <li>ABOUT US</li>
//                         <li>CONTACT</li>
//                     </ul>

//                     <aside>
//                         <button onClick={(e) => setLogIn(true)}>Login</button>
//                     </aside>
//                 </section>
//             </div>
//         )
//     }
// }

// export default App;

//? switch case
// import React, { useState } from 'react';

// const App = () => {
//     let [logIn, setLogIn] = useState(false);
//     switch (logIn) {
//         case true: {
//             return (
//                 <div className="container">
//                     <section>
//                         <ul>
//                             <li>HOME</li>
//                             <li>PRODUCTS</li>
//                             <li>ABOUT US</li>
//                             <li>CONTACT</li>
//                             <li>Name : Sachin</li>
//                         </ul>

//                         <aside>
//                             <button onClick={(e) => setLogIn(false)}>Logout</button>
//                         </aside>
//                     </section>
//                 </div>

//             )
//         }
//         case false: {
//             return (
//                 <div className="container">
//                     <section>
//                         <ul>
//                             <li>HOME</li>
//                             <li>PRODUCTS</li>
//                             <li>ABOUT US</li>
//                             <li>CONTACT</li>
//                         </ul>

//                         <aside>
//                             <button onClick={(e) => setLogIn(true)}>Login</button>
//                         </aside>
//                     </section>
//                 </div>
//             )
//         }
//     }
// }

// export default App;

//? ternary operator and && operator
// import React, { useState } from 'react';
// import { FaBell } from 'react-icons/fa';
// import "./App.css";

// const App = () => {
//     let [logIn, setLogIn] = useState(false);
//     let [notifications, setNotifications] = ([
//         "ABC", "XYZ", "LMN"
//     ]);

//     const IsUser = () => {
//         return (
//             <>
//                 <div className="container" >
//                     <section>
//                         <ul>
//                             <li>HOME</li>
//                             <li>PRODUCTS</li>
//                             <li>ABOUT US</li>
//                             <li>CONTACT</li>
//                             <li>Name : Sachin</li>
//                         </ul>

//                         <aside>
//                             <button onClick={(e) => setLogIn(false)}>Logout</button>
//                         </aside>
//                     </section>
//                 </div >
//             </>
//         )
//     }

//     const IsGuest = () => {
//         return (
//             <>
//                 <div className="container" >
//                     <section>
//                         <ul>
//                             <li>HOME</li>
//                             <li>PRODUCTS</li>
//                             <li>ABOUT US</li>
//                             <li>CONTACT</li>
//                         </ul>

//                         <aside>
//                             <button onClick={(e) => setLogIn(true)}>Login</button>
//                             <FaBell className="bell" style={{ fontSize: "20px" }} />
//                             <sup style={{fontSize:"20px"}}>{notifications.length > 0 && notifications.length}</sup>
//                         </aside>
//                     </section>
//                 </div >
//             </>
//         )
//     }

//     return (
//         <>
//             {logIn ? <IsUser /> : <IsGuest />}
//             <div className={logIn ? "active" : "inactive"}>{logIn ? "Active" : "Inactive"}</div>
//         </>
//     )
// }

// export default App;

//! 21-06-2025
//? ref in CBC:
// import React, { Component } from "react";

// class App extends Component {

//     constructor() {
//         super();
//         this.divRef = React.createRef();
//     }

//     render() {
//         console.log(this.divRef.current)

//         setTimeout(() => {
//             // document.querySelector("h1").style.color = "red";
//             this.divRef.current.style.color = "red";
//             console.log(this.divRef.current);
//         }, 4000);

//         return (
//             <h1 ref={this.divRef}>Hello World</h1>
//         )
//     }
// }

// export default App;

//? ref in FBC:
// import React from 'react';

// const App = () => {

//     let h1Ref = React.useRef();

//     console.log(h1Ref);

//     setTimeout(() => {
//         h1Ref.current.style.color = "blue";
//         console.log(h1Ref);
//         console.log(h1Ref.current);
//     }, 4000);

//     return (
//         <h1 ref={h1Ref}>Hello World</h1>
//     )
// }

// export default App;

//? How to manage the focus using ref:
// import React, { useRef } from 'react';

// const App = () => {

//     let inputRef = useRef(null);

//     let handleClick = (e) => {
//         inputRef.current.focus();
//         inputRef.current.style.background = "green";
//     }

//     return (
//         <div>
//             <input type="text" name="username" id="username" placeholder="Enter Username" ref={inputRef} />
//             <button onClick={handleClick}>Login</button>
//         </div>
//     )
// }

// export default App;

//? How to control the media player using ref:
// import React, { useRef, useState } from 'react';
// // import video from "../public/videos/video.mp4";

// const App = () => {
//     let [play, setPlay] = useState(false);
//     let videoRef = useRef(null);

//     let handleClick = (e) => {
//         setPlay(!play);
//         if (play) {
//             videoRef.current.play();
//         }
//         else {
//             videoRef.current.pause();
//         }
//     }

//     return (
//         <div>
//             <video src={"/videos/video.mp4"} height={"500px"} width={"500px"} ref={videoRef} onClick={handleClick}></video>
//         </div>
//     )
// }

// export default App;

//? Uncontrolled Component (CBC):
// import React, { Component } from 'react'

// export default class App extends Component {

//     constructor() {
//         super();
//         this.formRef = React.createRef();
//         this.usernameRef = React.createRef();
//         this.passwordRef = React.createRef();
//     }

//     handleSubmit = (e) => {
//         e.preventDefault();
//         // let user = this.usernameRef.current.value;
//         // let pass = this.passwordRef.current.value;
//         // console.log("Username :" + user);
//         // console.log("Password :" + pass);

//         let formData = new FormData(this.formRef.current);
//         let finalData = Object.fromEntries(formData);
//         console.log(finalData);
//     }

//     render() {
//         return (
//             <div className="demo">
//                 <form onSubmit={this.handleSubmit} ref={this.formRef}>
//                     <input type="text" name="username" id="username" placeholder="Enter username" ref={this.usernameRef} />
//                     <input type="password" name="password" id="password" placeholder="Enter password" ref={this.passwordRef} />
//                     {/* <button onClick={handleSubmit}>Submit</button> */}
//                     <button type="submit">Submit</button>
//                 </form>
//             </div>
//         )
//     }
// }

//? Uncontrolled Component (FBC):
// import React, { useRef } from 'react';

// const App = () => {

//     let usernameRef = React.useRef(null);
//     let passwordRef = useRef(null);
//     let formRef = useRef(null);

//     let handleSubmit = (e) => {
//         e.preventDefault();
//         // let username = usernameRef.current.value;
//         // let password = passwordRef.current.value;
//         // let data = { username, password };
//         // console.log(data);

//         let formData = new FormData(formRef.current);
//         let finalData = Object.fromEntries(formData);
//         console.log(finalData);
//     }

//     return (
//         <div className="container">
//             <form onSubmit={handleSubmit} ref={formRef}>
//                 <input type="text" name="username" id="username" ref={usernameRef} placeholder="Enter username" />
//                 <input type="password" name="password" id="password" ref={passwordRef} placeholder="Enter password" />
//                 {/* <button type="submit" onClick={handleSubmit}>Submit</button> */}
//                 <button type="submit">Submit</button>
//             </form>
//         </div>
//     )
// }

// export default App;

//? Controlled Component (FBC):
// import React, { useState } from "react";

// const App = () => {

//     let [username, setUsername] = useState("");
//     let [password, setPassword] = useState("");

//     let handleSubmit = (e) => {
//         e.preventDefault();
//         let data = { username, password };
//         console.log(data);
//     }

//     let handleUsername = (e) => {
//         setUsername(e.target.value);
//     }

//     // let handlePassword = (e) => {
//     //     setPassword(e.target.value);
//     // }

//     return (
//         <div>
//             <form onSubmit={handleSubmit}>
//                 <input type="text" name="username" id="username" value={username} onChange={handleUsername} placeholder="Enter username" />
//                 <input type="password" name="password" id="password" value={password} onChange={(e) => setPassword(e.target.value)} placeholder="Enter password" />
//                 <button type="submit">Submit</button>
//             </form>
//         </div>
//     )
// }

// export default App;

//? TASK: Uncontrolled Component (FBC):
// import React, { useRef, useState } from 'react';
// import countries from "./countries.json";

// const App = () => {

//     let formRef = useRef(null);
//     let usernameRef = React.useRef(null);
//     let passwordRef = useRef(null);
//     let emailRef = useRef(null);
//     let dobRef = useRef(null);
//     // let percentageRef = useRef(10);

//     let genderMaleRef = useRef();
//     let genderFemaleRef = useRef();
//     let genderOthersRef = useRef();

//     let javaRef = useRef(null);
//     let pythonRef = useRef(null);
//     let sqlRef = useRef(null);
//     let javascriptRef = useRef(null);

//     let optionRef = useRef(null);

//     let textAreaRef = useRef(null);

//     let handleSubmit = (e) => {
//         e.preventDefault();

//         // let formData = new FormData(formRef.current);
//         // // console.log(formData.getAll("skills"));
//         // let data = Object.fromEntries(formData);
//         // let finalData = { ...data, skills: formData.getAll("skills") };
//         // console.log(finalData);

//         let username = usernameRef.current.value;
//         let password = passwordRef.current.value;
//         let email = emailRef.current.value;
//         let dob = dobRef.current.value;
//         // let percentage = percentageRef.current.value;

//         let gender = genderMaleRef.current.checked ? "male" : genderFemaleRef.current.checked ? "female" : genderOthersRef.current.checked ? "others" : "";

//         let skillsArr = [];
//         javaRef.current.checked && skillsArr.push(javaRef.current.value);
//         pythonRef.current.checked && skillsArr.push(pythonRef.current.value);
//         sqlRef.current.checked && skillsArr.push(sqlRef.current.value);
//         javascriptRef.current.checked && skillsArr.push(javascriptRef.current.value);

//         // console.log(optionRef.current.value);
//         let country = optionRef.current.value

//         let textArea = textAreaRef.current.value;

//         let finalData = {
//             username, password, email, dob, gender, skillsArr, country, textArea
//         }

//         console.log(finalData);
//     }

//     return (
//         <div className="container">
//             <form onSubmit={handleSubmit} ref={formRef}>

//                 <input type="text" name="username" id="username" placeholder="Enter username" ref={usernameRef} /> <br />

//                 <input type="password" name="password" id="password" placeholder="Enter password" ref={passwordRef} /> <br />

//                 <input type="email" name="email" id="email" placeholder="Enter email" ref={emailRef} /> <br />

//                 <input type="date" name="dob" id="dob" placeholder="Enter dob" ref={dobRef} /> <br />

//                 {/* <label htmlFor="percentage">Select percentage : </label> */}
//                 {/* <input type="range" name="percentage" id="percentage" ref={percentageRef} /> <br /><span>{percentageRef.current}</span><br/> */}

//                 <label htmlFor="gender">Select Gender : </label>
//                 <div className="gender" id="gender">
//                     <input type="radio" name="gender" id="male" value={"male"} ref={genderMaleRef} /><span>Male</span>
//                     <input type="radio" name="gender" id="female" value={"female"} ref={genderFemaleRef} /><span>Female</span>
//                     <input type="radio" name="gender" id="others" value={"others"} ref={genderOthersRef} /><span>Others</span>
//                 </div>
//                 <br />

//                 <label htmlFor="skills">Select skills : </label>
//                 <input type="checkbox" name="skills" id="java" value={"java"} ref={javaRef} /><span>Java</span>
//                 <input type="checkbox" name="skills" id="python" value={"python"} ref={pythonRef} /><span>Python</span>
//                 <input type="checkbox" name="skills" id="sql" value={"sql"} ref={sqlRef} /><span>SQL</span>
//                 <input type="checkbox" name="skills" id="javascript" value={"javascript"} ref={javascriptRef} /><span>Javascript</span>
//                 <br />

//                 <label htmlFor="country">Select country : </label>
//                 <select name="country" id="country" ref={optionRef}>
//                     {
//                         countries?.map((v, i) => {
//                             return (
//                                 <option key={i + 1} value={v.name}>{v.name}</option>
//                             )
//                         })
//                     }
//                 </select>
//                 <br />

//                 <textarea name="comment" id="comment" cols="30" rows="8" placeholder="Enter comment" ref={textAreaRef}></textarea>
//                 <br />

//                 {/* <button type="submit" onClick={handleSubmit}>Submit</button> */}
//                 <button type="submit">Submit</button>
//             </form>
//         </div>
//     )
// }

// export default App;

//! 23-06-2025
//? Controlled Component (CBC):
// import React, { Component } from 'react';
// import countries from "./countries.json";

// class App extends Component {

//     constructor() {
//         super();
//         this.state = {
//             username: "",
//             email: "",
//             password: "",
//             dob: "",
//             gender: "",
//             skills: [],
//             percentage: 10,
//             country: "",
//             comment: ""
//         }
//         // this.userRef = React.createRef();
//     }

//     handleChange = (e) => {
//         console.log(e.target.name + " : " + e.target.value);

//         let { name, value } = e.target;

//         this.setState({ ...this.state, [name]: value });
//     }

//     handleSkillsChange = (e) => {
//         let { name, value } = e.target;

//         if (this.state.skills.includes(value) == false) {
//             this.state.skills.push(value);
//         }

//         else if (this.state.skills.includes(value) === true) {
//             let index = this.state.skills.indexOf(value);
//             this.state.skills.splice(index, 1);
//         }
//         console.log(this.state.skills);
//     }

//     handleSubmit = (e) => {
//         e.preventDefault();
//         console.log(this.state);
//     }

//     render() {
//         return (
//             <div className="container">
//                 <form onSubmit={this.handleSubmit}>

//                     <input type="text" name="username" id="username" placeholder="Enter username" value={this.state.username} onChange={this.handleChange} /> <br />

//                     <input type="password" name="password" id="password" placeholder="Enter password" value={this.state.password} onChange={this.handleChange} /> <br />

//                     <input type="email" name="email" id="email" placeholder="Enter email" value={this.state.email} onChange={this.handleChange} /> <br />

//                     <input type="date" name="dob" id="dob" placeholder="Enter dob" value={this.state.dob} onChange={this.handleChange} /> <br />

//                     <label htmlFor="percentage">Select Percentage : </label>
//                     <input type="range" name="percentage" id="percentage" value={this.state.percentage} onChange={this.handleChange} min={1} max={100} /> <span>{this.state.percentage}</span> <br />

//                     <label htmlFor="gender">Select Gender : </label>
//                     <div className="gender" id="gender" value={this.state.gender} onChange={this.handleChange}>
//                         <input type="radio" name="gender" id="male" value={"male"} /><span>Male</span>
//                         <input type="radio" name="gender" id="female" value={"female"} /><span>Female</span>
//                         <input type="radio" name="gender" id="others" value={"others"} /><span>Others</span>
//                     </div><br />

//                     <label htmlFor="skills">Select skills : </label>
//                     <div className="skills" id="skills" onChange={this.handleSkillsChange}>
//                         <input type="checkbox" name="skills" id="java" value={"java"} /><span>Java</span>
//                         <input type="checkbox" name="skills" id="python" value={"python"} /><span>Python</span>
//                         <input type="checkbox" name="skills" id="sql" value={"sql"} /><span>SQL</span>
//                         <input type="checkbox" name="skills" id="javascript" value={"javascript"} /><span>Javascript</span>
//                     </div>
//                     <br />

//                     <label htmlFor="country">Select country : </label>
//                     <select name="country" id="country" value={this.state.country} onChange={this.handleChange}>
//                         {
//                             countries?.map((v, i) => {
//                                 return (
//                                     <option key={i + 1} value={v.name}>{v.name}</option>
//                                 )
//                             })
//                         }
//                     </select>
//                     <br />

//                     <textarea name="comment" id="comment" cols="30" rows="8" placeholder="Enter comment" value={this.state.comment} onChange={this.handleChange}></textarea>
//                     <br />

//                     {/* <button type="submit" onClick={handleSubmit}>Submit</button> */}
//                     <button type="submit">Submit</button>
//                 </form>
//             </div>
//         )
//     }
// }

// export default App;

//? Controlled Component (FBC):
// import React, { useState } from 'react';
// import countries from "./countries.json";

// const App = () => {

//     let [data, setData] = useState({
//         username: "",
//         email: "",
//         password: "",
//         dob: "",
//         gender: "",
//         skills: [],
//         percentage: 10,
//         country: "",
//         comment: ""
//     });

//     let handleChange = (e) => {
//         let { name, value } = e.target;
//         setData({ ...data, [name]: value });
//     }

//     let handleSkillsChange = (e) => {
//         let { name, value } = e.target;

//         if (data.skills.includes(value) == false) data.skills.push(value);
//         else if (data.skills.includes(value) == true) {
//             let index = data.skills.indexOf(value);
//             data.skills.splice(index, 1);
//         }
//         console.log(data.skills);
//     }

//     let handleSubmit = (e) => {
//         e.preventDefault();
//         console.log(data);
//     }

//     return (
//         <div className="container">
//             <form onSubmit={handleSubmit}>

//                 <input type="text" name="username" id="username" placeholder="Enter username" value={data.username} onChange={handleChange} /> <br />

//                 <input type="password" name="password" id="password" placeholder="Enter password" value={data.password} onChange={handleChange} /> <br />

//                 <input type="email" name="email" id="email" placeholder="Enter email" value={data.email} onChange={handleChange} /> <br />

//                 <input type="date" name="dob" id="dob" placeholder="Enter dob" value={data.dob} onChange={handleChange} /> <br />

//                 <label htmlFor="percentage">Select Percentage : </label>
//                 <input type="range" name="percentage" id="percentage" value={data.percentage} onChange={handleChange} min={1} max={100} /> <span>{data.percentage}</span> <br />

//                 <label htmlFor="gender">Select Gender : </label>
//                 <div className="gender" id="gender" value={data.gender} onChange={handleChange}>
//                     <input type="radio" name="gender" id="male" value={"male"} /><span>Male</span>
//                     <input type="radio" name="gender" id="female" value={"female"} /><span>Female</span>
//                     <input type="radio" name="gender" id="others" value={"others"} /><span>Others</span>
//                 </div><br />

//                 <label htmlFor="skills">Select skills : </label>
//                 <div className="skills" id="skills" onChange={handleSkillsChange}>
//                     <input type="checkbox" name="skills" id="java" value={"java"} /><span>Java</span>
//                     <input type="checkbox" name="skills" id="python" value={"python"} /><span>Python</span>
//                     <input type="checkbox" name="skills" id="sql" value={"sql"} /><span>SQL</span>
//                     <input type="checkbox" name="skills" id="javascript" value={"javascript"} /><span>Javascript</span>
//                 </div>
//                 <br />

//                 <label htmlFor="country">Select country : </label>
//                 <select name="country" id="country" value={data.country} onChange={handleChange}>
//                     {
//                         countries?.map((v, i) => {
//                             return (
//                                 <option key={i + 1} value={v.name}>{v.name}</option>
//                             )
//                         })
//                     }
//                 </select>
//                 <br />

//                 <textarea name="comment" id="comment" cols="30" rows="8" placeholder="Enter comment" value={data.comment} onChange={handleChange}></textarea>
//                 <br />

//                 {/* <button type="submit" onClick={handleSubmit}>Submit</button> */}
//                 <button type="submit">Submit</button>
//             </form>
//         </div>
//     )
// }

// export default App;

//! 24-06-2025
//? Lifecycle Methods in Class Based Component:
//? Mounting Phase

// import React, { Component } from "react";
// import Child from "./Components/Child";

// class App extends Component {
//     constructor() {
//         super();
//         this.state = {
//             count: 0
//         }
//         console.log("constructor Parent");
//     }

//     static getDerivedStateFromProps() {
//         console.log("getDerivedStateFromProps() Parent");
//         return null;
//     }

//     componentDidMount() {
//         console.log("componentDidMount() Parent");
//         let h1 = document.querySelector(".heading");
//         h1.style.color = "orange";
//     }

//     render() {
//         console.log("render() Parent");
//         return (
//             <>
//                 <h1 className="heading">Hello World Parent</h1>
//                 <Child count={this.state.count} />
//             </>
//         )
//     }

// }

// export default App;

//? Fetching products data using axios library
// import React, { Component } from 'react';
// import axios from 'axios';
// import "./App.css";

// class App extends Component {

//     constructor() {
//         super();
//         this.state = {
//             products: null
//         }
//     }

//     componentDidMount() {
//         axios.get("https://fakestoreapi.com/products")
//             .then(
//                 (data) => {
//                     console.log(data.data);
//                     this.setState({ products: data.data });
//                 },
//                 (error) => {
//                     console.log(error)
//                 }
//             )
//     }

//     render() {
//         console.log(this.state.products);
//         return (
//             <div className="container">
//                 <section>
//                     <table>
//                         <thead>
//                             <tr>
//                                 <th>ID</th>
//                                 <th>IMAGE</th>
//                                 <th>TITLE</th>
//                                 <th>DESCRIPTION</th>
//                                 <th>PRICE</th>
//                             </tr>
//                         </thead>

//                         <tbody>
//                             {
//                                 this.state.products?.map((v, i) => {
//                                     let { id, title, description, image, price } = v;
//                                     return (
//                                         <tr key={i + 1}>
//                                             <td>{id}</td>
//                                             <td>
//                                                 <img src={image} alt={title} />
//                                             </td>
//                                             <td>{title}</td>
//                                             <td>{description}</td>
//                                             <td>{price}</td>
//                                         </tr>
//                                     )
//                                 })
//                             }
//                         </tbody>
//                     </table>
//                 </section>
//             </div>
//         )
//     }
// }

// export default App;

//! 25-06-2025
//? Updating Phase
// import React, { Component } from 'react';

// export default class App extends Component {

//     constructor() {
//         super();
//         console.log("constructor");
//         this.state = {
//             count: 0
//         }
//     }

//     static getDerivedStateFromProps() {
//         console.log("getDerivedStateFromProps method");
//         return null;
//     }

//     componentDidMount() {
//         console.log("componentDidMount method");
//     }

//     //? Updating phase methods:
//     shouldComponentUpdate() {
//         console.log("shouldComponentUpdate method");
//         return true;
//     }

//     getSnapshotBeforeUpdate(prevProp, prevState) {
//         console.log("getSnapshotBeforeUpdate method");
//         return [prevProp, prevState];
//     }

//     componentDidUpdate(prop, state, snapShot) {
//         console.log("componentDidUpdate");
//         console.log(snapShot);
//     }

//     render() {
//         console.log("render method");
//         return (
//             <div>
//                 <h1 onMouseOver={(e) => this.setState({ count: this.state.count + 1 })}>
//                     COUNT : {this.state.count}
//                 </h1>
//             </div>
//         )
//     }
// }

//? Unmounting Phase
// import React, { Component } from 'react';
// import Child from './Components/Child';

// export default class App extends Component {

//     constructor() {
//         super();
//         this.state = {
//             count: 0
//         }
//     }

//     render() {
//         return (
//             <>
//                 <div>{this.state.count <= 5 ? <Child count={this.state.count} /> : null}</div>
//                 <button type="button" onClick={(e) => this.setState({ count: this.state.count + 1 })}>Increment</button>
//             </>
//         )
//     }
// }

//! 26-06-2025
//? useEffect()
//? Mounting phase : API Data Fetching
// import React, { useEffect, useState } from "react";
// import axios from "axios";
// import "./App.css";

// const App = () => {

//     let [products, setProducts] = useState(null);

//     React.useEffect(() => {
//         //    let h1 = document.querySelector(".head");
//         //    h1.style.background = "green";

//         axios.get("https://dummyjson.com/products")
//             .then(
//                 (data) => {
//                     console.log(data.data.products);
//                     setProducts(data.data.products);
//                 },
//                 (error) => {
//                     console.log(error);
//                 }
//             )
//     }, []);

//     return (
//         // <h1>Hello World {console.log("jsx rendered")}</h1>
//         <div className="container">
//             <section>
//                 <table>
//                     <thead>
//                         <tr>
//                             <th>ID</th>
//                             <th>IMAGE</th>
//                             <th>TITLE</th>
//                             <th>DESCRIPTION</th>
//                             <th>PRICE</th>
//                         </tr>
//                     </thead>

//                     <tbody>
//                         {
//                             products?.map((v, i) => {
//                                 let { id, title, description, thumbnail, price } = v;
//                                 return (
//                                     <tr key={i + 1}>
//                                         <td>{id}</td>
//                                         <td>
//                                             <img src={thumbnail} alt={title} />
//                                         </td>
//                                         <td>{title}</td>
//                                         <td>{description}</td>
//                                         <td>{price}</td>
//                                     </tr>
//                                 )
//                             })
//                         }
//                     </tbody>
//                 </table>
//             </section>
//         </div>
//     )
// }

// export default App;

//? Updating phase : 
// import React, { useEffect, useState } from 'react';

// const App = () => {
//     let [count, setCount] = useState(0);
//     let [dark, setDark] = useState(false);

//     useEffect(() => {
//         console.log("hello");
//         console.log("bye");
//     }, [count]);

//     return (
//         <div>
//             <h1 onMouseOver={(e) => { setCount(p => p + 1) }} style={{
//                 background: dark ? "#000" : "#fff",
//                 color: dark ? "#fff" : "#000"
//             }}>
//                 Count : {count}
//             </h1>

//             <button type="button" onClick={(e) => { setDark(p => !p) }}>change color</button>
//         </div>
//     )
// }

// export default App;

//! 27-06-2025
//? Unmounting Phase
// import React, { useEffect, useState } from 'react';
// import Child from './Components/Child';

// const App = () => {
//     let [count, setCount] = useState(0);

//     useEffect(() => {
//         console.log("parent mounted");
//     }, []);
//     return (
//         <div>
//             {console.log("parent render()")}
//             {count <= 5 ? <Child count={count} /> : null}
//             <button type="button" onClick={(e) => { setCount(p => p + 1) }}>Increment</button>
//         </div>
//     )
// }

// export default App;

//? useReducer()
// import React, { useReducer } from 'react';

// let initialValue = 0;

// let reducer = (state, { type }) => {
//     switch (type) {
//         case "Increment":
//             return state + 1;
//         case "Decrement":
//             return state - 1;
//         case "Reset":
//             return initialValue;
//         default:
//             return state;
//     }
// }

// const App = () => {
//     let [count, dispatch] = useReducer(reducer, initialValue);
//     return (
//         <div>
//             <h1>Count : {count}</h1>

//             <button type="button" onClick={(e) => dispatch({ type: "Increment" })}>Increment</button>
//             <button type="button" onClick={(e) => dispatch({ type: "Decrement" })}>Decremenet</button>
//             <button type="button" onClick={(e) => dispatch({ type: "Reset" })}>Reset</button>
//         </div>
//     )
// }

// export default App;

//! 04-07-2025
//? useMemo() hook:
import React, { useMemo, useState } from 'react';

function slowFunction(num) {
    for (let i = 0; i <= 1000000000; i++) { }
    return num * 2;
}

const App = () => {

    const [count, setCount] = useState(0);
    const [dark, setDark] = useState(false);

    let doubleNumber = useMemo(() => {
        return slowFunction(count);
    }, [count]);

    return (
        <div>
            <input type="number" name="number" id="number" placeholder='Enter number' value={count} onChange={(e) => setCount(e.target.value)} />

            <button type="button" onClick={(e) => setDark(p => !p)}>Change background</button>

            <h1
                style={{
                    background: dark ? "#000" : "#fff",
                    color: dark ? "#fff" : "#000"
                }}>{doubleNumber}</h1>
        </div>

    )
}

export default App;
