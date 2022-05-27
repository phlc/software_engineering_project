import styled from "styled-components";

export const Container = styled.div`
    display: flex;
    flex-direction: column;
    border: 1px solid blue;

    width: 100%;
    justify-content: center;
    align-items: center
`

export const Info = styled.div`
    display: flex;
    flex-direction: column;
    text-align: left;
    
    padding: 1rem;
    width: 200px;
    margin: 1rem 0rem;
    border-radius: 5px;
    background: #E5E5E5;
    
    & #first-span { 
        margin-bottom: 15px;
    }

`

export const ButtonDiv = styled.div`
    display: flex;
    justify-content: end;

    & button {
        background: #24B732;
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;

        &:hover {
            opacity:  70%;
        }
    }
`