let ar = [10, 20, 30, 40, 50, 60];

let r1 = sumOfArrayElements(ar);
console.log(r1);

function sumOfArrayElements(arr) {
    let sum = 0;

    for (let i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }

    return sum;
}