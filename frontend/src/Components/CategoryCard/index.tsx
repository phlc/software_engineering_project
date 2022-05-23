import { Link } from "react-router-dom";
import { Container, Title } from "./styles";

type CategoryCardProps = {
    name: string;
    urlImage: string;
};

export default function CategoryCard({
    name,
    urlImage,
}: CategoryCardProps) {
    return (
            <Container style={{ backgroundImage: `url(${urlImage})` }}>
                <Link to={`/category/${name}`} style={{ textDecoration: 'none'}}>
                    <Title>{name}</Title>
                </Link>
            </Container>
    );
}