let a = 100;

class Employee {
    constructor(name, id) {
        this.eName = name;
        this.eId = id;
    }
}

var e1 = new Employee("JOHN", 123); //! constructor call
console.log(e1); // Employee { eName: 'JOHN', eId: 123 }

var e2 = new Employee("MIKE", 456);
console.log(e2); // Employee { eName: 'MIKE', eId: 456 }

var e3 = new Employee();
console.log(e3); // Employee { eName: undefined, eId: undefined }