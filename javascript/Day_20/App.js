//! constructor function:

function Student(name, id) {
    this.sName = name;
    this.sId = id;
}

var s1 = new Student("JOHN", 123);
console.log(s1); // Student { sName: 'JOHN', sId: 123 }

var s2 = new Student("MIKE", 120);
console.log(s2); // Student { sName: 'MIKE', sId: 120 }

//! Object constructor:

let o1 = new Object();
o1.name = "SMITH";
o1.id = 420;
console.log(o1); // { name: 'SMITH', id: 420 }