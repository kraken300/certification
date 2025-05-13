let s = "An apple a day keeps doctor away";

let r1 = firstLetterUpper(s);
console.log(r1);

function firstLetterUpper(str) {
    let arr = str.split(" ").map((value) => value.charAt(0).toUpperCase() + value.slice(1)).join(" ");

    return arr;
}