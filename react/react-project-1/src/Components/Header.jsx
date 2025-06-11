import React from "react";

function Header() {
    class NestedComponent extends React.Component {
        render() {
            return (
                <h2 style={{ color: "orange" }}>Hello from the NestedComponent present inside Header Component</h2>
            )
        }
    }

    return (
        <>
            <h1 style={{ color: "blue" }}>Hello from the Header Component</h1>
            <NestedComponent />
        </>
    )
}

export default Header;