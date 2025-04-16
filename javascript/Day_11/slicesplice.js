//* slice()

var ar = [10, 20, 30, 40, 50, 60];
let r5 = ar.slice(3, 5); //! [ 40, 50 ]

console.log(r5);
console.log(ar.slice(2)); //! [ 30, 40, 50, 60 ]

console.log(ar.slice(-3, -1)); //! [ 40, 50 ]
console.log(ar.slice(-2)); //! [ 50, 60 ]

//* splice():

var newAr = [true, false, 80, 70, 60, 68, 100];
// newAr.splice(1, 1, "javascript", "java"); //! [ true, "javascript", "java", 80, 70, 60, 68, 100 ]
// newAr.splice(3, 0, 1000); //! [ true, false, 80, 1000, 70, 60, 68, 100 ]
let r6 = newAr.splice(3, 3, 90);
console.log(r6); //! [ 70, 60, 68 ]
console.log(newAr); //! [ true, false, 80, 90, 100 ]

let arr2 = [1, 2, 3, 4, 5, 6]
let r7 = arr2.splice(3, 0, "abc", "pqr");
console.log(r7); //! []
console.log(arr2); //! [ 1, 2, 3, "abc", "pqr", 4, 5, 6 ]