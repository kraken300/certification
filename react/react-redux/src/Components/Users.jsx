import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { deleteUser } from '../slice/userSlice';

const Users = () => {

    let dispatch = useDispatch();

    let users = useSelector((state) => {
        return state.userInfo.users;
    });
    console.log(users);


    let handleDelete = (id) => {
        let confirmRes = window.confirm("Do you really want to delete?");
        if (confirmRes) dispatch(deleteUser(id));
    }

    return (
        <div>
            <h1>Users</h1>
            {
                users?.map((v, i) => {
                    return (
                        <React.Fragment key={i + 1}>
                            <h2>Name : {v.name}</h2>
                            <h2>Email : {v.email}</h2>
                            <h2>Age : {v.age}</h2>

                            <button type="button" onClick={() => handleDelete(i)}>Delete user</button>
                        </React.Fragment>
                    )
                })
            }
        </div>
    )
}

export default Users
