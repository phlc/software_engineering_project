import successIcon from "../../../assets/images/success.png"
import { Container, Info } from "./styles"

export const SuccessRequest = () => {
    return (
        <Container>
            <div>
                <img src={successIcon} width="200px" height="200px"/>
            </div>
            <h2 id="title">Pedido realizado com sucesso!</h2>
            <span id="info">Você receberá um email com mais informações sobre sua compra por email.</span>
            <span id="info">Qualquer dúvida entre em contato com a nossa central de atendimento:</span>
            <Info>
                <span id="first-span">lpsBookStore@gmail.com</span>
                <span>021 3333-9965</span>
            </Info>
        </Container>
    )
}