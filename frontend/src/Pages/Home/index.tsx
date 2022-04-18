import { Menu } from "../../Components/Menu/Menu"
import { Book } from "../../types"
import Header from "../Header"
import Releases from "../Releases"
import { Background } from "./styles"

export default function Home () {

    const bookMock: Book[] = [{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda',
        releaseDate: '20/01/1995',
        isRelease: true,
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda',
        releaseDate: '20/01/1995',
        isRelease: true,
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda',
        releaseDate: '20/01/1995',
        isRelease: true,
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda',
        releaseDate: '20/01/1995',
        isRelease: true,
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda',
        releaseDate: '20/01/1995',
        isRelease: true,
    },{
        coverURL: 'https://m.media-amazon.com/images/I/5144Ghp-b8L.jpg',
        rate: 4,
        title: 'A sutil arte de ligar o foda-se',
        author: 'Mark Manson',
        description: 'Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.',
        price: 20.93,
        stock: 4,
        category: 'Auto Ajuda',
        releaseDate: '20/01/1995',
        isRelease: true,
    }]

    return (
        <Background>
            <Header />
            <Releases books={bookMock} />
        </Background>
    )
}