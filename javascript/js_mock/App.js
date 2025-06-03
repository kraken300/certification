function checkPan(panNumber) {

    if (panNumber[3] != "P") return false;

    // else if (typeof panNumber[0] !== "string") return false;
    // else if (typeof panNumber[1] !== "string") return false;
    // else if (typeof panNumber[2] !== "string") return false;
    // else if (typeof panNumber[4] !== "string") return false;
    // else if (typeof panNumber[9] !== "string") return false;

    // else if (typeof parseInt(panNumber[5]) !== "number") return false;
    // else if (typeof parseInt(panNumber[6]) !== "number") return false;
    // else if (typeof parseInt(panNumber[7]) !== "number") return false;
    // else if (typeof parseInt(panNumber[8]) !== "number") return false;

    // return true;

    else if (typeof panNumber[0] !== "string" || typeof panNumber[1] !== "string" || typeof panNumber[2] !== "string" || typeof panNumber[4] !== "string" || typeof panNumber[9] !== "string") {
        return false;
    }

    else if (typeof parseInt(panNumber[5]) !== "number" || typeof parseInt(panNumber[6]) !== "number" || typeof parseInt(panNumber[7]) !== "number" || typeof parseInt(panNumber[8]) !== "number") {
        return false;
    }

    else {
        return true;
    }
}


let s = "ETJPM1888A";
let res = checkPan(s);
console.log(res);

console.log(typeof parseInt(s[5]));
console.log(typeof s[1]);