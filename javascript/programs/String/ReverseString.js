let str = "Javascript language";

let r1 = reverseString(str);
console.log(r1);

let r2 = reverseString2(str);
console.log(r2);

let r3 = reverseString3(str);
console.log(r3);

function reverseString(str) {
    return str.split("").reverse().join("");
}

function reverseString2(str) {
    return str.split("").reduceRight((prev, cv) => prev + cv, "");
}

function reverseString3(str) {
    let reverseStr = "";

    for (let i = str.length - 1; i >= 0; i--) {
        reverseStr = reverseStr + str[i];
    }

    return reverseStr;
}