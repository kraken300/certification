let ar = [10, 40, 60, 100, 80, 90];

let r1 = smallestNumber(ar);
console.log(r1);

let r2 = smallesttNumber2(ar);
console.log(r2);

function smallestNumber(arr) {
    let smallest = arr[0];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i];
        }
    }

    return smallest;
}

function smallesttNumber2(arr) {

    arr.sort((a, b) => a - b);

    let largest = arr[0];

    return largest;
}