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
import React from "react";
import Header from "./Components/Header";
import Products from "./Components/Products";

class App extends React.Component {
    render() {
        return (
            <>
                <h1 style={{ color: "red" }}>This is App Component (Root Component)</h1>
                <Header />
                <Products />
            </>
        )
    }
}

export default App;