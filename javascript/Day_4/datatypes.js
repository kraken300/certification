let s1 = "js";
let s2 = "java";
console.log(s1 + s2);

//* number datatype
var a1 = 3.145;
console.log(a1);

var a2 = 314;
console.log(a2);
console.log(typeof a2);

console.log("=======================");

//* boolean datatype
let b1 = true;
console.log(b1);

let b2 = false;
console.log(b2);
console.log(typeof b2);

console.log("=======================");

//* bigint datatype
//! Numeric literals with absolute values equal to 2^53 or greater are too large to be represented accurately as integers.
let c1 = 100000000000000000000000000000000000000000;
console.log(c1);
console.log(typeof c1);

let c2 = 1000000000000000000000000000000000000000000n;
console.log(c2);
console.log(typeof c2);

console.log("=======================");

//* null datatype (explicit no data)
var d1 = null;
console.log(d1);
console.log(typeof d1); //* object type

console.log("=======================");

//* undefined datatype (implicit no data)
let e1;
console.log(e1);
console.log(typeof e1);

console.log("=======================");

//* NaN datatype
var res = 10 - "str";
console.log(res);
console.log(typeof res);