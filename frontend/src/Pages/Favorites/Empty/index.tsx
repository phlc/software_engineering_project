import { Container } from "./styles";
import favorite from "../../../assets/images/favorite.png";

export const EmptyFavorites = () => (
    <Container>
        <div>
        <img src={favorite} width="200px" height="200px"/>

        </div>
        <h2>Ops...</h2>
        <span>Você ainda não tem favoritos... O que acha de adicionar alguns?</span>
    </Container>
)