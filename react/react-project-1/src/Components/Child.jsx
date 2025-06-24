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

//! 19-06-2025
//? How to set the default value for the props in FBC:
// import React from 'react';

// const Child = ({ name, id, skills }) => {
//     return (
//         <div>
//             <h1>Name : {name || "NA"}</h1>
//             <h2>ID : {id || "NA"}</h2>
//             <ul>
//                 <h2>Skills: </h2>
//                 {
//                     skills?.map((v, i) => {
//                         return (
//                             <li key={i + 1}>
//                                 {v}
//                             </li>
//                         )
//                     }) || "NA"
//                 }
//             </ul>
//         </div>
//     )
// }

// export default Child;

//? How to set the default value for the props in CBC:
// import React, { Component } from 'react';

// export default class Child extends Component {

//     // static defaultProps = {
//     //     name: "NA",
//     //     id: "NA",
//     //     skills: "NA"
//     // }
//     render() {
//         console.log(this.props);
//         let { name, id, skills } = this.props;
//         return (
//             <div>
//                 <h1>Name : {name || "NA"}</h1>
//                 <h2>ID : {id || "NA"}</h2>
//                 <ul>
//                     <h2>Skills: </h2>
//                     {
//                         skills?.map((v, i) => {
//                             return (
//                                 <li key={i + 1}>
//                                     {v}
//                                 </li>
//                             )
//                         }) || "NA"
//                     }
//                 </ul>
//             </div>
//         )
//     }
// }

// Child.defaultProps = {
//     name: "NA",
//     id: "NA",
//     skills: "NA"
// }

//? props.children
// import React from 'react';

// const Child = ({ children }) => {
//     // console.log(this.props.children);
//     console.log(children);
//     return (
//         <div>
//             {children}
//         </div>
//     )
// }

// export default Child;

//? how to transfer the data from child to parent:
// import React from 'react';

// const Child = ({ handleData }) => {

//     const handleClick = () => {
//         handleData("hello world");
//     }

//     return (
//         <div>
//             <button onClick={handleClick}>Send data</button>
//         </div>
//     )
// }

// export default Child;

//! 24-06-2025
import React, { Component } from 'react'
export default class Child extends Component {
    constructor() {
        super();
        this.state = {
            count: 100
        }
        console.log("constructor Child");
    }

    static getDerivedStateFromProps(props, state) {
        console.log("getDerivedStateFromProps() Child");
        console.log(props, state);
        // return props;
        return { count: props.count };
    }

    componentDidMount() {
        console.log("componentDidMount() Child");
    }

    render() {
        console.log(this.state);
        console.log("render() Child");
        return (
            <h2>Hello World Child</h2>
        )
    }
}
