import styled from "styled-components";

export const Container = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    
    width: 30rem;
    height: 30rem;
    border-radius: 8px;
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
    
    background: #ccc9c9;

    padding: 1rem;
`

export const FormContainer = styled.div`
    height: 25rem;
    display: flex;
    flex-direction: column;
    justify-content: center;

`

export const InputContainer = styled.div<{error: boolean}>`
    display: flex;
    flex-direction: column;
    align-items: left;

    margin-bottom:24px;
    & > label {
        color: ${(props) => props.error ? 'red' : '#3c3b3b' };
        width: fit-content;
        margin-bottom: 2px;
    }

    & > input {
        border: ${(props) => props.error ? '1px solid red' : 'none' };
        height: 2rem;
        border-radius: 5px;
    
        &:focus {
            outline: none;
        }
    }


`
export const FormError = styled.div`
    display: flex;
    justiy-content: left;
    align-items: left;
    color: red;
    font-size: 12px;
`

export const LoginButton = styled.button<{isDisabled: boolean}>`
    background: #3c3b3b; 
    color: #ffffff;
    padding: 1rem;
    margin-top: 4rem;
    width: 100%;
    border-radius: 5px;
    border: none;
    opacity: ${(props) => props.isDisabled ? '50%' : '100%' };
    &:hover {
        cursor: ${(props) => props.isDisabled ? '' : 'pointer' };
        background: ${(props) => props.isDisabled ? '' : '#2c3b3b' };
    }
`
export const RegisterButton = styled.button<{isDisabled: boolean}>`
    background: #3c3b3b; 
    color: #ffffff;
    padding: 1rem;
    margin-top: 2rem;
    width: 100%;
    border-radius: 5px;
    border: none;
    opacity: ${(props) => props.isDisabled ? '50%' : '100%' };
    &:hover {
        cursor: ${(props) => props.isDisabled ? '' : 'pointer' };
        background: ${(props) => props.isDisabled ? '' : '#2c3b3b' };
    }
`

export const SignUpLinkArea = styled.div`
    display: flex;
    justify-content: center;
    margin-top: 3rem;
    `
    
export const SignUpLink = styled.div`
    padding: 1rem;
    border-top: 1px solid #3c3b3b;
    width: 50%;
    font-size: 12px;

    &:hover {
        cursor: pointer;
        color: #2c3b3b;
    }
`

export const CloseContainer = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: right;
`

export const CloseButton = styled.div`
    &:hover {
    cursor: pointer;
        color: #2c3b3b;
    }
    
`