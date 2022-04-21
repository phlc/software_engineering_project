import styled from "styled-components";

export const Container = styled.div`
    border: 1px solid red;
    display: flex;
    flex-direction: column;
    justify-content: center;
    
    width: 30rem;
    height: fit-content;
    
    position: fixed;
    z-index: 20;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    margin-top: auto;
    margin-bottom: auto;
    margin-left: auto;
    margin-right: auto;
    
    background: red;

    padding: 1rem
`

export const FormContainer = styled.div`
    border: 1px solid blue;
`

export const InputContainer = styled.div`
    border: 1px solid red;
    display: flex;
    flex-direction: column;
`