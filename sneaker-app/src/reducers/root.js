import { combineReducers } from "redux"
import productTop from "./product_top"

const rootReducer = combineReducers({
  productTop: productTop
})

export default rootReducer