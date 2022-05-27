import { useState } from "react"
import { ShoppingCartItemType } from "../../../types"
import { AddRemoveButton } from "./AddRemoveButton"
import { Container, BookDescription, BookImage, BookInfo} from "./styles"

type Props = {
    item: ShoppingCartItemType
}

export const ShoppingCartItem = ({item}: Props) => {

    return (
        <Container>
            <BookDescription>
                <BookImage src={item.book.coverURL}/>
                <BookInfo>
                    <div id="title">{item.book.title}</div>
                    
                    <div id="author">{item.book.author}</div>
                </BookInfo>
            </BookDescription>
            <div className="center-information">
                <AddRemoveButton item={item}/>
            </div>
            <div className="center-information">{`${item.days} dias`}</div>
            <div className="center-information" id="total-price">R$ {item.book.price * item.amount}</div>
        </Container>
    )
}