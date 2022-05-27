import styled from "styled-components";

export const Container = styled.div`
    display: flex;
    width: 6rem;
    height: 2rem;

    border: 2px solid #d9d9d9;
    border-radius: 4px;
`

export const RemoveButton = styled.button`
    width: 2rem;
    border-top: 0px;
    border-bottom: 0px;
    border-left: 0px;
    border-right: 2px solid #d9d9d9;
    border-radius: 4px;

    text-justify: center;
    color: orange;
    font-weight: 900;  
    font-size: 18px; 
`

export const AddButton = styled.button`
    width: 2rem;
    border-top: 0px;
    border-bottom: 0px;
    border-right: 0px;
    border-left: 2px solid #d9d9d9;
    border-radius: 4px;

    text-justify: center;
    color: orange;
    font-weight: 900;  
    font-size: 18px; 
`

export const Total = styled.div`
    width: 2rem;

    display: flex;
    align-items: center;
    justify-content: center;

`