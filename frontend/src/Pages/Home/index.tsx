import { Menu } from "../../Components/Menu/Menu"
import Releases from "../Releases"
import { Background } from "./styles"

export default function Home () {

    const bookMock = [{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda'
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda'
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda'
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda'
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda'
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda'
    }]

    return (
        <Background>
            <Menu/>
            <Releases books={bookMock} />
        </Background>
    )
}