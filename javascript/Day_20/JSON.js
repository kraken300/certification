let o = {
    name: "abc",
    id: 90
}

let str = JSON.stringify(o);
console.log(typeof str); // string
console.log(str); // {"name":"abc","id":90}

let parse = JSON.parse(str);
console.log(parse); // { name: 'abc', id: 90 }