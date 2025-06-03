let obj = [
    {
        id: 4,
        name: "Mike",
    },
    {
        id: 7,
        name: "John",
    },
    {
        id: 2,
        name: "Smith",
    },
    {
        id: 1,
        name: "Sam",
    },
    {
        id: 3,
        name: "Daniel",
    },
    {
        id: 6,
        name: "Kate",
    },
    {
        id: 5,
        name: "Harry",
    },
    {
        id: 8,
        name: "Henry",
    },
];

// obj.sort((a, b) => a.id - b.id);
// obj.sort((a, b) => a.name - b.name);
// console.log(obj);

// obj.sort(compare);

// function compare(a, b) {
//     if (a.name < b.name) return -1;
//     else if (a.name > b.name) return 1;
//     else return 0;
// }

obj.sort((a, b) => a.name.localeCompare(b.name));

console.log(obj);