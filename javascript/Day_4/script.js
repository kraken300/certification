console.log(true && true);
console.log(false && false);
console.log(true && false);

console.log(true || true);
console.log(true || false);
console.log(false || false);

console.log(!true);
console.log(!false);

// ! typeof operator;
const k = 10;
console.log(typeof k);

let b = false;
console.log(typeof b);

let s = 'C';
console.log(typeof typeof s);

// ! ternary operator;
let res = true;
let m = res == false ? "10" : "20";
console.log(m);

var num1 = 200;
var num2 = 400;
let biggestValue = num1 > num2 ? num1 : num2;
console.log(biggestValue);