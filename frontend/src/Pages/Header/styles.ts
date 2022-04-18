import styled from "styled-components";
import '../../assets/fonts/Fonts.css';

export const Container = styled.section`
    display: flex;
    width: 100%;
    height: 500px;
    flex-direction: column;
`;

export const MainText = styled.text`
    color: #FFFFFF;
    font-family: 'Montserrat-regular';
    font-size: 42px;
    z-index: 10;
    margin: 150px 64px 0 64px;
    align-self: flex-start;
    max-width: 600px;
    text-align: left;
`;