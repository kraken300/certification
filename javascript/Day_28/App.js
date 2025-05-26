let h2 = document.getElementById("head");
console.log(h2);

// h2.setAttribute("class", "demo");
// h2.setAttribute("class", "add");

// h2.className = "active add demo span"; //! not recommended

h2.classList.add("demo", "add", "active", "span");
h2.classList.remove("add", "demo");
console.log(h2.classList.contains("demo")); // false

// let t = h2.classList.toggle("span");
// console.log(t);

let div = document.querySelector(".container");
console.log(div);

window.setInterval(() => {
    let test = div.classList.toggle("web");
    if (test) div.style.background = `#${Math.floor(Math.random() * (999999 - 100000)) + 100000}`;
    else div.style.background = "none";
    // else document.body.style.background = "none";
}, 1000);