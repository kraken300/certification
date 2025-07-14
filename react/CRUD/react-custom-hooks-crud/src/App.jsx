import React, { useEffect, useRef, useState } from 'react';
import useFetchData from './hooks/useFetchData';
import useAddData from './hooks/useAddData';
import useDeleteData from './hooks/useDeleteData';
import useUpdateData from './hooks/useUpdateData';
import "./App.css";
import { MdClear } from 'react-icons/md';

const App = () => {
  let users = useFetchData("http://localhost:4000/users");

  let [input, setInput] = useState({
    id: "",
    username: "",
    email: "",
    phone: ""
  });

  let [updateInput, setUpdateInput] = useState({
    id: "",
    username: "",
    email: "",
    phone: ""
  });

  let [userRead, setUserRead] = useState({
    id: "",
    username: "",
    email: "",
    phone: ""
  });

  let [modal, setModal] = useState(false);
  let [addFormToggle, setAddFormToggle] = useState(false);
  let [updateFormToggle, setUpdateFormToggle] = useState(false);

  let addData = useAddData();
  let deleteData = useDeleteData();
  let updateData = useUpdateData();

  let handleChange1 = (e) => {
    let { name, value } = e.target;
    setInput({ ...input, [name]: value });
  }

  let handleChange2 = (e) => {
    let { name, value } = e.target;
    setUpdateInput({ ...updateInput, [name]: value });
  }

  let handleSubmitAdd = (e) => {
    e.preventDefault();
    addData("http://localhost:4000/users", input);
    setAddFormToggle(false);
    window.location.reload();
  }

  let handleDelete = (id) => {
    let confirm = window.confirm("Do you really want to delete ?");

    if (confirm) {
      deleteData(`http://localhost:4000/users/${id}`);
      window.location.reload();
    }
  }

  let handleUpdate = (user) => {
    setUpdateInput(user);
    setUpdateFormToggle(true);
    console.log(user);
  }

  let handleSubmitUpdate = (e) => {
    e.preventDefault();
    updateData(`http://localhost:4000/users/${updateInput.id}`, updateInput);
    // console.log(updateInput);
    setUpdateFormToggle(false);
    window.location.reload();
  }

  let handleRead = (user) => {
    setModal(true);
    setUserRead(user);
  }

  console.log(users);

  return (
    <>
      <div className='table-container'>
        <section>
          <button type="button" onClick={(e) => setAddFormToggle(true)}>Add</button>
          <table>
            <thead>
              <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>EMAIL</th>
                <th>PHONE</th>
                {/* <th>COMPANY</th> */}
                <th colSpan={3}>OPERATIONS</th>
              </tr>
            </thead>

            <tbody>
              {
                users?.map((user) => {
                  return (
                    <tr key={user.id}>
                      <td>{user.id}</td>
                      <td>{user.username}</td>
                      <td>{user.email}</td>
                      <td>{user.phone}</td>
                      {/* <td>{user.company.name}</td> */}

                      <td>
                        <button type="button" onClick={(e) => handleRead(user)}>Read</button>
                      </td>

                      <td>
                        <button type="button" onClick={(e) => handleUpdate(user)}>Update</button>
                      </td>

                      <td>
                        <button type="button" onClick={(e) => handleDelete(user.id)}>Delete</button>
                      </td>

                    </tr>
                  )
                })
              }
            </tbody>
          </table>
        </section>

        {/* Add Data */}
        {
          addFormToggle && (
            <section>
              <form onSubmit={handleSubmitAdd} method='post'>
                <fieldset>
                  <legend>Add Data</legend>

                  <input type="number" name="id" id="id" placeholder='Enter id' value={input.id} onChange={handleChange1} required /> <br />

                  <input type="text" name="username" id="username" placeholder='Enter username' value={input.username} onChange={handleChange1} /> <br />

                  <input type="email" name="email" id="email" placeholder='Enter email' value={input.email} onChange={handleChange1} /> <br />

                  <input type="text" name="phone" id="phone" placeholder='Enter phone' value={input.phone} onChange={handleChange1} /> <br />

                  <button type='submit'>Add user</button>

                </fieldset>
              </form>
            </section>
          )
        }

        {/* Update Data */}
        {
          updateFormToggle && (
            <section>
              <form onSubmit={handleSubmitUpdate} method='post'>
                <fieldset>
                  <legend>Update Data</legend>

                  <input type="text" name="username" id="username" placeholder='Enter username' value={updateInput.username} onChange={handleChange2} /> <br />

                  <input type="email" name="email" id="email" placeholder='Enter email' value={updateInput.email} onChange={handleChange2} /> <br />

                  <input type="text" name="phone" id="phone" placeholder='Enter phone' value={updateInput.phone} onChange={handleChange2} /> <br />

                  <button type='submit'>Update user</button>

                </fieldset>
              </form>
            </section>
          )
        }
      </div>

      {
        modal && (
          <div className="modal">
            <MdClear className='close-btn' onClick={(e) => setModal(false)} />
            <div className="sub-popup">
              <h2>Id : {userRead.id}</h2>
              <h2>Username : {userRead.username}</h2>
              <h2>Email : {userRead.email}</h2>
              <h2>Phone : {userRead.phone}</h2>
              <h2></h2>
            </div>
          </div>
        )
      }
    </>
  )
}

export default App;
