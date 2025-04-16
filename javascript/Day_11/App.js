var a = [10, 20, 30, 40, 50];
console.log(a[2]); //! fetch
a[3] = 400; //! update
a[5] = 900; //! add
a[10] = 90;
console.log(a[6]);

delete a[1];
console.log(a);

//! push(), unshift()

var arr = [30, 40, 50, 60];
// let r1 = arr.push(70, 80, true, false);
// console.log(r1);
// console.log(arr);

// var r2 = arr.unshift(10, 20, 30);
// console.log(r2);
// console.log(arr);

//! pop(), shift()

let r3 = arr.pop();
// arr.pop();
// arr.pop();
console.log(r3);

arr.shift();
let r4 = arr.shift();
console.log(r4);

console.log(arr);