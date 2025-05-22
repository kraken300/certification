let x1 = setTimeout(function (a, b) {
    console.log("Hello world");
    console.log(a, b);
    // alert("Popup from setTimeout")
}, 3000, 30, 40);

let x2 = setInterval(() => {
    console.log("set interval");
    document.writeln('Javascript' + "<br/>");
}, 1000);

console.log(x1, x2);

let x = function () {
    console.log("hello");
}
x();

let isLoggedIn = false;
if (isLoggedIn === false) clearTimeout(x1);

setTimeout(() => {
    clearInterval(x2);
}, 5000);