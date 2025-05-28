let username = document.querySelector("#username");
let email = document.querySelector("#email");
let password = document.querySelector("#password");
let form = document.querySelector(".form-control");

// form.addEventListener("submit", (e) => {
//     e.preventDefault();
//     let userData = { username: username.value, email: email.value, password: password.value };
//     console.log(userData);
// });

form.addEventListener("submit", function (e) {
    e.preventDefault();
    let data = new FormData(form);
    let finalData = Object.fromEntries(data);

    let skillsRes = data.getAll("skills");
    finalData.skills = skillsRes;
    console.log(finalData);

    // console.log(Object.fromEntries(new FormData(form)));
});

let span = document.querySelector(".display-percentage");
let percentage = document.getElementById("percentage");

// percentage.oninput = (e) => (span.innerHTML = percentage.value);
percentage.onchange = (e) => (span.innerHTML = percentage.value);