import BookCard from "../../Components/BookCard";
import { useGlobal } from "../../Contexts/Global/Global";
import { Book } from "../../types";
import { Button, Container, Row, SectionTitle } from "./styles";

export default function Releases() {
    const allBooks = useGlobal().books;
    const releaseBooks =  allBooks.filter((book: Book) => !book.isRelease);

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