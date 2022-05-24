import React, { useState } from "react";
import { useParams } from "react-router-dom";
import { Menu } from "../../Components/Menu/Menu";
import { Background, Container, Divider, Row, SectionTitle, SideView, TitleInput } from "./styles";
import { bookMock } from "../../__mock__/mock";
import BookCard from "../../Components/BookCard";
import { useGlobal } from "../../Contexts/Global/Global";

export default function Category() {
    const allBooks = useGlobal().books;
    const windowHeight = window.outerHeight;
    const [titleQuery, setTitleQuery] = useState('');
    let params = useParams();
    //filtrar livros da categoria. por enquanto usando objeto mockado
    const books = allBooks.filter(book => book.category === params.name);
    // books.forEach(book => books.push(book))
    // books.forEach(book => books.push(book))
    // books.forEach(book => books.push(book))
    // books.forEach(book => books.push(book))
    // books.forEach(book => books.push(book))

    const handleQuery = (query: string) => {
        setTitleQuery(query);
        console.log(titleQuery);
    }

    return (
        <>
            <Menu />
            <Container>
                <SideView style={{ height: windowHeight }}>
                <TitleInput type="text" value={titleQuery} placeholder={"Digite o nome de um livro"} onChange={(query) => handleQuery(query.target.value)} />
                </SideView>
                <Background style={{ height: windowHeight }}>
                    <SectionTitle>Livros de {params.name}</SectionTitle>
                    {
                        <Row>
                            {
                                books.map((book) => {
                                    return (
                                        <Divider>
                                            <BookCard book={book}/>
                                        </Divider>
                                    )
                                })
                            }
                        </Row>
                    }
                </Background>
            </Container>
        </>
    );
}