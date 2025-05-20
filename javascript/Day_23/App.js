// "use strict";

var o1 = { name: "abc" };
var o2 = { name: "abc" };

var n1 = 200;
var n2 = 200;

console.log(n1 == n2); // true
console.log(o1 == o2); // false

let a1 = 2000;
a1 = 9000;

const obj = {
    name: "sachin",
    id: 900
};

obj.name = "dhoni";
console.log(obj.name); // dhoni

// const x = 90;
// x = 90; // App.js:24 Uncaught TypeError: Assignment to constant variable.

//! this keyword in js:

console.log(this); // window object
console.log(window); // window object

console.log(this == window); // true    

function demo() {
    console.log(this); // window object
}
demo();

function f1() {
    let ar = () => {
        console.log(this); // undefined (with use strict)
    }
    ar();
}
f1();

let obj1 = {
    name: "sachin",
    demo() {
        console.log("demo function"); // demo function
        console.log(this); // {name: 'sachin', demo: ƒ, ar: ƒ}
    },

    ar: () => {
        console.log(this); // window object (Global scope) (Object does not have a scope)
    }
}

obj1.demo();
obj1.ar();