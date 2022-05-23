import { Link, useParams } from "react-router-dom";
import BookCard from "../../Components/BookCard";
import { Menu } from "../../Components/Menu/Menu";
import { Book } from "../../types";
import { bookMock } from "../../__mock__/mock";
import ArrowForward from '@material-ui/icons/ArrowForward';
import AddShoppingCartIcon from '@material-ui/icons/AddShoppingCart';
import FavoriteBorderOutlinedIcon from '@material-ui/icons/FavoriteBorderOutlined';
import FavoriteIcon from '@material-ui/icons/Favorite';
import { AddToCartButton, AuthorText, Background, BlackText, BookTitle, ButtonsView, CoverImage, DetailsContainer, FavoriteButton, LinkStyle, MainContainer, Row, SectionTitle, SinopseContainer, SubText, WhiteText } from "./styles";
import { useState } from "react";

export default function BookDetails() {
    //atualizar default depois de acordo com os favoritos do usuario logado
    
    let params = useParams();
    //obter livro pelo id. por enquanto usando objeto mockado
    const book = bookMock.filter((b: Book) => b.id.toString() === params.bookId)[0];
    const [isFavorite, setIsFavorite] = useState(book.isFavorite);
    //obter livros do autor pela nome do mesmo. por enquanto usando objeto mockado
    const sameAuthorBooks = bookMock.filter((b: Book) => b.author === book.author);

    const handleAddCardButtonClick = (book: Book) => {
        
    };

    const handleFavoriteButtonClick = () => {
        book.isFavorite = !book.isFavorite;
        setIsFavorite(!isFavorite);
    };

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
                        {/* <Link to="/sinopse" style={LinkStyle}>Ver a sinopse completa  <ArrowForward fontSize="small"style={{ marginBottom: -5}}/></Link> */}
                    </DetailsContainer>
                    <ButtonsView>
                        <FavoriteButton onClick={() => handleFavoriteButtonClick()}>
                            {
                                isFavorite ?
                                <FavoriteIcon style={{ marginRight: 5}} /> :
                                <FavoriteBorderOutlinedIcon style={{ marginRight: 5}}/>
                            }
                            <BlackText>Favoritar</BlackText>
                        </FavoriteButton>
                        <AddToCartButton onClick={() => handleAddCardButtonClick(book)}>
                            <AddShoppingCartIcon style={{ color: 'white', marginRight: 5}}/>
                            <WhiteText>Adic. ao carrinho</WhiteText>
                        </AddToCartButton>
                    </ButtonsView>
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