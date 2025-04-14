console.log(window);
console.log(this);

console.log(this === window);

var b = 300; // stored in window object
// let a = 100; 

function f5() {
    var b = 900;
    console.log("hi");
    console.log(b); // local scope
    console.log(window.b); // accessing global variable insdie local scope
    console.log(this.b); // accessing global variable insdie local scope
}
f5();

window.alert("hello world!");