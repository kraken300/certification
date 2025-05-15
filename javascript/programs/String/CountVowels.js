let str = "Javascript";

let r1 = countVowels(str);
console.log(r1);

let r2 = countVowels2(str);
console.log(r2);

function countVowels(str) {
    let count = 0;

    for (let i = 0; i < str.length; i++) {
        let char = str[i].toLowerCase();
        if (char === "a" || char === "e" || char === "i" || char === "o" || char === "u") {
            count++;
        }
    }

    return count;
}

function countVowels2(str) {
    let count = 0;

    for (let i = 0; i < str.length; i++) {
        let char = str[i].toLowerCase();

        switch (char) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                count++;
        }
    }

    return count;
}