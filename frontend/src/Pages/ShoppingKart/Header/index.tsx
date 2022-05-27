import { Container, HeaderItem } from "./styles"

export const Header = () => {
    return (
        <Container>
            <HeaderItem id="produto">Produto</HeaderItem>
            <HeaderItem>Quantidade</HeaderItem>
            <HeaderItem>Entrega</HeaderItem>
            <HeaderItem>Total</HeaderItem>
        </Container>
    )
}