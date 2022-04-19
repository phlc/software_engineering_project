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
            <Title>{name}</Title>
        </Container>
    );
}