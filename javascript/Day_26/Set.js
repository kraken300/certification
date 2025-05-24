var y = new Set([
    "string",
    100,
    () => "arr",
    true,
    null,
    100,
    () => "arr",
    { name: "sachin" },
]);

// y.add("string");
// y.add(100);
// y.add(() => "arr");
// y.add(true);
// y.add(null);
// y.add(100);
// y.add(() => "arr");
// y.add({ name: "sachin" });

console.log(y.size); // 7

console.log(y.has({ name: "sachin" })); // false because both objects have different object address
console.log(y.has(100)); // true

// y.clear()
// y.delete(null);
console.log(y.delete(() => "arr")); // false because both arrays have different object address

// console.log(y);

y.forEach((v, i, s) => {
    console.log(v);
    // console.log(i);
    // console.log(s);
});

//! how to remove duplicates from the array
let arr = [1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6];

// let s = new Set(arr);
// let newArr = [...s];
// console.log(newArr);

// console.log([...new Set(arr)]); // [ 1, 2, 3, 4, 5, 6 ]

let removeDuplicates = (arr) => {
    let newArr = [];
    for (let v of arr) if (newArr.includes(v) === false) newArr.push(v);
    return newArr;
};

console.log(removeDuplicates(arr)); // [ 1, 2, 3, 4, 5, 6 ]