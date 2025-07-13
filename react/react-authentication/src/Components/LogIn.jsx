import axios from 'axios';
import React, { useContext, useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import { toast } from 'react-toastify';
import { UserContext } from '../App';

const LogIn = () => {

    let [data, setData] = useState({ username: "", password: "" });
    let [fetchData, setFetchData] = useState(null);
    let navigate = useNavigate();
    let { setIsLoggedIn, setUserData } = useContext(UserContext);

    useEffect(() => {
        axios.get("http://localhost:4000/users")
            .then(
                ({ data }) => {
                    setFetchData(data);
                },
                (error) => {
                    console.log(error);
                },
            )
    }, []);

    let handleChange = (e) => {
        let { name, value } = e.target;
        setData({ ...data, [name]: value });
    }

    let handleSubmit = (e) => {
        e.preventDefault();
        let res = fetchData.some((v) => {
            return v.username == data.username && v.password == data.password;
        });

        if (res) {
            toast.success("Logged in successfully!");

            setIsLoggedIn(true);
            setUserData(data.username);

            navigate("/welcome");
            setData({ username: "", password: "" });
        } else {
            toast.error("Something went wrong");
        }
    }

    return (
        <div className="form-container">
            <form className="form-control" onSubmit={handleSubmit}>
                <h2>LOG IN</h2>

                <input type="text" name="username" id="username" placeholder="Enter username" value={data.username} onChange={handleChange} />
                <input type="password" name="password" id="password" placeholder="Enter password" value={data.password} onChange={handleChange} />

                <button type="submit">Login</button>

                <button type="button" onClick={(e) => navigate("/sign-up")}>Create New Account</button>
            </form>
        </div>
    )
}

export default LogIn
