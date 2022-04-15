
import BookCard from "../../Components/BookCard"
import { Menu } from "../../Components/Menu/Menu"
import { Background } from "./style"
import React from 'react'

export default function Home () {
    return (
        <Background>
            <Menu/>
            <BookCard />
        </Background>
    )
}