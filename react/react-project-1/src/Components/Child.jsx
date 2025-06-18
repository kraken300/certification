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
import React from 'react';

const Child = ({ name, id }) => {
    return (
        <div>
            <h1>Name : {name}</h1>
            <h2>id : {id}</h2>
        </div>
    )
}

export default Child;

