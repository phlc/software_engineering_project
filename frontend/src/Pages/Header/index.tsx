import { Container, ImageBackground } from "./styles";
import header from '../../assets/images/header.png';
import { Menu } from "../../Components/Menu/Menu";
export default function Header () {
    return (
        <Container>
            <ImageBackground src={header} alt='header image'/>
            <Menu style={{ backgroundColor: 'transparent' }}/>
        </Container>
    );
}