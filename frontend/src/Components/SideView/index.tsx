import { useCallback, useState } from "react";
import { SideViewContainer } from "../../Pages/Category/styles";
import { BoldText, ButtonText, SortButton, TitleInput } from "./styles";
import AttachMoneyIcon from "@material-ui/icons/AttachMoney";
import DateRangeIcon from "@material-ui/icons/DateRange";
import { Book } from "../../types";
import { useLocal } from "../../Pages/Category/LocalContext";


export default function SideView() {
    const {books, setBooks} = useLocal();
    const [colorPriceButton, setColorPriceButton] = useState('black');
    const [colorDateButton, setColorDateButton] = useState('black');
    const [titleQuery, setTitleQuery] = useState("");
    const windowHeight = window.outerHeight;

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

    return(
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
    );
}