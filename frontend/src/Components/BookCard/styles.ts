import styled from "styled-components";
import '../../assets/fonts/Fonts.css';

export const Container = styled.button`
    width: 150px;
    height: 195px;
    background-color: white;
    -webkit-box-shadow: 1px 1px 2px #9E9E9E;
    -moz-box-shadow: 1px 1px 2px #9E9E9E;
    box-shadow: 1px 1px 2px #9E9E9E;
    border: none;
    border-radius: 5px;
`

export const TitleText = styled.text`
    color: #000;
    font-family: 'Montserrat-Regular';
    font-size: 14px;
    text-align: left;
`;

export const DetailsView = styled.view`
    align-items: left;
`;

export const BoldText = styled.text`
    color: #000;
    font-family: 'Montserrat-Bold';
    font-size: 16px;
    text-align: left;
`;

export const Row = styled.div`
    flex-direction: row;
`;

export const CoverImage = styled.image`
    width: 120px;
    height: 176px;
`