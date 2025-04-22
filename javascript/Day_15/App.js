var st = "Javascript";

console.log("========slice()========");
console.log(st.slice(2, 5)); // vas
console.log(st.slice(-4)); // ript
console.log(st.slice(-4, -2)); // ri

console.log("========substring()========");
console.log(st.substring(2, 5)); // vas
console.log(st.substring(-4)); // Javascript

console.log("========replace()========");
let s = "This is Javascript lecture and you can learn Javascript";
let r1 = s.replace("Javascript", "Java");
console.log(r1); // This is Java lecture and you can learn Javascript

console.log("========replaceAll()========");
let r2 = s.replaceAll("Javascript", "Java");
console.log(r2); // This is Java lecture and you can learn Java

console.log("========indexOf(), lastIndexOf(), includes()========");
let s1 = "Hello  lo world";
let s2 = "WELCOME ALL";
console.log(s1.indexOf("wo", 3)); // 10
console.log(s1.indexOf("lo", 3)); // 3
console.log(s1.lastIndexOf("lo", 8)); // 7
console.log(s1.includes("lo", 8)); // false

console.log("========charAt(), charCodeAt(), toUpperCase(), toLowerCase()========");
console.log(s1[4]); // o
console.log(s1.charAt(4)); // o
console.log(s1.charCodeAt(2)); // 108

console.log(s1.toUpperCase()); // HELLO  LO WORLD
console.log(s2.toLowerCase()); // welcome all

console.log("========trim(), trimStart(), trimEnd()========");
var s3 = "                                    hello   world                                        ";
console.log(s3.trim()); // hello   world
console.log(s3.trimStart()); // hello   world                                        
console.log(s3.trimEnd()); //                                     hello   world

console.log("========concat()========");
let s4 = "bye";
let s5 = "hi";
let s6 = "thank you";

console.log(s4.concat(s5, s6)); // byehithank you
console.log(s4 + s5 + s6); // byehithank you

console.log("========split()========");
var s7 = "hello world";
console.log(s7.split("o")); // [ 'hell', ' w', 'rld' ]
console.log(s7.split("l")); // [ 'he', '', 'o wor', 'd' ]

console.log("========join() - Array method========");
let reverseArr = s7.split("").reverse();
console.log(reverseArr); //  ['d', 'l', 'r', 'o', 'w', ' ', 'o', 'l', 'l', 'e', 'h']

let reverseStr = reverseArr.join("");
console.log(reverseStr); // dlrow olleh

let rev = s7.split("").reduceRight((prev, cv) => prev + cv, "");
console.log(rev); // dlrow olleh