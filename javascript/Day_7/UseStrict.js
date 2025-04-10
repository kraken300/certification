"use strict";

//! Uncaught ReferenceError: a is not defined
// a = 10;
// console.log(a);

//! Uncaught SyntaxError: Duplicate parameter name not allowed in this context

// function f2(a, b, b) {
//     console.log("start");
//     console.log(a);
//     console.log(b);
// }

// f2(10, 20, 30);

function f3() {
    console.log(arguments); //* argument object
    console.log(arguments[0]);
    console.log(arguments[1]);
}

f3(10, 20, 30, 40, 50, 60);

// var arguments = 100; //! Invalid use of 'arguments' in strict mode
// console.log(arguments);