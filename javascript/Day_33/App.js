let p1 = new Promise((x, y) => {
    let result = false;
    if (result) y("rejected promise");
    else x("resolved promise");
});

console.log(p1);

p1.then((value) => {
    console.log(value);
    console.log("promise resolved");
})
    .catch((reason) => {
        console.log(reason);
        console.log("promise rejected");
    })
    .finally(() => {
        console.log("finally method");
    });

console.log("hello world");

let x1 = Promise.resolve("resolved promise state");

x1.then(
    (value) => console.log(value),
    (reason) => console.log(reason)
);

let x2 = Promise.reject("rejected promise state");

x2.then(
    (value) => console.log(value),
    (reason) => console.log(reason)
);