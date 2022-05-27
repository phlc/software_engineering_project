import { useCallback, useState } from "react"
import { useNavigate } from "react-router-dom"
import { purchase } from "../../Api/Purchase"
import { Menu } from "../../Components/Menu/Menu"
import { useGlobal } from "../../Contexts/Global/Global"
import { useToast } from "../../Contexts/Toast/Toast"
import { EmptyShoppingCart } from "./Empty"
import { Header } from "./Header"
import { ShoppingCartItem } from "./ShoppingCartItem"
import { Body, Container, TitleDiv, Card } from "./styles"
import { SuccessRequest } from "./SuccessRequest"
import { ButtonDiv } from "./SuccessRequest/styles"

export const ShoppingCart = () => {
    const { shoppingCart, authenticatedUser, addBookToShoppingCart } = useGlobal()
    const { addToast } = useToast()
    const navigate = useNavigate()
    const [showSuccessRequest, setShowSuccessRequest] = useState(false)

    const sendRequest = useCallback(() => {
        try {
            let booksId = "["
            shoppingCart.forEach((item, i) => 
            booksId += ( 
                    i < shoppingCart.length - 1
                    ? `${(item.book.id)},` 
                    :  `${(item.book.id)}`
                )
            );

            booksId += "]"
            const response = purchase(booksId, `${authenticatedUser.id}`)
        } catch (error) {
            addToast({
                type:"error",
                title: "Algo deu errado",
                description: "Não foi possível realizar compra."
            })
        }
    }, [])

    const finishFlow = useCallback(() => {
        navigate('/')
        setShowSuccessRequest(false);
    }, [])
    return (
        <>
            <Menu />
            <Container>
                <TitleDiv>
                    {showSuccessRequest ? "Pedido realizado" : "Meu carrinho"}
                </TitleDiv>
                <Card>
                    <Body>
                        {
                            shoppingCart.length > 0 &&
                            (
                                <>
                                    <Header/>
                                    {
                                        shoppingCart.map((item) => (
                                            <ShoppingCartItem item={item} key={item.book.title}/>
                                        ))
                                    }
                                    <ButtonDiv>
                                        <button 
                                            onClick={() => sendRequest()}
                                        >
                                            { "Finalizar compra"}
                                        </button>
                                    </ButtonDiv>
                                </>
                            ) 
                        }
                        {
                            showSuccessRequest && (
                                <>
                                
                                    <SuccessRequest />
                                    <ButtonDiv>
                                        <button 
                                            onClick={() => finishFlow()}
                                        >
                                            { "Entendi"}
                                        </button>
                                    </ButtonDiv>
                                </>
                            )
                        }
                        {
                            (!showSuccessRequest && shoppingCart.length === 0)&& (
                                <EmptyShoppingCart />
                            ) 
                        }
                        
                    </Body>
                </Card>
            </Container>
        </>
    )
}