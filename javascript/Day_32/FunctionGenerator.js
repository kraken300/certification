function* demo() {
    console.log("start");
    let x = 10;
    console.log("first");
    yield x;

    console.log("second");
    let y = 100;
    console.log(y);
    yield "js";

    console.log("third");
    let z = 1000;
    yield z;

    console.log("fourth");
    console.log("end");
    return "completed";
};

let x = demo();
console.log(x); // demo {<suspended>}

console.log(x.next());
console.log(x.next());
console.log(x.next());
console.log(x.next());

console.log(x); // demo {<closed>}
// console.log(...x);


// demo {<suspended>}
// start
// first
// {value: 10, done: false}
// second
// 100
// {value: 'js', done: false}
// third
// {value: 1000, done: false}
// fourth
// end
// {value: 'completed', done: true}
// demo {<closed>}