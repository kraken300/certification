var arr = [33, 56, 90, 49, 123, 44];

var r1 = arr.find((v, i, ar) => {
    console.log(v);
    console.log(i);
    console.log(ar);
    return v > 60;
});
console.log(r1);

var r2 = arr.findIndex((v) => v > 60);
console.log(r2);

var r3 = arr.filter(function (a, b, c) {
    return a > 69;
});
console.log(r3);

var r4 = arr.map((m, i, a) => {
    return m - 5;
});
console.log(r4);

const v = [80, 40, 30, 20, 10, 67, 97];
let r5 = v.some(function (val) {
    return val > 98;
});
console.log(r5);

var r6 = v.every((v) => v > 9);
console.log(r6);

var arr2 = [33, 56, 90, 49, 123, 44];
arr2.forEach((v, i, arr) => {
    console.log(v - 5);
});