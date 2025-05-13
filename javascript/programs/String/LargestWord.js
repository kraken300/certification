let s = "An apple a day keeps doctor away";

let r1 = largestWord(s);
console.log(r1);

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