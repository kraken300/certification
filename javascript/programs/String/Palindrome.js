let str1 = "radar";
let str2 = "madam";
let str3 = "apple";

let r1 = isPalindrome(str1);
console.log(r1);

let r2 = isPalindrome2(str2);
console.log(r2);

let r3 = isPalindrome3(str3);
console.log(r3);

function isPalindrome(str) {
    return str.split("").reverse().join("") === str;
}

function isPalindrome2(str) {
    return str.split("").reduceRight((prev, cv) => prev + cv, "") === str;
}

function isPalindrome3(str) {
    let reverseStr = "";

    for (let i = str.length - 1; i >= 0; i--) {
        reverseStr = reverseStr + str[i];
    }

    return reverseStr === str;
}