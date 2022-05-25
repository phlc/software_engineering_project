import React, { useCallback, useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { Menu } from "../../Components/Menu/Menu";
import {
  Background,
  BoldText,
  ButtonText,
  Container,
  Divider,
  Row,
  SectionTitle,
  SideViewContainer,
  SortButton,
  TitleInput,
} from "./styles";
import BookCard from "../../Components/BookCard";
import { useGlobal } from "../../Contexts/Global/Global";

import { Book } from "../../types";
import { LocalProvider } from "./LocalContext";
import AttachMoneyIcon from "@material-ui/icons/AttachMoney";
import DateRangeIcon from "@material-ui/icons/DateRange";

export default function Category() {
  const allBooks = useGlobal().books;
  const windowHeight = window.outerHeight;
  const [books, setBooks] = useState([] as Book[]);
  const [colorPriceButton, setColorPriceButton] = useState('black');
  const [colorDateButton, setColorDateButton] = useState('black');
  const [titleQuery, setTitleQuery] = useState("");

  let params = useParams();
  //filtrar livros da categoria. por enquanto usando objeto mockado
  useEffect(() => {
    const filteredBooks = allBooks//allBooks.filter((book) => book.category === params.name);
    setBooks(filteredBooks);
  }, [params.name, allBooks])

  // books.forEach(book => books.push(book))
  // books.forEach(book => books.push(book))
  // books.forEach(book => books.push(book))
  // books.forEach(book => books.push(book))
  
  const booksView = useCallback(() => (
      books.map((book) => {
          return (
            <Divider>
                <BookCard book={book} />
            </Divider>
        );
    })
    ), [books])
    
  const handleQuery = useCallback((query: string) => {
      setTitleQuery(query);
      console.log(titleQuery);
  }, [titleQuery]);
  
  const handleSortByPrice = useCallback( () => {
      setColorPriceButton('#F05423');
      setColorDateButton('black');
      const orderedBooks = books.sort((a: Book, b: Book) => a.price - b.price);
      console.log(orderedBooks)
      setBooks(orderedBooks);
  },[books, setBooks]);

  const handleSortByDate = () => {
      setColorPriceButton('black');
      setColorDateButton('#F05423');
      
      const orderedBooks = books.sort((a: Book, b: Book) => {
          return b.releaseDate.getTime() - a.releaseDate.getTime();
      });
      setBooks(orderedBooks);
      console.log(orderedBooks);
  };

  return (
    <LocalProvider value={{ books, setBooks }}>
      <Menu />
      <Container>
      <SideViewContainer style={{ height: windowHeight }}>
          <TitleInput
            type="text"
            value={titleQuery}
            placeholder={"Digite o nome de um livro"}
            onChange={(query) => handleQuery(query.target.value)}
          />
          <BoldText>Ordenar por:</BoldText>
          <SortButton onClick={() => handleSortByPrice()}>
            <AttachMoneyIcon
              style={{ color: colorPriceButton, fontSize: 20, verticalAlign: "middle", marginRight: 5 }}
            />
            <ButtonText style={{color: colorPriceButton}}>Menor preço</ButtonText>
          </SortButton>
          <SortButton onClick={() => handleSortByDate()}>
            <DateRangeIcon
              style={{ color: colorDateButton, fontSize: 20, verticalAlign: "middle", marginRight: 5 }}
            />
            <ButtonText style={{color: colorDateButton}}>Data de lançamento</ButtonText>
          </SortButton>
        </SideViewContainer>
        <Background style={{ height: windowHeight }}>
          <SectionTitle>Livros de {params.name}</SectionTitle>
          {
            <Row>
                {booksView()}
            </Row>
          }
        </Background>
      </Container>
    </LocalProvider>
  );
}
