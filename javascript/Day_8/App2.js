//! Anonymous function:

// function(){

// }

//! Named function
function f1() {
    console.log("hello");
}
f1();

//! Function with expression:
var x = function (a, b) {
    console.log(a, b);
    return "js";
}

let r1 = x(10, 20);
console.log(r1);

//! Arrow function

var arr = () => {
    console.log("hello");
    console.log("arrow function");
}

arr();

let a1 = () => console.log("welcome all");
a1();

let a2 = (a) => console.log(a);
a2(200);

let a3 = v => v;

let r2 = a3(90n);
console.log(r2); //!90n

//! Higher order function

function f3(x, y) {
    x();
    y();
}

f3(
    function () {
        console.log("anonymous function");
    },
    () => console.log("arrow function")
);