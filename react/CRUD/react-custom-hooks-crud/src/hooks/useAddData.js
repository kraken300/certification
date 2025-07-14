import { useEffect, useState } from "react";

function useAddData() {

    const addData = async (url, value) => {
        try {
            let response = await window.fetch(url, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(value)
            })

            // let data = await response.json();
            // console.log("Data added successfully!", data);
        } catch (error) {
            console.log("Error : " + error);
        }
    }

    return addData;

}

export default useAddData;