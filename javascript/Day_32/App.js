let obj = {
    name: "xyz",
    id: 90,
};

function f1(a, b, c) {
    console.log("start");
    console.log(this);
    console.log(a, b, c);
}

f1.call(obj, 10, 20, 30);
// start
// { name: 'xyz', id: 90 }
// 10 20 30

f1.apply(obj, [40, 50, 60]);
// start
// { name: 'xyz', id: 90 }
// 40 50 60

let fn = f1.bind(obj);
fn(70, 80, 90);
// start
// { name: 'xyz', id: 90 }
// 70 80 90