//! includes():
console.log("========includes()========");
var arr = [true, "false", 100n, 10, 20, 40, "false"];
console.log(arr.includes(100));
console.log(arr.includes("false", 1));

//! indexOf():
console.log("========indexOf()========");
console.log(arr.indexOf("false"));
console.log(arr.indexOf("false", 2));
console.log(arr.indexOf("true"));

//! lastIndexOf();
console.log("========lastIndexOf()========");
console.log(arr.lastIndexOf("false", 5));

//! concat():
console.log("========concat()========");
let x = [10, 20];
let y = [30, 40];
let z = [50, 60];

var newAr = z.concat(x, z);
console.log(newAr);

//! flat():
console.log("========flat()========");
var a1 = [10, 20, [30, [50, 60], 40], 100];
var r1 = a1.flat(2);
// a1.flat(1);
// console.log(r1);
console.log(a1);

//! fill():
console.log("========fill()========");
var a2 = ["js", "java", "react", "SQL", "python", "html"];
a2.fill("spring", 1, 4);
console.log(a2);

//! at():
console.log("========at()========");
var ar = [10, 20, 30, 40, 50];
let r2 = ar.at(2);
console.log(r2);
console.log(ar.at(-1)); //! 50
console.log(ar[-1]); //! undefined

//! reverse():
console.log("========reverse()========");
ar.reverse();
console.log(ar);

//! copyWithin();
console.log("========copyWithin()========");
var a = [10, 20, 30, 40, 50, 60, 70];
a.copyWithin(2, 5, 7);
console.log(a);