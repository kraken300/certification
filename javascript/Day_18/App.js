var std = {
    name: "xyz",
    id: 200,
    skills: ["js", "java"],
    percentage: 90,
};

// for (let k in std) console.log(std[k]);
// Object.freeze(std);
// Object.seal(std);

std.percentage = 99;
std.age = 20;
delete std.id;
console.log(std); // { name: 'xyz', skills: [ 'js', 'java' ], percentage: 99, age: 20 }

var r1 = Object.isFrozen(std);
console.log(r1); // false

var r2 = Object.isSealed(std);
console.log(r2); // false

var address = {
    location: "Thane",
    pinCode: 400601
};

var otherDetails = {
    salary: 9000,
    id: 500
};

Object.assign(std, address, otherDetails);
console.log(std);
console.log(otherDetails); // { salary: 9000, id: 500 }


// console.log(std);
// {
//     name: 'xyz',
//     skills: [ 'js', 'java' ],
//     percentage: 99,
//     age: 20,
//     location: 'Thane',
//     pinCode: 400601,
//     salary: 9000,
//     id: 500
// }
