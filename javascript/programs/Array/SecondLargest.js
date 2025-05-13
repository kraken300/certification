let ar = [10, 40, 60, 100, 80, 90];

let r1 = secondLargestNumber(ar);
console.log(r1);

let r2 = secondLargestNumber2(ar);
console.log(r2);

function secondLargestNumber(arr) {
    let largest = arr[0];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    let secondLargest = arr[0];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > secondLargest && arr[i] < largest) {
            secondLargest = arr[i];
        }
    }

    return secondLargest;
}

function secondLargestNumber2(arr) {

    arr.sort((a, b) => a - b);

    let largest = arr[arr.length - 2];

    return largest;
}