import { useParams } from "react-router-dom";
import BookCard from "../../Components/BookCard";
import { Menu } from "../../Components/Menu/Menu";
import { Book } from "../../types";
import AddShoppingCartIcon from '@material-ui/icons/AddShoppingCart';
import FavoriteBorderOutlinedIcon from '@material-ui/icons/FavoriteBorderOutlined';
import FavoriteIcon from '@material-ui/icons/Favorite';
import { AddToCartButton, AuthorText, Background, BlackText, BookTitle, ButtonsView, CoverImage, DetailsContainer, FavoriteButton, LinkStyle, MainContainer, Row, SectionTitle, SinopseContainer, SubText, WhiteText } from "./styles";
import { useState } from "react";
import { useGlobal } from "../../Contexts/Global/Global";

export default function BookDetails() {
    const allBooks = useGlobal().books;
    const setFavoriteBooks = useGlobal().setFavoriteBooks;
    const favoriteBooks = useGlobal().favoriteBooks;
    const addBookToShoppingCart = useGlobal().addBookToShoppingCart;

    let params = useParams();

    const book = allBooks.filter((b: Book) => b.id.toString() === params.bookId)[0];
    const [isFavorite, setIsFavorite] = useState(book.isFavorite);

    const sameAuthorBooks = allBooks.filter((b: Book) => b.author === book.author);

    const handleFavoriteButtonClick = () => {
        book.isFavorite = !book.isFavorite;
        setIsFavorite(!isFavorite);
        if(book.isFavorite) {
            favoriteBooks.push(book);
            setFavoriteBooks(favoriteBooks);
        }
        else {
            const filteredFavoriteBooks = favoriteBooks.filter(favoriteBook => favoriteBook !== book);
            setFavoriteBooks(filteredFavoriteBooks);
        }
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
                        <AddToCartButton onClick={() => addBookToShoppingCart(book)}>
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