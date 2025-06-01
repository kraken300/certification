let art = document.querySelector(".container-sub");

async function fetchData() {
    try {
        let data = await window.fetch("https://dummyjson.com/products");
        let finalData = await data.json();

        console.log(finalData.products);

        for (let i = 0; i < finalData.products.length; i++) {
            let { id, title, description, price, rating, thumbnail } = finalData.products[i];

            art.innerHTML += `
                <div class="main">
                    <figure>
                        <img src=${thumbnail} alt=${id}>
                    </figure>
                    <aside>
                        <h1>${title}</h1>
                        <p>${description}</p>

                        <div class="d1">
                            <span>Price : ${price}</span>
                            <span>Rating : ${rating}</span>
                        </div>

                        <button onClick="handleClick(event)">Add Item</button>
                    </aside>
                </div>
            `;

        }
    } catch (error) {
        console.log("error");
    }
}

fetchData();

let handleClick = (e) => {
    console.log("Added");
};