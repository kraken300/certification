var div = document.querySelector(".container");

// using event handler property
// div.onmouseover = (e) => {
//     console.log("hovered");
// };

// using addEventListener()
// div.addEventListener("mouseover", function (e) {
//     console.log(e);
//     console.log("hello");
// });

// using event attribute
let handleClick = (e) => {
    console.log(e);
    console.log("hello");
    e.target.style.background = "red";
};

div.addEventListener("mouseout", function (e) {
    console.log(e);
    console.log("world");
    e.target.style.background = "#ccc";
});

let textArea = document.querySelector("#message");
textArea.onkeyup = function (e) {
    console.log(e);
    console.log("key up event triggered");
};

textArea.addEventListener("keydown", (e) => {
    console.log(e);
    console.log("key down event triggered");
});

textArea.addEventListener("keypress", (e) => {
    console.log(e);
    console.log("key press event triggered");
});