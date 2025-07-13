import React, { useCallback, useState } from 'react'
import PopupModal from './Components/PopupModal';
import SpeechRecognition from './Components/SpeechRecognition';
import Title from './Components/Title';
import Count from './Components/Count';
import Button from './Components/Button';
import "./App.css";

const App = () => {

  let [age, setAge] = useState(25);
  let [salary, setSalary] = useState(10000);

  let IncrementAge = useCallback(() => {
    setAge(p => p + 1)
  }, [age]);

  let IncrementSalary = useCallback(() => {
    setSalary(p => p + 100)
  }, [salary]);

  let handleClick = (e) => {
    let modalContainer = document.querySelector(".modal-container");
    modalContainer.style.display = "flex";
  }

  return (
    <>
      <button onClick={handleClick}>Show</button>

      <PopupModal />
      <SpeechRecognition />
      {/* 
      <Title />

      <Count text="age" count={age} />
      <Button handleClick={IncrementAge}>Increment Age</Button>

      <Count text="salary" count={salary} />
      <Button handleClick={IncrementSalary}>Increment Salary</Button> */}
    </>
  )
}

export default App
