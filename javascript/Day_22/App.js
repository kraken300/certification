var emp = {
    name: "abc",
    id: 200,
    skills: ["js", "java", "react"],
    address: {
        location: "JSpiders Thane",
        pin: 400601,
    },
    degree: "B.E",
    stream: "CSE",
    salary: 190000,
};

//! shallow copy

//* 1. by copying Object reference:
console.log("by copying Object reference");
let c1 = emp;
emp.id = 90;
console.log(emp.id);
emp.skills[0] = "python";
console.log(c1);
console.log(c1 === emp);


//* 2. using Object.assign():
console.log("using Object.assign()");
let c2 = Object.assign({}, emp);
emp.id = 300;
emp.skills[0] = "node";
console.log(c2);
console.log(c2 == emp);

//* 3. by spreading the values:
console.log("by spreading the values");
var c3 = { ...emp };
emp.id = 900;
emp.skills[1] = "express";
console.log(c3);
console.log(c3 == emp);

//* 4. for in loop
console.log("for in loop");
var c4 = {};
for (let i in emp) c4[i] = emp[i];

emp.id = 8000;
emp.address.location = "QSpiders Thane";
console.log(c4);

//! deep copy

//* 1. using JSON.stringify() and JSON.parse()
console.log("using JSON.stringify() and JSON.parse()");
let str = JSON.stringify(emp);
let c5 = JSON.parse(str);
emp.id = 9000;
emp.address.location = "QSpiders Thane";
console.log(c5);
console.log(c5 === emp);

//* 2. using structuredClone()
console.log("using structuredClone()");
let c6 = structuredClone(emp);
emp.id = 6000;
emp.address.location = "QSpiders Thane";
console.log(c6);
console.log(c6 === emp);

// by copying Object reference
// 90
// {
//   name: 'abc',
//   id: 90,
//   skills: [ 'python', 'java', 'react' ],
//   address: { location: 'JSpiders Thane', pin: 400601 },
//   degree: 'B.E',
//   stream: 'CSE',
//   salary: 190000
// }
// true
// using Object.assign()
// {
//   name: 'abc',
//   id: 90,
//   skills: [ 'node', 'java', 'react' ],
//   address: { location: 'JSpiders Thane', pin: 400601 },
//   degree: 'B.E',
//   stream: 'CSE',
//   salary: 190000
// }
// false
// by spreading the values
// {
//   name: 'abc',
//   id: 300,
//   skills: [ 'node', 'express', 'react' ],
//   address: { location: 'JSpiders Thane', pin: 400601 },
//   degree: 'B.E',
//   stream: 'CSE',
//   salary: 190000
// }
// false
// for in loop
// {
//   name: 'abc',
//   id: 900,
//   skills: [ 'node', 'express', 'react' ],
//   address: { location: 'QSpiders Thane', pin: 400601 },
//   degree: 'B.E',
//   stream: 'CSE',
//   salary: 190000
// }
// using JSON.stringify() and JSON.parse()
// {
//   name: 'abc',
//   id: 8000,
//   skills: [ 'node', 'express', 'react' ],
//   address: { location: 'QSpiders Thane', pin: 400601 },
//   degree: 'B.E',
//   stream: 'CSE',
//   salary: 190000
// }
// false
// using structuredClone()
// {
//   name: 'abc',
//   id: 9000,
//   skills: [ 'node', 'express', 'react' ],
//   address: { location: 'QSpiders Thane', pin: 400601 },
//   degree: 'B.E',
//   stream: 'CSE',
//   salary: 190000
// }
// false