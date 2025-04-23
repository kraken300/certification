let x1 = 300;
let x2 = 400;
let x3 = 600;
var big;

if (x1 > x2) {
    if (x1 > x3) {
        big = x1;
    }
    else {
        big = x3;
    }
}
else {
    if (x2 > x3) {
        big = x2;
    }
    else {
        big = x3;
    }
}

console.log(big); // 600

var num = 1;

switch (num + 1) {
    case 1:
        console.log("first")
        break;
    case 2:
        console.log("second");
        break;
    case 3:
        console.log("third");
        break;
    default:
        console.log("default");
}

// second