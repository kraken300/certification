async function fetchData() {
    let res = await window.fetch("./abc.json");
    // console.log(res);
    let data = await res.json();
    console.log(data);
}

// let p1 = new Promise((res, rej) => {

// });

let res = window.fetch("./abc.json");

res
    .then((response) => {
        let final = response.json();
        final
            .then((data) => console.log(data))
            .catch((error) => console.log(error));
    })
    .catch((error) => console.log(error));

// fetchData();