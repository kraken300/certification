let a1 = [10, 20, 30, 40];
let a2 = [50, 60, 70, 80];

let r1 = mergeTwoArrays(a1, a2);
console.log(r1);

function mergeTwoArrays(arr1, arr2) {
    return arr1.concat(arr2).sort((a, b) => a - b);
}