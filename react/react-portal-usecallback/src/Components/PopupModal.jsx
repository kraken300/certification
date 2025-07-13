import React from 'react'
import { createPortal } from 'react-dom'
import { IoIosClose } from 'react-icons/io';

const PopupModal = () => {
    return createPortal(
        <div className="sub-popup">
            <IoIosClose
                className="close-btn"
                onClick={
                    (e) => {
                        document.querySelector(".modal-container").style.display = "none";
                    }
                }

            />
            <h1>Popup</h1>
        </div>, document.querySelector(".modal-container")
    )
}

export default PopupModal
