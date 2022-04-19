import React from 'react';
import { Book } from '../../types';
import { BoldText, Container, CoverImage, DetailsView, Row, TitleText,  } from './styles';
import AddShoppingCartIcon from '@material-ui/icons/AddShoppingCart';
import { Link } from 'react-router-dom';

type BookCardProps = {
    book: Book;
};

export default function BookCard ({
    book,
}: BookCardProps) {
    return(
        <Link to={`/details/${book.id}`} style={{ textDecoration: 'none'}}>
            <Container>
                <CoverImage src={book.coverURL}/>
                <DetailsView>
                    <TitleText>{book.title}</TitleText>
                    <Row>
                        <BoldText>{'R$ ' + book.price.toString()}</BoldText>
                        <AddShoppingCartIcon />
                    </Row>
                </DetailsView>
            </Container>
        </Link>
    );
}




