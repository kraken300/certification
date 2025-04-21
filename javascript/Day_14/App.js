var ar = [10, 20, 30, 40, 50];

var r1 = ar.reduce((prev, cv) => {
    return prev + cv;
}, 10);
console.log(r1); // 160

var r2 = ar.reduceRight((prev, cv) => {
    return prev + cv
}, 20);
console.log(r2); // 170

var arr = [9, 334, 10, 1111, 69, 35];
arr.sort(function (x, y) {
    // return x-y;
    return y - x;
});
console.log(arr); // [ 1111, 334, 69, 35, 10, 9 ]

arr.sort(function (x, y) {
    if (x > y) return 1;
    else if (y > x) return -1;
    return 0;
});
console.log(arr); // [ 9, 10, 35, 69, 334, 1111 ]

let fruits = ["Apple", "Banana", "Orange", "Pineappe", "Mango"];
fruits.sort();
console.log(fruits); // [ 'Apple', 'Banana', 'Mango', 'Orange', 'Pineappe' ]