function demo(a, b, c) {
    console.log(a);
    console.log(b);
    console.log(c);
    console.log("hello");
}

// demo(10, 20, 30);
// demo(80, 90);
// console.log(demo()); //! return value - undefined and return type - void

//***************** how to set the default value for parameter *****************

function f1(a = "js", b = "java") {
    console.log("start");
    console.log(a);
    console.log(b);
    console.log("end");
}

// f1(1000,2000);
// f1();

//***************** return value and return type *****************

function f2(x) {
    let v = 90; //! local variable
    console.log("start");
    return x, 200, 100;
    // console.log("end"); //! it will not execute
}

// let r1 = f2(2000);
// console.log(r1);
// console.log(v); //! Uncaught ReferenceError: v is not defined

function f3() {
    var w = 10000;
    console.log("f3 fn");
    return 200;
}

var r2 = f3();
console.log(r2);
