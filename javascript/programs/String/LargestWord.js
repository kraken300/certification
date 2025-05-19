let s = "An apple a day keeps doctor away";

let r1 = largestWord(s);
console.log(r1);

let r2 = largestWord2(s);
console.log(r2);

function largestWord(str) {
    let arr = str.split(" ");
    // console.log(arr);

    let largestStr = str[0];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length > largestStr.length) {
            largestStr = arr[i];
        }
    }

    return largestStr;
}

function largestWord2(str) {
    let arr = str.split(" ");

    // let newArr = arr.sort((a,b)=>a.length - b.length);
    arr.sort((a, b) => a.length - b.length);

    return arr[arr.length - 1];
}