//* variable hoisting

console.log(y);
// console.log(x); //! Uncaught ReferenceError: Cannot access 'x' before initialization
// console.log(z); //! Uncaught ReferenceError: Cannot access 'z' before initialization

let x = 10;
var y = 20;
const z = 30;

//* function hoisting

demo();
function demo() {
    console.log("start");
    console.log("hello world");
}

//* like variable hoisting

// arr(); //! Uncaught TypeError: arr is not a function
// arr(); //! Uncaught ReferenceError: Cannot access 'arr' before initialization (for let keyword declaration)
let arr = function () {
    console.log("new fn");
}