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
                                    <button class = "update">Update</button>
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

//! fetch data by user id

const handleRead = (e, id) => {
    window.fetch(`http://localhost:4000/users/${id}`)
        .then(
            (value) => {
                value.json()
                    .then(
                        (data) => console.log(data),
                        (error) => console.log(error),
                    )
            },
            (error) => console.log(error),
        )
}

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