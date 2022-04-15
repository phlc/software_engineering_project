import React from 'react';
import { Book } from '../../types';
import { BoldText, Container, CoverImage, DetailsView, Row, TitleText,  } from './styles';

type BookCardProps = {
    book: Book;
    
};

export default function BookCard ({
    book,
}: BookCardProps) {
    return(
        <Container>
            <DetailsView>
                <TitleText>{book.title}</TitleText>
                <Row>
                    <BoldText>{'R$ ' + book.price.toString()}</BoldText>
                </Row>
            </DetailsView>
        </Container>
    );
}




