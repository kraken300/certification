export function demo() {
    console.log("demo function");
};

export const sum = (a, b) => console.log(a + b);
export const sub = (a, b) => {
    if (a > b) console.log(a - b);
    console.log(b - a);
};

export const arr = [10, 20, 30];
export const obj = { name: "abc", id: 300 };

// export default sum;