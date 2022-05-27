import { Book } from '../../types';
import { BoldText, Container, CoverImage, DetailsView, OcultButton, Row, TitleText,  } from './styles';
import AddShoppingCartIcon from '@material-ui/icons/AddShoppingCart';
import { Link } from 'react-router-dom';
import { useState } from 'react';
import FavoriteBorderOutlinedIcon from '@material-ui/icons/FavoriteBorderOutlined';
import FavoriteIcon from '@material-ui/icons/Favorite';
import { useGlobal } from '../../Contexts/Global/Global';
import { setUserFavoriteBooks } from '../../Api/FavoriteBooksApi';

type BookCardProps = {
    book: Book;
};

export default function BookCard ({
    book,
}: BookCardProps) {
    const [isFavorite, setIsFavorite] = useState(book?.isFavorite);
    const setFavoriteBooks = useGlobal().setFavoriteBooks;
    const favoriteBooks = useGlobal().favoriteBooks;
    const user = useGlobal().authenticatedUser;
    const addBookToShoppingCart = useGlobal().addBookToShoppingCart;

    const handleFavoriteButtonClick = async () => {
        book.isFavorite = !book.isFavorite;
        setIsFavorite(!isFavorite);

        if(favoriteBooks.indexOf(book) === -1) {
            favoriteBooks.push(book);
            setFavoriteBooks(favoriteBooks);
        } else {
            setFavoriteBooks(favoriteBooks.filter(b => b !== book))
        }
        
        await setUserFavoriteBooks(user.id, book.id)
    };

    const formatTitle = () => {
        if(book?.title?.length > 30){
            return book.title.substring(0, 30) + ('...');
        }
        return book?.title;
    };

    const formatPrice = (price: number) => {
        return ('R$ ' + price.toFixed(2).toString().replace('.', ','));
    };
    
    return(
        <Container>
            <CoverImage src={book?.coverURL} />
            <DetailsView>
                <Link to={`/details/${book?.id}`} style={{ textDecoration: 'none'}}>
                <TitleText>{formatTitle()}</TitleText>
            </Link>
                <Row>
                    <BoldText>{formatPrice(book?.price)}</BoldText>
                    {
                        <OcultButton onClick={() => handleFavoriteButtonClick()}>
                            {   
                                isFavorite ?
                                <FavoriteIcon style={{ fontSize: 20}} /> :
                                <FavoriteBorderOutlinedIcon style={{ fontSize: 20}}/>
                            }
                        </OcultButton>
                    }
                    <AddShoppingCartIcon 
                        onClick={() => {addBookToShoppingCart(book)}} 
                        style={{ fontSize: 20}} 
                    />
                </Row>
            </DetailsView>
        </Container>

    );
}




