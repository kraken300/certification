function useDeleteData() {

    const deleteData = async (url) => {
        try {
            let response = await fetch(url, {
                method: "DELETE"
            });
        } catch (error) {
            console.log("Error : " + error)
        }
    }

    return deleteData;

}

export default useDeleteData;