import React, { useContext } from 'react'
import { UserContext } from '../App'

const Welcome = () => {

  let { userData } = useContext(UserContext);

  return (
    <div>
      <h1>Welcome {userData}</h1>
    </div>
  )
}

export default Welcome
