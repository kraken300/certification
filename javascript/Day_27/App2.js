let d = document.querySelector(".demo");
console.log(d); // <p class="demo p1">Lorem ipsum dolor sit amet consectetur adipisicing.</p>

let s = document.querySelector("span");
console.log(s); // <span></span>

let d1 = document.querySelectorAll(".demo");
console.log(d1); // NodeList(3) [p.demo.p1, p.demo.active.p2, p.demo.p3]

d1.forEach((v, i, d) => {
    console.log(v);
    // console.log(i);
    // console.log(d);
});

// <p class="demo p1">Lorem ipsum dolor sit amet consectetur adipisicing.</p>
// <p class="demo active p2">Lorem ipsum dolor sit amet consectetur adipisicing elit.</p>
// <p class="demo p3">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Eligendi?</p>

let art = document.querySelector(".art");

let h2 = document.createElement("h2");
h2.innerHTML = "WEB TECHNOLOGY";
h2.id = "heading 2";
h2.class = "function";
console.log(h2); // <h2 id="heading 2">WEB TECHNOLOGY</h2>

let p1 = document.createElement("p");
p1.innerHTML = "paragraph 1";

art.appendChild(h2);
art.append(h2, p1);

