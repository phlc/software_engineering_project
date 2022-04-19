import { BrowserRouter, Route, Routes } from "react-router-dom"
import { bookMock } from "../../__mock__/mock"
import Categories from "../Categories"
import Header from "../Header"
import Releases from "../Releases"
import { Background } from "./styles"

export default function Home () {
    return (
        <Background>
            <Header />
            <Releases />
            <Categories />
        </Background>
    )
}