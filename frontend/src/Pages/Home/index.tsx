import Categories from "../../Sections/Categories"
import Header from "../../Sections/Header"
import Releases from "../../Sections/Releases"
import { Background } from "./styles"

export default function Home () {
    return (
        <Background>
            <Header />
            <Releases />
            <Categories />
        </Background>
    );
}