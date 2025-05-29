// ------ li ------
let li = document.querySelectorAll("li");

li.forEach((v, i, li) => {
    v.addEventListener("mouseover", function (e) {
        e.target.style.color = "#F27F3D";
    })
});

li.forEach((v, i, li) => {
    v.addEventListener("mouseout", function (e) {
        e.target.style.color = "#133864";
    })
});

// ------ button -------
let button = document.querySelector("button");

button.addEventListener("mouseover", function (e) {
    e.target.style.background = "#133864";
});

button.addEventListener("mouseout", function (e) {
    e.target.style.background = "#F27F3D";
});

// ------ services -------
let services = document.querySelector(".services");
let display_services = document.querySelector(".display-services");

services.addEventListener("mouseover", () => display_services.style.display = "block");
services.addEventListener("mouseout", () => display_services.style.display = "none");

display_services.addEventListener("mouseover", () => display_services.style.display = "block");
display_services.addEventListener("mouseout", () => display_services.style.display = "none");

// ------ partners -------
let partners = document.querySelector(".partners");
let display_partners = document.querySelector(".display-partners");

partners.addEventListener("mouseover", () => display_partners.style.display = "block");
partners.addEventListener("mouseout", () => display_partners.style.display = "none");

display_partners.addEventListener("mouseover", () => display_partners.style.display = "block");
display_partners.addEventListener("mouseout", () => display_partners.style.display = "none");

// ------ slideshow -------
let images = document.querySelectorAll(".images");

// let imagesArr = [...images];
// console.log(imagesArr);

setInterval(() => {
    images[0].style.display = "block";
    images[1].style.display = "none";
    images[2].style.display = "none";
}, 1000);

setInterval(() => {
    images[0].style.display = "none";
    images[1].style.display = "block";
    images[2].style.display = "none";
}, 2000);

setInterval(() => {
    images[0].style.display = "none";
    images[1].style.display = "none";
    images[2].style.display = "block";
}, 3000);