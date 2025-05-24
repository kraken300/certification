let p = {
    name: "abc",
    id: 125,
    skills: ["js", "java"],
    getName() {
        console.log("demo function");
        console.log(this.name);
    }
}

console.log(p);

let c = { name: "xyz" };
c.__proto__ = p;
console.log(c); // { name: 'xyz' }

console.log(c.id); // 125
console.log(c.skills); // [ 'js', 'java' ]
c.getName();  // demo function // xyz
p.getName(); // demo function // abc
