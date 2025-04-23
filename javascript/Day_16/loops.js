for (let i = 0; i < 5; i++) {
    console.log("This is for loop");
}

let j = 0;
while (j < 5) {
    console.log("This is while loop");
    j++;
}

let k = 0;
do {
    console.log("This is do while loop")
    k++;
} while (k < 5);

let arr = [10, 20, 30, 40, 50];
for (let a of arr) {
    console.log(a);
}

for (let i in arr) {
    console.log(i);
}

let str = "Javascript";
for (let s of str) {
    console.log(s);
}

for (let i in str) {
    console.log(i);
}