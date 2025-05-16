function demo() {
    console.log("demo function");
}

// demo();

const sum = (a, b) => console.log(a + b);
const sub = (a, b) => {
    if (a > b) console.log(a - b);
    console.log(b - a);
};

// sum(30, 40);

const arr = [10, 20, 30];
const obj = { name: "abc", id: 300 };

module.exports = {
    demo, sum, sub, arr, obj
};