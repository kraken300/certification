import React, { createContext, useState } from 'react';

let UserContext = createContext();

const UserContextProvider = ({ children }) => {

    let [value, setValue] = useState(null);

    return (
        <UserContext.Provider value={{ value, setValue }}>
            {children}
        </UserContext.Provider>
    )
}

export default UserContextProvider;
