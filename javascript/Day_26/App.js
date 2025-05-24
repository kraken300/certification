class Demo {
    x = 200;
    static y = 300;
    constructor(value) {
        this.dValue = value;
    }

    f1() {
        console.log("demo function");
        console.log(this.dValue);
    }

    static f2() {
        console.log("f2 function");
    }
}

var d1 = new Demo("demo value");
console.log(d1); // Demo { x: 200, dValue: 'demo value' }
console.log(d1.x); // 200
console.log(Demo.y); // 300

var d2 = new Demo("demo value 2");
console.log(d2); // Demo { x: 200, dValue: 'demo value 2' }
d1.f1(); // demo function // demo value
d2.f1();  // demo function // demo value 2
Demo.f2(); // f2 function

//! inheritance:

class Person {
    demo = "value";
    constructor(name, id) {
        this.name = name;
        this.id = id;
    }

    getName() {
        console.log("demo method");
        console.log(this.name);
    }
}

//? ReferenceError: Must call super constructor in derived class before accessing 'this' or returning from derived constructor

class Employee extends Person {
    constructor(salary, name, id) {
        super(name, id); // to call the parent class constructor
        this.salary = salary;
    }
}

class Student extends Person {
    constructor(percentage, name, id) {
        super(name, id);
        this.percentage = percentage;
    }
}

let e1 = new Employee(20000, "John", 10);
console.log(e1); // Employee { demo: 'value', name: 'John', id: 10, salary: 20000 }
console.log(e1.demo); // value
e1.getName(); // demo method // John

let s1 = new Student(98, "Dhoni", 20);
console.log(s1); // Student { demo: 'value', name: 'Dhoni', id: 20, percentage: 98 }
console.log(s1.demo); // value
s1.getName(); // demo method // Dhoni
