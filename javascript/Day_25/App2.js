for (let i = 1; i <= 5; i++) {
    setTimeout(() => {
        console.log(i);
    }, 4000);
}

for (var i = 1; i <= 5; i++) {
    setTimeout(() => {
        console.log(i);
    }, 4000);
}