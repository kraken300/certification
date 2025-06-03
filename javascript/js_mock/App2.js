let obj = { name: "ABC", id: 123 };

let deep = structuredClone(obj);
// let deep = obj;

console.log(deep); 

obj["name"] = "XYZ";

console.log(obj);
console.log(deep);