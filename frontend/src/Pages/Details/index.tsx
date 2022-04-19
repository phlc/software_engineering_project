import { useParams } from "react-router-dom";
import { Menu } from "../../Components/Menu/Menu";
import { Book } from "../../types";
import { bookMock } from "../../__mock__/mock";
import { Background, CoverImage, MainContainer, SectionTitle } from "./styles";

export default function BookDetails() {
    let params = useParams();
    //obter livro pelo id. por enquanto usando objeto mockado
    const book = bookMock.filter((b: Book) => b.id.toString() === params.bookId)[0];
    return(
        <Background>
            <Menu />
            <SectionTitle>Sobre o livro</SectionTitle>
            <MainContainer>
                <CoverImage src={book.coverURL} />
            </MainContainer>
        </Background>
    );
}