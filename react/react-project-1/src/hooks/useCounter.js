import React, { useState } from "react";

function useCounter(initialValue = 0, value = 1) {
    let [count, setCount] = useState(initialValue);

    let increment = () => setCount(p => p + value);
    let decrement = () => setCount(p => p - value);
    let reset = () => setCount(initialValue);

    return [count, increment, decrement, reset];
}

export default useCounter;