let div = document.querySelector(".container");
console.log(div);

div.onclick = function (e) {
    console.log(e); // event object
    console.log("hello");
    this.style.background = "red";
    div.style.background = "red";
    e.target.style.background = "red";
}; // event handler function