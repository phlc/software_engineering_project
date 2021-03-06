import { BrowserRouter, Route, Routes,   } from "react-router-dom";
import BookDetails from "../Pages/Details";
import Home from "../Pages/Home";
import Category from "../Pages/Category";
import Categories from "../Sections/Categories";
import { ShoppingCart } from "../Pages/ShoppingCart";
import Favorites from "../Pages/Favorites";
import Releases from "../Pages/Releases";

export default function AppRoutes() {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home/>} >
                    <Route path="/categories" element={<Categories />} />
                </Route>
                <Route path="/releases" element={<Releases/>} />
                <Route path="/favorites" element={<Favorites />} />
                <Route path="/details/:bookId" element={<BookDetails />} />
                <Route path="/category/:name" element={<Category />} />
                <Route path="/shopping-cart" element={<ShoppingCart />} />
            </Routes>
        </BrowserRouter>
    )
}