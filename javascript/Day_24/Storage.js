console.log(window.localStorage); // Storage { length: 0 }
console.log(window.sessionStorage); // Storage { length: 0 }

localStorage.setItem("name", "sachin");
localStorage.setItem("id", 123);
localStorage.setItem("skills", ["js", "java"]);

let details = { percentage: 90, salary: 3.2, degree: "B.E" };
localStorage.setItem("details", JSON.stringify(details));

let id = localStorage.getItem("id");
console.log(id); // 123

let skills = localStorage.getItem("skills");
console.log(skills.split(",")); // Array [ "js", "java" ]

let detailsRes = localStorage.getItem("details");
console.log(JSON.parse(detailsRes)); // Object { percentage: 90, salary: 3.2, degree: "B.E" }

// localStorage.removeItem("id");
// localStorage.clear();

// //! session storage
sessionStorage.setItem("name", "dhoni");
sessionStorage.setItem("id", 9000);

let n = sessionStorage.getItem("name");
console.log(n); // dhoni