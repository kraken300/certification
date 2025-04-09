//* Implicit typecasting:

let s1 = `100`;
let s2 = 20;

console.log(s1 - s2); //! string converted into number
console.log("20" * "2"); //! string converted into number
console.log("10" + 10); //! number converted into string
console.log(10 / "2"); //! string converted into number
console.log(true + false); //! boolean converted into number

console.log("====================================");

//* Explicit typecasting:
var num1 = "300.89";
let r1 = parseInt(num1);
console.log(r1);

var r2 = parseFloat(num1);
console.log(r2);

let st = "javascript";
let r3 = parseInt(st);
console.log(r3); // NaN

let boo = true;
var r4 = boo.toString();
console.log(r4);
console.log(typeof r4);

let n = 100n;
let r5 = n.toString();
console.log(r5);
console.log(typeof r5);