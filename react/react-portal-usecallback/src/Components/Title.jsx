import React from 'react'

const Title = () => {

    console.log("Title rendered");

    return (
        <div>
            <h1>This is Title</h1>
        </div>
    )
}

export default React.memo(Title);
