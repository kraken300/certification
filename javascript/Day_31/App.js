//! Event Propogation

let gp = document.querySelector(".gp");
let p = document.querySelector(".p");
let c = document.querySelector(".c");

document.addEventListener("click", (e) => {
    console.log("document clicked");
    console.log(e.eventPhase);
});

gp.addEventListener("click", (e) => {
    console.log("gp clicked");
    console.log(e.eventPhase);
}, { capture: true });

p.addEventListener("click", (e) => {
    console.log("parent clicked");
    console.log(e.eventPhase);
});

c.addEventListener("click", (e) => {
    // e.stopPropagation();
    e.stopImmediatePropagation();
    console.log("child clicked");
    console.log(e.eventPhase);
});

c.addEventListener("click", (e) => {
    console.log("child event 2");
});