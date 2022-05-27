import styled from "styled-components";

export const Card = styled.div`
    width: 100%;
    display: flex;
    flex-direction: column;
    max-width: 70rem;
    padding: 1rem 2rem; 
    border-radius: 5px;
    box-shadow: 0 0 1em #d9d9d9;
`

export const Container = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    margin-top: 2rem;
`

export const TitleDiv = styled.h1`
    text-align: left;
    width: 74rem;
    font-family: 'Montserrat-Bold';
`

export const Body = styled.div``

export const TotalValue = styled.div`
    font-size: 24px;
    font-family: 'Montserrat-Bold';
    border-top: 2px solid #515050;
    padding: 8px 0px;
`
export const TotalDiv = styled.div`
    display: grid;
    grid-template-columns: 2fr 1fr 1fr 1fr;

    margin: 2rem 0rem;
`