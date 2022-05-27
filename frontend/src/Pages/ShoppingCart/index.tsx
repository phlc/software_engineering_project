import { useCallback, useEffect, useState } from "react"
import { useNavigate } from "react-router-dom"
import { purchase } from "../../Api/Purchase"
import { Menu } from "../../Components/Menu/Menu"
import { useGlobal } from "../../Contexts/Global/Global"
import { useToast } from "../../Contexts/Toast/Toast"
import { EmptyShoppingCart } from "./Empty"
import { Header } from "./Header"
import { ShoppingCartItem } from "./ShoppingCartItem"
import { Body, Container, TitleDiv, Card, TotalValue, TotalDiv } from "./styles"
import { SuccessRequest } from "./SuccessRequest"
import { ButtonDiv } from "./SuccessRequest/styles"

export const ShoppingCart = () => {
    const { shoppingCart, authenticatedUser, addBookToShoppingCart,setShoppingCart } = useGlobal()
    const { addToast } = useToast()
    const navigate = useNavigate()
    const [showSuccessRequest, setShowSuccessRequest] = useState(false)
    const [totalPrice, setTotalPrice] = useState(0.0)

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

            setShoppingCart([])
            setShowSuccessRequest(true)
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

    useEffect(() => {
        let aux = 0.0; 
        shoppingCart.forEach((item) => {aux += item.amount * item.book.price})

        setTotalPrice(aux)

    }, [shoppingCart])
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
                            (!showSuccessRequest && shoppingCart.length > 0) &&
                            (
                                <>
                                    <Header/>
                                    {
                                        shoppingCart.map((item) => (
                                            <ShoppingCartItem item={item} key={item.book.title}/>
                                        ))
                                    }
                                    {
                                        <TotalDiv>
                                            <div id="first-column"/>
                                            <div id="second-column"/>
                                            <div id="third-column"/>
                                            <TotalValue>{`R$ ${totalPrice}`}</TotalValue>
                                        </TotalDiv>
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
                                <>
                                    <EmptyShoppingCart />
                                    <button onClick={() => addBookToShoppingCart({
                                    id: 2,
                                    coverURL: 'https://images-na.ssl-images-amazon.com/images/I/51z0s3GcvwL._SX346_BO1,204,203,200_.jpg',
                                    rate: 33,
                                    rateNumber: 33,
                                    title: "string",
                                    author: "string",
                                    description: "string",
                                    price: 20.68,
                                    stock: 22.34,
                                    category: "string",
                                    releaseDate: new Date(),
                                    isRelease: true,
                                    isFavorite: true,
                                })}>add</button>
                                </>
                                
                            ) 
                        }
                        
                    </Body>
                </Card>
            </Container>
        </>
    )
}