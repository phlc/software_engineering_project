import React, { useCallback, useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { Menu } from "../../Components/Menu/Menu";
import {
  Background,
  Container,
  Divider,
  Row,
  SectionTitle,
} from "./styles";
import { bookMock } from "../../__mock__/mock";
import BookCard from "../../Components/BookCard";
import { useGlobal } from "../../Contexts/Global/Global";

import { Book } from "../../types";
import SideView from "../../Components/SideView";
import { LocalProvider } from "./LocalContext";

export default function Category() {
  const allBooks = useGlobal().books;
  const windowHeight = window.outerHeight;
  const [books, setBooks] = useState([] as Book[]);

  let params = useParams();
  //filtrar livros da categoria. por enquanto usando objeto mockado
  useEffect(() => {
    const filteredBooks = allBooks//allBooks.filter((book) => book.category === params.name);
    setBooks(filteredBooks);
  }, [params.name, allBooks])

  // books.forEach(book => books.push(book))
  // books.forEach(book => books.push(book))
  // books.forEach(book => books.push(book))
  // books.forEach(book => books.push(book))
  
  const booksView = useCallback(() => (
      books.map((book) => {
          return (
            <Divider>
                <BookCard book={book} />
            </Divider>
        );
    })
    ), [books])
    
    useEffect(() => {
        console.log("ENTREI")
    }, [books])
    
    useEffect(() => {
        booksView()
    }, [booksView])
    
  return (
    <LocalProvider value={{ books, setBooks }}>
      <Menu />
      <Container>
        <SideView />
        <Background style={{ height: windowHeight }}>
          <SectionTitle>Livros de {params.name}</SectionTitle>
          {
            <Row>
                {booksView()}
            </Row>
          }
        </Background>
      </Container>
    </LocalProvider>
  );
}
