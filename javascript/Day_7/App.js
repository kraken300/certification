var a = 100; //* global scope

let b = 200; //* script scope
const c = 300; //* script scope

function f1(p, q) {
    var x = 10; //! local scope
    let y = 20; //! local scope
    const z = 30; //! local scope
    console.log(x, y, z);
    console.log(p, q);
}

f1("js", "java");

{
    var k = "react"; //* global scope
    let n = "node"; //* block scope
    const o = "object"; //* block scope
    console.log(n, o);
}

{
    let n = "eeeeee"; //* block scope
    const o = "array"; //* block scope
}

console.log(k);
// console.log(o); //! Uncaught ReferenceError: o is not defined