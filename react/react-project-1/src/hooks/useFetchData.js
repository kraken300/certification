import axios from "axios";
import { useEffect, useState } from "react";

function useFetchData(url) {

    let [data, setData] = useState(null);

    useEffect(() => {
        axios.get(url)
            .then(
                (data) => {
                    setData(data.data);
                },
                (error) => console.log(error),
            )
    }, []);

    return data;
}

export default useFetchData;