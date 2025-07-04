import React, { useContext, useState } from 'react';
import { UserContext } from '../App';



const Login = () => {

    let [userData, setUserData] = useState({
        username: "",
        password: ""
    });

    let { setValue } = useContext(UserContext);

    let handleChange = (e) => {
        let { name, value } = e.target;
        setUserData({ ...userData, [name]: value });
    }

    let handleSubmit = (e) => {
        e.preventDefault();
        // console.log(userData);
        setValue(userData);
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                <input type="text" id="username" name="username" placeholder="Enter username" value={userData.username} onChange={handleChange} /> <br />
                <input type="password" id="password" name="password" placeholder="Enter password" value={userData.password} onChange={handleChange} /> <br />
                <button type="submit">Submit</button>
            </form>
        </>
    )
}

export default Login;
