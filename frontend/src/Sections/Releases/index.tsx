import BookCard from "../../Components/BookCard";
import { useGlobal } from "../../Contexts/Global/Global";
import { Book } from "../../types";
import { bookMock } from "../../__mock__/mock";
import { Button, Container, Row, SectionTitle } from "./styles";

export default function Releases() {
    //chamar api para obter livros. por enquanto usando objeto mockado
    const allBooks = useGlobal().books;
    console.log("RELEASES")
    const releaseBooks =  allBooks.filter((book: Book) => !book.isRelease); //bookMock.filter((book: Book) => book.isRelease);
    console.log(Object(releaseBooks));
    
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