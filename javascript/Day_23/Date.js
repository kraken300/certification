let x = new Date();
console.log(x);
console.log(x.getFullYear());
console.log(x.getMonth());
console.log(x.getDate());
console.log(x.getHours());
console.log(x.getMinutes());
console.log(x.getSeconds());
console.log(x.getMilliseconds());

let y = new Date();
y.setFullYear(2000);
y.setMonth(3);
y.setDate(14);
y.setHours(7);
y.setMinutes(30);
y.setSeconds(59);
y.setMilliseconds(765);
console.log(y);