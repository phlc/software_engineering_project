import BookCard from "../../Components/BookCard";
import { Book } from "../../types";
import { bookMock } from "../../__mock__/mock";
import { Button, Container, Row, SectionTitle } from "./styles";

export default function Releases() {
    //chamar api para obter livros. por enquanto usando objeto mockado

    const releaseBooks = bookMock.filter((book: Book) => book.isRelease);

    return(
        <Container>
            <SectionTitle>Lançamentos</SectionTitle>
            <Row>
                {releaseBooks.map((book) => <BookCard book={book} />)}
            </Row>
            <Button>Ver todos</Button>
        </Container>
    );
}