import React, { createElement } from "react";
import ReactDOM from "react-dom/client";

console.log(React);
console.log(ReactDOM);

let h1 = React.createElement("h1", { id: "head", className: "heading" }, "Hello World");

let form = createElement(
    "form",
    { className: "form-control" },
    createElement("input", { type: "text", name: "username", id: "username", placeholder: "Enter username" }),
    createElement("br"),
    createElement("input", { type: "password", name: "password", id: "password", placeholder: "Enter password" }),
    createElement("br"),
    createElement("button", { type: "submit" }, "submit")
)

let heading = (
    <>
        <h1>Login Form</h1>
        <form>
            <label htmlFor="username">Username:</label>
            <input type="text" name="username" id="username" /> <br />

            <label htmlFor="password">Password:</label>
            <input type="password" name="password" id="password" /> <br />

            <button type="submit">login</button>
        </form>
    </>
);

let root = ReactDOM.createRoot(document.querySelector("#root"));
// root.render(h1);
// root.render(form);
root.render(heading);