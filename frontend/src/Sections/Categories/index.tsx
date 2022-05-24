import CategoryCard from "../../Components/CategoryCard";
import { Container, Row, SectionTitle } from "./styles";
import autoajuda from '../../assets/images/autoajuda.png';
import biografia from '../../assets/images/biografia.png';
import romance from '../../assets/images/romance.png';
import poesia from '../../assets/images/poesia.png';
import suspense from '../../assets/images/suspense.png';
import ficcao from '../../assets/images/ficcao-cientifica.png';
import fantasia from '../../assets/images/fantasia.png';
import informatica from '../../assets/images/informatica.png';

export default function Categories () {
    return(    
        <Container>
            <SectionTitle>Categorias</SectionTitle>
            <Row>
                <CategoryCard name="Autoajuda" urlImage={autoajuda}/>
                <CategoryCard name="Biografia" urlImage={biografia}/>
                <CategoryCard name="Informática" urlImage={informatica}/>
                <CategoryCard name="Ficção-científica" urlImage={ficcao}/>
            </Row>
            <Row>
                <CategoryCard name="Fantasia" urlImage={fantasia}/>
                <CategoryCard name="Romance" urlImage={romance}/>
                <CategoryCard name="Terror" urlImage={suspense}/>
                <CategoryCard name="Poesia" urlImage={poesia}/>
            </Row>
        </Container>
    )
}