function useUpdateData() {

    const updateData = async (url, value) => {
        try {
            let response = await fetch(url, {
                method: "PUT",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(value)
            })
        } catch (error) {
            console.log("Error : " + error);
        }
    }

    return updateData;
}

export default useUpdateData;