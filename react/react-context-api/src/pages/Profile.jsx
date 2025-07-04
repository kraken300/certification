import React, { useContext } from 'react';
import { UserContext } from "../App.jsx";

const Profile = () => {

  let { value } = useContext(UserContext);

  return (
    <div>
      {
        value != null ? <h1>Profile - {value.username}</h1> : null
      }
    </div>
  )
}

export default Profile;
