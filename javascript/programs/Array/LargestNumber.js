let ar = [10, 40, 60, 100, 80, 90];

let r1 = largestNumber(ar);
console.log(r1);

let r2 = largestNumber2(ar);
console.log(r2);

function largestNumber(arr) {
    let largest = arr[0];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    return largest;
}

function largestNumber2(arr) {

    arr.sort((a, b) => a - b);

    let largest = arr[arr.length - 1];

    return largest;
}