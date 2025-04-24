const obj = {
    name: "abc",
    id: 123,
    skills: ["react", "js", "java"],
    address: {
        location: "Thane",
        pinCode: 400601,
    },
    isMarried: false,
    kids: 2,
    id: 500,
    demo: function () {
        console.log("Anonymous function");
    },
    fun() {
        console.log("Named function");
    },
};

obj["salary"] = 30000;
// obj["kids"] = 3;
// obj[kids] = 3; //! App.js:22 Uncaught ReferenceError: kids is not defined
obj.kids = 3;
delete obj.id;

console.log(obj);

for (let key in obj) {
    console.log(key);
}

for (let key in obj) {
    console.log(key + " : " + obj[key]);
}

// for (let val of obj) { //! App.js:31 Uncaught TypeError: obj is not iterable
//     console.log(val);
// }

console.log(obj[`id`]);
console.log(obj["kids"]);
console.log(obj.kids);
console.log(obj.isMarried);
console.log(obj.address.location);
console.log(obj["address"]["pinCode"]);

obj.demo();
obj.fun();

//! keys, values, entries => static methods:

let key = Object.keys(obj);
console.log(key);

let value = Object.values(obj);
console.log(value);

let entry = Object.entries(obj);
console.log(entry);