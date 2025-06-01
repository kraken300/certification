var arr = async () => {
    try {
        console.log("start");
        var x = 100;
        console.log(x);

        var y = 300;
        console.log(y);

        const z = 900;
        console.log(z);
        z = "str";

        console.log("end");

        return "javascript";
    }
    catch (e) {
        console.log("error handling by catch block");
        console.log(e);
    }
    finally {
        console.log("optional");
    }
}

var res = arr();
// res.then(
//     (d) => console.log(d),
//     (e) => console.log("error"),
// );

// start
// 100
// 300
// 900
// error handling by catch block
// TypeError: Assignment to constant variable.
// optional

//! example for await

var p1 = Promise.resolve("resolved promise");

async function demo() {
    try {
        console.log("start");
        let pro = await p1;
        console.log(pro);
        console.log("hello world");
        console.log("end");
        return 100;
    } catch (error) {
        console.log(error)
    }
}

demo().then(
    (d) => console.log(d),
    (e) => console.log(e),
);

console.log("hi");
console.log("hi");
console.log("hi");

// start
// hi
// hi
// hi
// resolved promise
// hello world
// end
// 100