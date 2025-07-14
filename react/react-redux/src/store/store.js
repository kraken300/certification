import { configureStore } from "@reduxjs/toolkit";
import userReducer from "../slice/userSlice";

let store = configureStore({
    reducer: {
        userInfo: userReducer,
        // productsInfo:productReducer,
        // studentInfo:studentReducer
    }
})

export default store;