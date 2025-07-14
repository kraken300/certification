import { useEffect, useState } from "react";

function useFetchData(url){
    let [data, setData] = useState();

    useEffect(()=>{
        window.fetch(url)
        .then(
            (data)=>{
                data.json()
                .then(
                    (fetchedData)=>{
                        console.log(fetchedData);
                        setData(fetchedData);
                    },
                    (error)=>console.log(error),
                )
            },
            (error)=>console.log(error),
        )
    },[]);

    return data;
}

export default useFetchData;