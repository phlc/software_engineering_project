import styled from "styled-components";
import '../../assets/fonts/Fonts.css';

export const Container = styled.button`
    display: flex;
    flex-direction: column;
    width: 150px;
    height: 280px;
    background-color: white;
    -webkit-box-shadow: 1px 1px 2px #9E9E9E;
    -moz-box-shadow: 1px 1px 2px #9E9E9E;
    box-shadow: 1px 1px 2px #9E9E9E;
    border: none;
    border-radius: 5px;
    margin-right: 50px;
    padding-top: 10px;
`

export const TitleText = styled.text`
    color: #000;
    font-family: 'Montserrat-Regular';
    font-size: 14px;
    text-align: left;
    display: flex;
    margin-top: 15px;
`;

export const DetailsView = styled.div`

`;

export const BoldText = styled.text`
    color: #000;
    font-family: 'Montserrat-Bold';
    font-size: 16px;
    text-align: left;
`;

export const Row = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    margin-top: 10px;
`;

export const CoverImage = styled.img`
    width: 120px;
    height: 176px;
    align-self: center;
`