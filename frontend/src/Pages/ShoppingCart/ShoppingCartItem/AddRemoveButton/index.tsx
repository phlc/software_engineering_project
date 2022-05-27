import { useGlobal } from "../../../../Contexts/Global/Global"
import { Book, ShoppingCartItemType } from "../../../../types"
import { AddButton, Container, RemoveButton, Total } from "./styles"

type Props = {
    item:   ShoppingCartItemType;
    // setTotal: React.Dispatch<React.SetStateAction<number>>;
}

export const AddRemoveButton = ({item}: Props) => {
    const { addBookToShoppingCart, removeBookToShoppingCart } = useGlobal()

    return (
        <Container>
            <RemoveButton onClick={() => removeBookToShoppingCart(item.book.id)}>{"-"}</RemoveButton>
            <Total>{item.amount}</Total>
            <AddButton onClick={() => addBookToShoppingCart(item.book)}><span>+</span></AddButton>
        </Container>
    )
}