let tbody = document.querySelector("tbody");

let data = window.fetch("https://fakestoreapi.com/products");

data.then(
    (d) => {
        let x = d.json();

        x.then(
            (val) => {
                for (let v of val) {
                    let { id, image, description, title, price } = v;
                    tbody.innerHTML += `
                        <tr>
                            <td>${id}</td>
                            <td>
                                <img src=${image} alt =${id}>
                            </td>
                            <td>${title}</td>
                            <td>${description}</td>
                            <td>$${price}</td>
                        </tr>
                    `;
                }
            },
            (e) => console.log(e),
        )
    },
    (e) => console.log(e),
);