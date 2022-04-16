import React from 'react';
import { Book } from '../../types';
import { BoldText, Container, CoverImage, DetailsView, Row, TitleText,  } from './styles';
import AddShoppingCartIcon from '@material-ui/icons/AddShoppingCart';

type BookCardProps = {
    book: Book;
    
};

export default function BookCard ({
    book,
}: BookCardProps) {
    return(
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
    );
}




