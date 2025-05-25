console.log(window.document); // #document
console.dir(document); // #document

let h1 = document.getElementById("head");
console.log(h1); // <h1 id="head">hello world</h1>

window.setTimeout(() => {
    h1.style.background = "orange";
    h1.style.padding = "10px 20px";
    h1.style.border = "2px solid black";
}, 5000);

let p = document.getElementsByClassName("demo");
console.log(p); // HTMLCollection(3) [p.demo.p1, p.demo.active.p2, p.demo.p3]
console.log(Array.isArray(p)); // false

// let i = 0;
// while(i < p.length){
//     p[i].style.background = "red";
//     p[i].style.color = "#fff";
//     i++;
// }

// for (let i of p) {
//     i.style.background = "red";
//     i.style.color = "#fff";
// }

//! how to convert HTML collection to array:

let newArr = Array.from(p);
console.log(newArr); // (3) [p.demo.p1, p.demo.active.p2, p.demo.p3]

let newArr2 = [...p];
console.log(newArr2); // (3) [p.demo.p1, p.demo.active.p2, p.demo.p3]

let newArr3 = Array.prototype.slice.call(p);
console.log(newArr3); // (3) [p.demo.p1, p.demo.active.p2, p.demo.p3]

let span = document.getElementsByTagName("span");
console.log(span);  // HTMLCollection(3) [span, span, span]

for (let i = 0; i < span.length; i++) {
    // span[i].innerText = `span content ${i + 1}` + "<br/>";
    span[i].innerHTML = `span content ${i + 1}` + "<br/>";
}

let art = document.getElementsByClassName("art");
// art[0].innerText = `
//     <section>
//         <p>hello world</p>
//     </section>
// `;

art[0].innerHTML = `
    <section>
        <p>hello world</p>
    </section>
`;

