//! 10-06-2025
//? react, react-dom/client packages
//? two ways to create react element : React.createElement("element reference") and JSX
// import React, { createElement } from "react";
// import ReactDOM from "react-dom/client";

// console.log(React);
// console.log(ReactDOM);

// let h1 = React.createElement("h1", { id: "head", className: "heading" }, "Hello World");

// let form = createElement(
//     "form",
//     { className: "form-control" },
//     createElement("input", { type: "text", name: "username", id: "username", placeholder: "Enter username" }),
//     createElement("br"),
//     createElement("input", { type: "password", name: "password", id: "password", placeholder: "Enter password" }),
//     createElement("br"),
//     createElement("button", { type: "submit" }, "submit")
// )

// let heading = (
//     <>
//         <h1>Login Form</h1>
//         <form>
//             <label htmlFor="username">Username:</label>
//             <input type="text" name="username" id="username" /> <br />

//             <label htmlFor="password">Password:</label>
//             <input type="password" name="password" id="password" /> <br />

//             <button type="submit">login</button>
//         </form>
//     </>
// );

// let root = ReactDOM.createRoot(document.querySelector("#root"));
// root.render(h1);
// root.render(form);
// root.render(heading);

//! 11-06-2025
//? Expression in JSX
import React from "react";
import ReactDOM, { createRoot } from "react-dom/client";
import App from "./App";

var name = "sachin";
let num = 100;
let val;
if (num > 100) val = "true";
else val = "false";

let h1 = (
    <>
        <h1>{100 + 100}</h1>
        <h2>Name : {name}</h2>
        <h2>{num > 100 ? "true" : "false"}</h2>
        <h2>{val}</h2>
    </>
);

// createRoot(document.querySelector("#root")).render(h1);

//? adding App component as a child of root element
createRoot(document.querySelector("#root")).render(<App />);