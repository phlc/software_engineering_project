import { AuthenticatedUser, Book } from '../../types';
import { BoldText, Container, CoverImage, DetailsView, OcultButton, Row, TitleText,  } from './styles';
import AddShoppingCartIcon from '@material-ui/icons/AddShoppingCart';
import { Link } from 'react-router-dom';
import { useEffect, useState } from 'react';
import { getAllUsers } from '../../Api/ClientApi';
import FavoriteBorderOutlinedIcon from '@material-ui/icons/FavoriteBorderOutlined';
import FavoriteIcon from '@material-ui/icons/Favorite';

type BookCardProps = {
    book: Book;
};

export default function BookCard ({
    book,
}: BookCardProps) {
    const [isFavorite, setIsFavorite] = useState(book.isFavorite);

    const handleFavoriteButtonClick = () => {
        book.isFavorite = !book.isFavorite;
        setIsFavorite(!isFavorite);
    };
    
    return(
        <Container>
            <CoverImage src={book.coverURL} />
            <DetailsView>
                <Link to={`/details/${book.id}`} style={{ textDecoration: 'none'}}>
                <TitleText>{book.title}</TitleText>
            </Link>
                <Row>
                    <BoldText>{'R$ ' + book.price.toString()}</BoldText>
                    {
                        <OcultButton onClick={() => handleFavoriteButtonClick()}>
                            {   
                                isFavorite ?
                                <FavoriteIcon style={{ fontSize: 20}} /> :
                                <FavoriteBorderOutlinedIcon style={{ fontSize: 20}}/>
                            }
                        </OcultButton>
                    }
                    <AddShoppingCartIcon style={{ fontSize: 20}} />
                </Row>
            </DetailsView>
        </Container>

    );
}




