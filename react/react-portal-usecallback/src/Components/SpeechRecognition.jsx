import React, { useState } from 'react';
import { IoMdMicrophone } from 'react-icons/io';

const SpeechRecognition = () => {

    let [text, setText] = useState("");

    let handleClick = (e) => {
        e.preventDefault();
        let SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
        let recognition = new SpeechRecognition();

        recognition.onresult = (e) => {
            let textRes = e.results[0][0].transcript;
            setText(textRes);

            console.log(textRes);
            window.open(
                `https://www.youtube.com/results?search_query=${textRes}`,
                "_blank"
            )
        }

        recognition.start();
    }

    return (
        <div className='speech-container'>
            <form>
                <input type="text" name="text" id="text" value={text} onChange={(e) => setText(e.target.value)} placeholder='search' />
                <button type="submit">Search</button>
                <button type="button" onClick={handleClick}>
                    <IoMdMicrophone style={{ fontSize: "20px" }} />
                </button>
            </form>
        </div>
    )
}

export default SpeechRecognition;
