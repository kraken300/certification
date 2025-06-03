let obj = {
    id: 1,
    name: "John",
    marks: [90, 60, 80, 40, 60, 30, 50, 70],
};

obj.marks.sort((a, b) => a - b);
console.log(obj);