let p = new Promise((res, rej) => {
    let result = true;

    if (result) rej("rejected promise");
    else res("resolved promise");
});

console.log(p); // Promise { <rejected> 'rejected promise' } // Error