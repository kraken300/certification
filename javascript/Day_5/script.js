const v = "javascript 'hello world'";
const c = 'java""';
const b = `python`;
console.log(b.length);
console.log(b[2]); // second index position of b
console.log(b[b.length - 1]);
console.log(typeof v, typeof c, typeof b);

//! advantage of using template literals.

console.log("10 + 10");
console.log('10+10"');
var name1 = "sachin";
console.log(`sum of 2 and 2 is ${2 + 2} and name is ${name1}`);
console.log("sum of 2 and 2 is ${2 + 2} and name is ${name1}");