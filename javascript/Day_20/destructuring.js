//! Array destructuring
var a = [30, 40, 100, 300, 700];

// A rest element must be last in a destructuring pattern.
var [x, y, ...z] = a;
console.log(y); // 40
console.log(x); // 30
console.log(z); // [ 100, 300, 700 ]

//! Object destructuring:

const id = 800;

var obj = {
    name: "sachin",
    id: 900,
    skills: ["js", "java"],
    salary: 1000,
    isMarried: false,
    degree: "B.E",
    stream: "Mechanical Engineering",
};

const { skills, name, id: eId, eSal, salary, ...r } = obj;

console.log(salary); // 1000
console.log(eSal); // undefined
console.log(id); // 800
console.log(eId); // 900
console.log(r); // {isMarried: false, degree: 'B.E', stream: 'Mechanical Engineering'}