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
import React, { useState } from "react";

const App = () => {

    let data = {
        employees: [
            {
                id: 11,
                name: "John",
                designation: "Developer"
            },
            {
                id: 12,
                name: "Mike",
                designation: "Tester"
            },
            {
                id: 13,
                name: "Smith",
                designation: "Analyst"
            },
        ],
        students: [
            {
                id: 21,
                name: "Allen",
                percentage: 80
            },
            {
                id: 22,
                name: "Steve",
                percentage: 90
            },
            {
                id: 23,
                name: "James",
                percentage: 85
            },
        ]
    }

    const [details, setDetails] = useState(data);
    return (
        <>
            <div className="container">
                <h1 style={{ color: "red" }}>Employee Details</h1>
                <section>
                    {
                        details.employees.map((v, i) => {
                            let { id, name, designation } = v;

                            return (
                                <React.Fragment key={i + 1}>
                                    <h2>ID : {id}</h2>
                                    <h2>Name : {name}</h2>
                                    <h2>Designation : {designation}</h2>
                                    <hr />
                                </React.Fragment>
                            )
                        })
                    }
                </section>

                <h1 style={{ color: "blue" }}>Student Details</h1>
                <section>
                    {
                        details.students.map((v, i) => {
                            let { id, name, percentage } = v;
                            return (
                                <React.Fragment key={i + 1}>
                                    <h2>ID : {id}</h2>
                                    <h2>Name : {name}</h2>
                                    <h2>Percentage : {percentage}</h2>
                                    <hr />
                                </React.Fragment>
                            )
                        })
                    }
                </section>
            </div>
        </>
    )
}

export default App;

