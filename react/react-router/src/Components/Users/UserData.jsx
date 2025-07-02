import axios from 'axios';
import React, { use, useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';

const UserData = () => {
  const { userId } = useParams();

  const [userData, setUserData] = useState({});

  useEffect(() => {
    axios.get(`https://dummyjson.com/users/${userId}`)
      .then(
        ({ data }) => {
          // console.log(data);
          setUserData(data);
        },
        (error) => {
          console.log(error);
        },
      )
  }, []);

  return (
    <div className="container">
      <h1>User Data</h1>
      <section>
        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>NAME</th>
              <th>EMAIL</th>
              <th>PHONE</th>
              <th>USERNAME</th>
              <th>ROLE</th>
            </tr>
          </thead>

          <tbody>
            <tr>
              <td>{userData.id}</td>
              <td>{`${userData.firstName} ${userData.lastName}`}</td>
              <td>{userData.email}</td>
              <td>{userData.phone}</td>
              <td>{userData.username}</td>
              <td>{userData.role}</td>
            </tr>
          </tbody>
        </table>
      </section>
    </div>
  )
}

export default UserData;
