//! 18-06-2025
//? receiving props in CBC:
// import React, { Component } from 'react'

// export default class Child extends Component {
//     render() {
//         let { name, id } = this.props;

//         return (
//             <div>
//                 <h1>Name : {this.props.name}</h1>
//                 <h2>ID : {id}</h2>
//             </div>
//         )
//     }
// }

//? receiving props in FBC:
// import React from 'react';

// const Child = ({ name, id }) => {
//     return (
//         <div>
//             <h1>Name : {name}</h1>
//             <h2>id : {id}</h2>
//         </div>
//     )
// }

// export default Child;

//! 18-06-2025
//? Task : Send state value and updater function through the props and update the state value in the child component
// import React from 'react';
// const Child = ({ value, setValue }) => {

//     const handleClick = (e) => {
//         let randomNumber = Math.floor((Math.random() * 99) + 1);
//         setValue(randomNumber);
//     }

//     return (
//         <div>
//             <h2>Generate a random number between 1-100</h2>
//             <h1>Value : {value}</h1>
//             <button onClick={handleClick}>Change Value</button>
//         </div>
//     )
// }

// export default Child;

