var fn = () => 10;

var x = new Map([
    [200, "number datatype"],
    [true, "boolean datatype"],
    [fn, "arr fn"],
    [[10, 20], "array datatype"],
    [10n, "bigint datatype"],
    ["str", "string datatype"],
]);

// x.set(200, "number datatype");
// x.set(true, "boolean datatype");
// x.set(() => 10, "arr fn");
// x.set([10, 20], "array datatype");
// x.set(10n, "bigint datatype");
// x.set("str", "string datatype");

console.log(x.get(200)); // number datatype
console.log(x.get(fn)); // arr fn
console.log(x.get([10, 20])); // undefined because both arrays have different object address
console.log(x.get(10n)); // bigint datatype

console.log(x.size); // 6
console.log(x.has(true)); // true
console.log(x.has([10, 20])); // false because both arrays have different object address

// x.clear();
// console.log(x);

x.forEach((v, i, m) => {
    // console.log(v); // value
    console.log(i + " , " + x.get(i)); // key

});