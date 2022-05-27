import styled from "styled-components"

export const Container = styled.div`
    display: grid;
    grid-template-columns: 2fr 1fr 1fr 1fr;
    margin-top: 1rem;
    font-family: 'Montserrat-Regular';

    & .center-information {
        display: flex;
        align-items: center;
        justify-content: center;   
    }

    & #total-price {
        font-family: 'Montserrat-Bold';
    }
`
export const BookDescription = styled.div`
    display: flex;
    // border: 1px solid green;
`
export const BookImage = styled.img`
    width: 118px;
    height: 173px;
`
export const BookInfo = styled.div`
    display:flex;
    flex-direction: column;
    justify-content: end;
    
    text-align: left;
    padding: 0px 8px;
    width: 100%;
    height: auto;


    & #title {
        font-size: 20px;
        font-family: 'Montserrat-SemiBold';
        margin-bottom: 3px;
    }

    & #author {
        font-size: 16px;
        font-family: 'Montserrat-Regular';
        color: #515050;
    }
`

