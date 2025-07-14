import React, { useState } from 'react'
import { useDispatch } from 'react-redux';
import { setUser } from '../slice/userSlice';

const Home = () => {

    let [data, setData] = useState({ name: "", email: "", age: "" });
    let dispatch = useDispatch();

    let handleChange = (e) => {
        let { name, value } = e.target;
        setData({ ...data, [name]: value });
    }

    let handleSubmit = (e) => {
        e.preventDefault();
        console.log(data);
        dispatch(setUser(data));
        setData({ name: "", email: "", age: "" });
    }

    return (
        <div className='container'>
            <form onSubmit={handleSubmit}>
                <input type="text" name="name" id="name" placeholder='Enter name' value={data.name} onChange={handleChange} /> <br />
                <input type="email" name="email" id="email" placeholder='Enter email' value={data.email} onChange={handleChange} /> <br />
                <input type="number" name="age" id="age" placeholder='Enter age' value={data.age} onChange={handleChange} /> <br />

                <button type="submit">Add User</button>

            </form>
        </div>
    )
}

export default Home
