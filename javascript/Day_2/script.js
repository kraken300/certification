var x = true;
console.log(x);
var x = "str";
console.log(x);

var a;
console.log(a);
a = "js";
console.log(a);

let y = 200;
console.log(y);
// let y = 2000; // !Cannot redeclare block-scoped variable 'y'
y = 2000;
console.log(y);

let b;
console.log(b);
b = [10,20];
console.log(b);

const z = 6000;
console.log(z);
// const z = 60; // !Cannot redeclare block-scoped variable 'z'
// z = 60; // !Uncaught TypeError: invalid assignment to const 'z'

// const c; // !'const' declarations must be initialized

// console.log(p); // !Uncaught ReferenceError: p is not defined