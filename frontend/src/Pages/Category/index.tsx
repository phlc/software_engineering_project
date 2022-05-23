import React from "react";
import { useParams } from "react-router-dom";
import { Menu } from "../../Components/Menu/Menu";
import { Background, Container, Divider, Row, SectionTitle, SideView } from "./styles";
import { bookMock } from "../../__mock__/mock";
import BookCard from "../../Components/BookCard";

export default function Category() {
    let params = useParams();
    //filtrar livros da categoria. por enquanto usando objeto mockado
    const books = bookMock.filter(book => book.category === params.name);
    books.forEach(book => books.push(book))
    books.forEach(book => books.push(book))
    books.forEach(book => books.push(book))
    books.forEach(book => books.push(book))
    books.forEach(book => books.push(book))

    return (
        <>
            <Menu />
            <Container>
                <SideView>
                    <SectionTitle>Livros de {params.name}</SectionTitle>
                </SideView>
                <Background>
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