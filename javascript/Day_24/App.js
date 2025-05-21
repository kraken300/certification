// let x = new Math();
// console.log(x); // error

console.log(Math.round(10.45321)); // 10
console.log(Math.round(10.689)); // 11

console.log(Math.ceil(4.56)); // 5
console.log(Math.ceil(4.1)); // 5

console.log(Math.floor(3.9)); // 3
console.log(Math.floor(7.1)); // 7

console.log(Math.trunc(8.974645)); // 8
console.log(Math.trunc(-9.54454)); // -9

console.log(Math.max(20, 30, 40, 90, 80)); // 90
console.log(Math.max()); // -Infinity

console.log(Math.min(20, 30, 40, 90, 80)); // 20
console.log(Math.min()); // Infinity

console.log(Math.pow(10, 2)); // 100
console.log(Math.sqrt(169)); // 13
console.log(Math.cbrt(125)); // 5

//! find the maximum value from the array without using sort();

let a = [1, 2, 3, 4, 6, 7, 8];
console.log(Math.max(...a)); // 8

let big = a[0];
for (let val of a) if (val > big) big = val;
console.log(big); // 8

//! how to generate the random number:

console.log(Math.random()); // 0.011411145860823924

let randomFourDigit = Math.random() * (9999 - 1000) + 1000;
console.log(Math.floor(randomFourDigit)); // 9072