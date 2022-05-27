import { Container } from "./styles";
import shoppingCartIcon from "../../../assets/images/shoppingCart.png";

export const EmptyShoppingCart = () => (
    <Container>
        <div>
        <img src={shoppingCartIcon} width="200px" height="200px"/>

        </div>
        <h2>Ops...</h2>
        <span>Seu carrinho está vazio</span>
    </Container>
)