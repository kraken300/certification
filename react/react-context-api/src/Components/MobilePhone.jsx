import React from 'react';

const MobilePhone = (props) => {
    return (
        <>
            <h1>Name : {props.data.name}</h1>
            <h1>Price : {props.data.price}</h1>
            <h1>Color : {props.data.color}</h1>
        </>
    )
}

export default MobilePhone;
