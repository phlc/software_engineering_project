import styled from "styled-components"

export const Container = styled.div`
    display: grid;
    grid-template-columns: 2fr 1fr 1fr 1fr;
    margin-top: 1rem;

    & .center-information {
        display: flex;
        align-items: center;
        justify-content: center;   
    }
`
export const BookDescription = styled.div`
    display: flex;
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
    padding: 8px;
    width: 100%;
`

