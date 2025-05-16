var data = require("./Script.js");

let { sum, sub, arr, obj, demo } = data;

data.sum(500, 300); // 800
data.sub(50, 80); // 30

console.log(data.arr); // [ 10, 20, 30 ]

demo(); // demo function
console.log(obj); // { name: 'abc', id: 300 }