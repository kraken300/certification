let a = (10, 20, 30);
console.log(a);

var ar = [10, 20, 30, 40, 50]; //* Homogeneous array
var arr = [100n, true, `false`, () => 10, [30, 40], null]; //* Heterogeneous array

console.log(arr.length);
console.log(typeof arr[2], arr[2]);

var r1 = arr[3]();
console.log(r1);

console.log(arr[4][1]);
console.log(typeof ar);

let n1 = 200;
let r2 = Array.isArray(ar);
console.log(r2);
console.log(arr[8]); //! undefined