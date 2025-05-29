//! removeEventListener()

let container = document.querySelector(".container");

let handleClick = (e) => {
    console.log("clicked");
    console.log("hello");
    container.removeEventListener("click", handleClick);
};

container.addEventListener("click", handleClick,
    // { once: true }
);

//! Event Delegation

// let li1 = document.querySelector(".li1");
// let li2 = document.querySelector(".li2");
// let li3 = document.querySelector(".li3");
// let btn = document.querySelector(".btn");

// li1.addEventListener("click", (e) => {
//     console.log(e.target.innerText);
// });

// li2.addEventListener("click", (e) => {
//     console.log(e.target.innerText);
// });

// li3.addEventListener("click", (e) => {
//     console.log(e.target.innerText);
// });

// btn.addEventListener("click", (e) => {
//     console.log(e.target.innerText);
//     alert("alert message");
// });

let list = document.querySelector(".list");

list.addEventListener("click", (e) => {
    // console.log(e.target);
    if (e.target.tagName == "LI") console.log(e.target.innerText);
    if (e.target.tagName == "BUTTON") alert("alert popup");
});