let tbody = document.querySelector("tbody");

window.fetch("http://localhost:4000/users")
    .then(
        (value) => {
            value.json()
                .then(
                    (data) => {
                        data.map((v, i) => {
                            let { id, name, email, phone } = v;
                            console.log(id)

                            tbody.innerHTML += `
                                <tr>
                                    <td>${id}</td>
                                    <td>${name}</td>
                                    <td>${email}</td>
                                    <td>${phone}</td>

                                   <td>
                                    <button class = "read" onclick = "handleRead(event, ${id})">Read</button>
                                    <button class = "update" onclick = "handleUpdate(event, ${id})">Update</button>
                                    <button class = "delete" onclick = "handleDelete(event, ${id})">Delete</button>
                                   </td>
                                </tr>
                            `;
                        });
                    },
                    (error) => console.log(error),
                )
        },
        (error) => console.log(error),
    );


//! open/close add form
let addDataBtn = document.querySelector(".add-data");
let popUp = document.querySelector(".pop-up-add");
let closeBtn = document.querySelector(".fa-xmark");
// let submitBtn = document.querySelector(".submit");

addDataBtn.onclick = (e) => popUp.style.display = "flex";

closeBtn.addEventListener("click", () => {
    popUp.style.display = "none";
});


//! Add data to json file
let addForm = document.querySelector(".add-form");
addForm.onsubmit = (e) => {
    e.preventDefault();
    let finalData = Object.fromEntries(new FormData(addForm));
    console.log(finalData);

    window.fetch("http://localhost:4000/users", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(finalData)
    })
}

//! delete the data

let handleDelete = (e, id) => {
    let confirm = window.confirm("Do you really want to delete the user?");

    if (confirm) {
        window.fetch(`http://localhost:4000/users/${id}`, {
            method: "DELETE",
        })
    }
    window.location.reload();
}

//! fetch data by user id

const handleRead = (e, id) => {
    let user_details = document.querySelector(".user-details");
    user_details.style.display = "flex";

    // window.location.href = "./user_info.html";
    let user_tbody = document.querySelector(".user_tbody");

    window.fetch(`http://localhost:4000/users/${id}`)
        .then(
            (value) => {
                value.json()
                    .then(
                        (data) => {
                            console.log(data);
                            let { id, name, email, phone } = data;
                            user_details.innerHTML = `
                                <tr>
                                    <td>${id}</td>
                                    <td>${name}</td>
                                    <td>${email}</td>
                                    <td>${phone}</td>

                                   <td> 
                                    <button class = "update">Update</button>
                                    <button class = "delete" onclick = "handleDelete(event, ${id})">Delete</button>
                                   </td>
                                </tr>
                                `
                        },
                        (error) => console.log(error),
                    )
            },
            (error) => console.log(error),
        )
}


//! update the data:

let popupUpdate = document.querySelector(".pop-up-update");
let closeBtn2 = document.querySelector(".close-button");

let inputName = document.querySelector("#name-update");
let inputEmail = document.querySelector("#email-update");
let inputPhone = document.querySelector("#phone-update");

let updateForm = document.querySelector(".update-form");

let handleUpdate = (e, id) => {
    popupUpdate.style.display = "flex";

    window.fetch("http://localhost:4000/users/" + id)
        .then(
            (data) => {
                data.json()
                    .then(
                        ({ name, email, phone }) => {
                            console.log(name);
                            inputName.value = name;
                            inputEmail.value = email;
                            inputPhone.value = phone;
                        },
                        (error) => console.log(error)
                    )
            },
            (error) => console.log(error),
        )

    updateForm.onsubmit = (e) => {
        e.preventDefault();

        let data = Object.fromEntries(new FormData(updateForm));

        window.fetch("http://localhost:4000/users/" + id, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data)
        })
    }
}

closeBtn2.onclick = (e) => { popupUpdate.style.display = "none" };