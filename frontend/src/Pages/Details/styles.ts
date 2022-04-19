import styled from "styled-components";
import '../../assets/fonts/Fonts.css';

export const Background = styled.div`
    background-color: #EFEFEF;
    padding: 30px 70px;
`;

export const SectionTitle = styled.text`
    display: flex;
    font-family: 'Montserrat-bold';
    font-size: 26px;
    margin: 30px 0;
`;

export const BookTitle = styled.text`
    display: flex;
    font-family: 'Montserrat-bold';
    font-size: 28px;
    margin: 30px 0 10px 30px;
`;

export const DetailsContainer = styled.div`
    display: flex;
    flex-direction: column;
    text-align: left;
`;

export const AuthorText = styled.text`    
    display: flex;
    font-family: 'Montserrat-regular';
    font-size: 20px;
    margin: 0 0 10px 30px;
`;

export const SubText = styled.text`    
    display: flex;
    font-family: 'Montserrat-regular';
    font-size: 16px;
    margin: 0 0 10px 30px;
`;

export const Row = styled.div`
    display: flex;
    flex-direction: row;
`;

export const MainContainer = styled.section`
    display: flex;
    background-color: #FFFFFF;
    margin: 20px 0;
    height: 351px;
    padding: 36px;
    border-radius: 10px;
    -webkit-box-shadow: 1px 1px 2px #9E9E9E;
    -moz-box-shadow: 1px 1px 2px #9E9E9E;
    box-shadow: 1px 1px 2px #9E9E9E;
`;

export const CoverImage = styled.img`
    width: 236px;
    height: 347px;
    align-self: flex-start;
`;

export const SinopseContainer = styled.section`
    display: flex;
    padding: 36px;
    margin: 20px 0;
    text-align: left;
    background-color: #FFFFFF;
    border-radius: 10px;
`;

export const LinkStyle = {
    textDecoration: 'none',
    fontFamily: 'Montserrat-Bold',
    fontSize: 16,
    marginLeft: 30,
    marginTop: 10,
    color: '#000000'
};