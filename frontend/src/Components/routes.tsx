import { BrowserRouter, Route, Routes,   } from "react-router-dom";
import Categories from "../Pages/Categories";
import BookDetails from "../Pages/Details";
import Home from "../Pages/Home";
import Releases from "../Pages/Releases";

export default function AppRoutes() {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home/>} >
                    <Route path="/releases" element={<Releases/>} />
                    <Route path="/categories" element={<Categories />} />
                </Route>
                <Route path="/details/:bookId" element={<BookDetails />} />
            </Routes>
        </BrowserRouter>
    )
}