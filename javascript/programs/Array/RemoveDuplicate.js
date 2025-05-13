let arr = [1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9];

let r1 = removeDuplicates(arr);
console.log(r1);

let r2 = removeDuplicates2(arr);
console.log(r2);

function removeDuplicates(arr) {
    let arr2 = [];

    arr.forEach((element) => {
        if (!arr2.includes(element)) {
            arr2.push(element);
        }
    });

    return arr2;
}

function removeDuplicates2(arr) {
    let newArr = arr.filter((element, index) => {
        return arr.indexOf(element) === index;
    });

    return newArr;
}