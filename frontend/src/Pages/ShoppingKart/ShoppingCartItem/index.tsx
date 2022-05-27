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
                    <div>
                    <h4 id="title">{item.book.title}</h4>
                    </div>
                    <div><h6 id="author">{item.book.author}</h6></div>
                </BookInfo>
            </BookDescription>
            <div className="center-information">
                <AddRemoveButton item={item}/>
            </div>
            <div className="center-information">{`${item.days} dias`}</div>
            <div className="center-information">{item.book.price * item.amount}</div>
        </Container>
    )
}