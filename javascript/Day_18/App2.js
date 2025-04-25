//! rest parameter:

function demo(a, b, ...c) {
    console.log("hello"); // hello
    console.log(a, b); // 10 20
    console.log(c); // [ 30, 40, 50, 60, 70, 80 ]
}

demo(10, 20, 30, 40, 50, 60, 70, 80);

//! spread operator:

var ar = [70, 60, 40, 20, 10];
console.log(...ar); // 70 60 40 20 10

var st = "Javascript";
console.log(...st); // J a v a s c r i p t
console.log([...st]); // [ "J", "a", "v", "a", "s", "c", "r", "i", "p", "t" ]

var o = { name: "abc", id: 200 };
// console.log(...o); //! Uncaught TypeError: Spread syntax requires ...iterable[Symbol.iterator] to be a function

var x = [10, 20];
var y = [30, 40];
var z = [50, 60];

// console.log(x.concat(y, z));
// var newArr = [x, y, z]; // [ (2) […], (2) […], (2) […] ]
var newArr = [...x, ...y, ...z];
console.log(newArr); // [ 10, 20, 30, 40, 50, 60 ]