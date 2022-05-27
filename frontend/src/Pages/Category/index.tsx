import React, { useCallback, useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { Menu } from "../../Components/Menu/Menu";
import {
  Background,
  BoldText,
  ButtonText,
  Container,
  Divider,
  InvisibleButton,
  Row,
  SectionTitle,
  SideViewContainer,
  SortButton,
  styles,
  TitleInput,
} from "./styles";
import BookCard from "../../Components/BookCard";
import { useGlobal } from "../../Contexts/Global/Global";

import { Book, FavoriteBook } from "../../types";
import AttachMoneyIcon from "@material-ui/icons/AttachMoney";
import DateRangeIcon from "@material-ui/icons/DateRange";
import SearchIcon from "@material-ui/icons/Search";
import { getUserFavoriteBooks } from "../../Api/FavoriteBooksApi";
import { EmptyCategory } from "./Empty";

export default function Category() {
  const allBooks = useGlobal().books;
  const user = useGlobal().authenticatedUser;
  const windowHeight = window.outerHeight;
  const [books, setBooks] = useState([] as Book[]);
  const [colorPriceButton, setColorPriceButton] = useState("black");
  const [colorDateButton, setColorDateButton] = useState("black");
  const [titleQuery, setTitleQuery] = useState("");

  let params = useParams();

  const setFilteredBooks = async () => {
    if (user.cpf) {
      let userFavorites = [] as Book[];
      const response = await getUserFavoriteBooks(user.id);
      response.forEach((favBook: FavoriteBook) =>
        userFavorites.push(favBook.book)
      );
      const booksWithFavorites = allBooks.map((book: Book) => {
        const index = userFavorites.indexOf(book);
        if (index > -1) {
          book.isFavorite = true;
        }
        return book;
      });
      setBooks(
        booksWithFavorites.filter((book) => book.category === params.name)
      );
    } else {
      const filteredBooks = allBooks.filter(
        (book) => book.category === params.name
      );
      setBooks(filteredBooks);
    }
  };
  useEffect(() => {
    setFilteredBooks();
  }, [params.name, allBooks]);

  const booksView = useCallback(() => {
    return (books.length > 0 ? (
      books.map((book) => {
        return (
          <Divider>
            <BookCard book={book} />
          </Divider>
        );
      })
    ) : (
      <EmptyCategory />
    ))
  }, [books]);

  const handleSortByPrice = useCallback(() => {
    setColorPriceButton("#F05423");
    setColorDateButton("black");
    const orderedBooks = books.sort((a: Book, b: Book) => a.price - b.price);
    setBooks(orderedBooks);
  }, [books, setBooks]);

  const handleSortByDate = useCallback(() => {
    setColorPriceButton("black");
    setColorDateButton("#F05423");

    const orderedBooks = books.sort((a: Book, b: Book) => {
      return (
        new Date(b.releaseDate).getTime() - new Date(a.releaseDate).getTime()
      );
    });

    setBooks(orderedBooks);
  }, [books, setBooks]);

  const handleSearch = useCallback(() => {
    setColorPriceButton("black");
    setColorDateButton("#F05423");

    let filteredBooks = books.filter(
      (book) =>
        book.title.toLocaleLowerCase() === titleQuery.toLocaleLowerCase()
    );
    if (!filteredBooks.length) {
      filteredBooks = allBooks;
    }

    setBooks(filteredBooks);
  }, [allBooks, books, titleQuery]);

  return (
    <>
      <Menu />
      <Container>
        <SideViewContainer style={{ height: windowHeight }}>
          <Row>
            <TitleInput
              type="text"
              value={titleQuery}
              placeholder={"Digite o nome de um livro"}
              onChange={(query) => setTitleQuery(query.target.value)}
            />
            <InvisibleButton onClick={() => handleSearch()}>
              <SearchIcon style={styles.searchStyle} />
            </InvisibleButton>
          </Row>
          <BoldText>Ordenar por:</BoldText>
          <SortButton onClick={() => handleSortByPrice()}>
            <AttachMoneyIcon
              style={{
                color: colorPriceButton,
                fontSize: 20,
                verticalAlign: "middle",
                marginRight: 5,
              }}
            />
            <ButtonText style={{ color: colorPriceButton }}>
              Menor preço
            </ButtonText>
          </SortButton>
          <SortButton onClick={() => handleSortByDate()}>
            <DateRangeIcon
              style={{
                color: colorDateButton,
                fontSize: 20,
                verticalAlign: "middle",
                marginRight: 5,
              }}
            />
            <ButtonText style={{ color: colorDateButton }}>
              Data de lançamento
            </ButtonText>
          </SortButton>
        </SideViewContainer>
        <Background style={{ height: windowHeight }}>
          <SectionTitle>Livros de {params.name}</SectionTitle>
          {<Row>{booksView()}</Row>}
        </Background>
      </Container>
    </>
  );
}
