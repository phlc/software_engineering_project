import { useNavigate } from "react-router-dom";
import BookCard from "../../Components/BookCard";
import { useGlobal } from "../../Contexts/Global/Global";
import { Book } from "../../types";
import { bookMock } from "../../__mock__/mock";
import { Button, Container, Row, SectionTitle } from "./styles";

export default function Releases() {
    const allBooks = useGlobal().books;
    const releaseBooks =  allBooks.filter((book: Book) => !book.isRelease);
    const displayedReleaseBooks = releaseBooks.length > 5 ? releaseBooks.slice(0, 5) : releaseBooks;
    const navigate = useNavigate();

    return(
        <Container>
            <SectionTitle>Lançamentos</SectionTitle>
            <Row>
                {displayedReleaseBooks.map((book) => <BookCard book={book} />)}
            </Row>
            <Button onClick={() => navigate('/Releases')}>Ver todos</Button>
        </Container>
    );
}