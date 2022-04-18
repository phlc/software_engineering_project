import CategoryCard from "../../Components/CategoryCard";
import { Container, Row, SectionTitle } from "./styles";
import biografia from '../../assets/images/biografia.png';
import romance from '../../assets/images/romance.png';
import poesia from '../../assets/images/poesia.png';
import suspense from '../../assets/images/suspense.png';
import ficcao from '../../assets/images/ficcao-cientifica.png';

export default function Categories () {
    return(    
        <Container>
            <SectionTitle>Categorias</SectionTitle>
            <Row>
                <CategoryCard name="Autoajuda" urlImage=""/>
                <CategoryCard name="Biografia" urlImage={biografia}/>
                <CategoryCard name="Informática" urlImage=""/>
                <CategoryCard name="Ficção-científica" urlImage={ficcao}/>
            </Row>
            <Row>
                <CategoryCard name="Fantasia" urlImage=""/>
                <CategoryCard name="Romance" urlImage={romance}/>
                <CategoryCard name="Suspense" urlImage={suspense}/>
                <CategoryCard name="Poesia" urlImage={poesia}/>
            </Row>
        </Container>
    )
}