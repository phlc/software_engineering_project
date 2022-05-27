import { Container } from "./styles";
import boxes from "../../../assets/images/boxes.png";

export const EmptyCategory = () => (
    <Container>
        <div>
        <img src={boxes} width="270px" height="200px"/>

        </div>
        <h2>Ops...</h2>
        <span>Esta categoria ainda não tem livros! Mas não se preocupe, já estamos desempacotando as caixas! 😊</span>
    </Container>
)