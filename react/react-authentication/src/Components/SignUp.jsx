import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import { toast } from 'react-toastify';

const SignUp = () => {

    let [data, setData] = useState({ username: "", password: "", email: "" });
    let [fetchData, setFetchData] = useState(null);
    let navigate = useNavigate();

    let handleChange = (e) => {
        let { name, value } = e.target;
        setData({ ...data, [name]: value });
    }

    let handleSubmit = (e) => {
        e.preventDefault();
        axios.post("http://localhost:4000/users", data)
            .then(
                () => {
                    toast.success("Signed up successfully!");
                    navigate("/");
                },
                (error) => {
                    console.log(error);
                },
            )
    }

    return (
        <div className="form-container">
            <form className="form-control" onSubmit={handleSubmit}>
                <h2>SIGN UP</h2>

                <input type="text" name="username" id="username" placeholder="Enter username" value={data.username} onChange={handleChange} />

                <input type="password" name="password" id="password" placeholder="Enter password" value={data.password} onChange={handleChange} />

                <input type="email" name="email" id="email" placeholder="Enter email" value={data.email} onChange={handleChange} />

                <button type="submit">Signup</button>

                <button type="button" onClick={(e) => navigate("/log-in")}>Already have acccount</button>
            </form>
        </div>
    )
}

export default SignUp;
