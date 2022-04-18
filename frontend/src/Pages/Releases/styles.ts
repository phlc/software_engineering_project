import styled from "styled-components";
import '../../assets/fonts/Fonts.css';

export const Container = styled.section`
    display: flex;
    flex-direction: column;
    padding: 70px 30px;
`;

export const SectionTitle = styled.text`
    display: flex;
    font-family: 'Montserrat-bold';
    font-size: 28px;
    margin-bottom: 30px;
`;

export const Row = styled.div`
    display: flex;
    flex-direction: row;
`;

export const Button = styled.a`
    font-family: 'Montserrat-bold';
    font-size: 16px;
    margin-top: 30px;
    margin-right: 30px;
    align-self: flex-end;
`;