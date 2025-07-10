// import React from 'react';
// import useCounter from '../hooks/useCounter';

// const ClickCounter = () => {

//     let [count, increment, decrement, reset] = useCounter(0, 2);

//     return (
//         <div>
//             <h1>Click Counter : {count}</h1>
//             <button type="button" onClick={increment}>Increment</button>
//             <button type="button" onClick={decrement}>Decrement</button>
//             <button type="button" onClick={reset}>Reset</button>
//         </div>
//     )
// }

// export default ClickCounter;


// import React, { Component } from 'react'

// class ClickCounter extends Component {

//     constructor() {
//         super();
//         this.state = {
//             count: 0
//         }
//     }

//     handleIncrement = (e) => {
//         this.setState((prev) => {
//             return { count: prev.count + 1 }
//         });
//     }

//     render() {
//         return (
//             <div>
//                 <h1 onClick={this.handleIncrement}>Click Counter : {this.state.count}</h1>
//             </div>
//         )
//     }
// }

// export default ClickCounter;

import React, { Component } from 'react'
import HOC from './HOC';

class ClickCounter extends Component {
    render() {
        let { count, handleIncrement, name } = this.props;
        console.log(name);
        return (
            <div>
                <h1 onClick={handleIncrement}>Click Counter : {count}</h1>
            </div>
        )
    }
}

export default HOC(ClickCounter, 2);
