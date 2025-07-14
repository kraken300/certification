import { createSlice } from "@reduxjs/toolkit";

let initialState = {
    users: []
}

export let userSlice = createSlice({
    name: "users",
    initialState,
    reducers: {
        setUser: (state, action) => {
            state.users = [...state.users, action.payload];
        },
        deleteUser: (state, action) => {
            state.users = state.users.filter(
                (user, index) => index !== action.payload
            )
        }
    }
})

export let {setUser, deleteUser} = userSlice.actions;
export default userSlice.reducer;