import BookCard from "../../Components/BookCard";
import { Book } from "../../types";
import { Container, Row, SectionTitle } from "./styles";

type ReleasesProps = {
    books: Book[];
};

export default function Releases({
    books
}: ReleasesProps) {
    const releaseBooks = books.filter((book) => book.isRelease);

    return(
        <Container>
            <SectionTitle>Lançamentos</SectionTitle>
            <Row>
                {releaseBooks.map((book) => <BookCard book={book} />)}
            </Row>
        </Container>
    )
}