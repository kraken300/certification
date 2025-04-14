//! IIFE:

var a = 90;

(function () {
    var a = 800; //* avoid the global population.
    console.log("IIFE");
    console.log("end");
})();

console.log("===========");

//! Nested Function.

let p = 1000000;

function f1() {
    var a = 20;
    var b = 30;
    console.log(a, b);
    function f2() {
        console.log(a); //* Closure
        let x = "js";
        console.log(x);
    }
    f2();
}

f1();

console.log("===========");

//! Lecical Scoping/Scope Chaining

var o = 100;
let arr = () => {
    var o = 200;
    console.log("start");
    function f3() {
        var o = 300;
        function f4() {
            var o = 400;
            console.log(o);
        }
        f4();
    }
    f3();
};

arr();