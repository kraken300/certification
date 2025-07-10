// import React from 'react';
// import useCounter from '../hooks/useCounter';

// const HoverCounter = () => {

//     let [count, increment] = useCounter(0, 4);

//     return (
//         <div>
//             <h1 onMouseOver={increment}>Hover Counter : {count}</h1>
//         </div>
//     )
// }

// export default HoverCounter;

// import React, { Component } from 'react'

// class HoverCounter extends Component {

//     constructor() {
//         super();
//         this.state = {
//             count: 0
//         }
//     }

//     handleHover = () => {
//         this.setState({ count: this.state.count + 1 });
//     }

//     render() {
//         return (
//             <div>
//                 <h1 onMouseOver={this.handleHover}>Hover Counter : {this.state.count}</h1>
//             </div>
//         )
//     }
// }

// export default HoverCounter;

import React, { Component } from 'react'
import HOC from './HOC';

class HoverCounter extends Component {
    render() {
        console.log(this.props.name);
        return (
            <div>
                <h1 onMouseOver={this.props.handleIncrement}>Hover Counter : {this.props.count}</h1>
            </div>
        )
    }
}

export default HOC(HoverCounter, 4);
