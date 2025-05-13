let s = "     An apple a day  ";

let r1 = removeSpaces(s);
console.log(r1);

function removeSpaces(str) {
    return str.trim().split(" ").join("");
}