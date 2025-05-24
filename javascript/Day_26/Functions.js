// pure function: -> does not cause side effects

function sum(a, b) {
    return a + b
};

console.log(sum(10, 20)); // 30
console.log(sum(10, 20)); // 30
console.log(sum(10, 20)); // 30

// impure function: -> may cause side effects

let count = 0;
function increment(num) {
    count++;
    return num + count;
}

console.log(increment(10)); // 11
console.log(increment(10)); // 12
console.log(increment(10)); // 13

// currying function:

function add(a) {
    return function (b) {
        return function (c) {
            return a + b + c;
        };
    };
};

console.log(add(10)(20)(30)); // 60