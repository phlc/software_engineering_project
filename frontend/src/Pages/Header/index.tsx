import { Container, MainText } from "./styles";
import header from '../../assets/images/header.png';
import { Menu } from "../../Components/Menu/Menu";

export default function Header () {
    return (
        <Container style={{backgroundImage: `url(${header})`}}>
            <Menu style={{ backgroundColor: 'transparent' }}/>
            <MainText>Todos os seus livros{'\n'}preferidos em um só lugar</MainText>
        </Container>
    );
}