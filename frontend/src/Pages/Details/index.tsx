import { Link, useParams } from "react-router-dom";
import BookCard from "../../Components/BookCard";
import { Menu } from "../../Components/Menu/Menu";
import { Book } from "../../types";
import { bookMock } from "../../__mock__/mock";
import ArrowForward from '@material-ui/icons/ArrowForward';
import { AuthorText, Background, BookTitle, CoverImage, DetailsContainer, LinkStyle, MainContainer, Row, SectionTitle, SinopseContainer, SubText } from "./styles";

export default function BookDetails() {
    let params = useParams();
    //obter livro pelo id. por enquanto usando objeto mockado
    const book = bookMock.filter((b: Book) => b.id.toString() === params.bookId)[0];
    //obter livros do autor pela nome do mesmo. por enquanto usando objeto mockado
    const sameAuthorBooks = bookMock.filter((b: Book) => b.author === book.author);
    return(
        <>
            <Menu />
            <Background>
                <SectionTitle>Sobre o livro</SectionTitle>
                <MainContainer>
                    <CoverImage src={book.coverURL} />
                    <DetailsContainer>
                        <BookTitle>{book.title}</BookTitle>
                        <AuthorText>{book.author}</AuthorText>
                        <SubText>{book.description}</SubText>
                        <Link to="/sinopse" style={LinkStyle}>Ver a sinopse completa  <ArrowForward fontSize="small"style={{ marginBottom: -5}}/></Link>
                    </DetailsContainer>
                </MainContainer>
                <SectionTitle>Mais livros de {book.author}</SectionTitle>
                <Row>
                    {sameAuthorBooks.map((b: Book) => <BookCard book={b} />)}
                </Row>
                <SectionTitle>Sinopse Completa</SectionTitle>
                <SinopseContainer>
                    <SubText>
                        {book.description}
                    </SubText>
                </SinopseContainer>
            </Background>
        </>
    );
}