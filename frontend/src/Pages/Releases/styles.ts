import { isAbsolute } from "path";
import styled from "styled-components";
import '../../assets/fonts/Fonts.css';

export const Container = styled.div`
    display: flex;
    flex-direction: row;
`;

export const Background = styled.div`
    background-color: #F8F7F7;
    padding: 30px 70px;
    width: 100%;
`;

export const SideView = styled.section`
    display: flex;
    flex-direction: column;
    background-color: #F1EEEE;
    padding: 30px 20px;
    width: 300px;
    align-items: flex-start;
    justify-content: flex-start;
`;

export const SectionTitle = styled.text`
    display: flex;
    font-family: 'Montserrat-bold';
    font-size: 26px;
    margin: 30px 0;
`;

export const Row = styled.div`
    display: flex;
    flex-flow: wrap;
`;

export const Divider = styled.div`
    margin-bottom: 20px;
`
export const TitleInput = styled.input`
    padding: 10px;
    background-color: #D9D9D9;
    border: none;
    border-radius: 5px;
    margin-top: 30px;
    margin-bottom: 20px;
    width: 200px;
`;

export const SortButton = styled.button`
    background-color: transparent;
    flex-direction: row;
    border: none;
    margin-top: 10px;
`;

export const ButtonText = styled.text`
    color: black;
    font-family: 'Montserrat-regular';
    font-size: 14px;
    vertical-align: bottom;
`;

export const BoldText = styled.text`
    color: black;
    font-family: 'Montserrat-bold';
    font-size: 14px;
`;

export const SideViewContainer = styled.section`
    display: flex;
    flex-direction: column;
    background-color: #F1EEEE;
    padding: 30px 20px;
    width: 300px;
    align-items: flex-start;
    justify-content: flex-start;
`;

export const InvisibleButton = styled.button`
    background-color: transparent;
    border: none;
`;

interface StyleSheet {
    [key: string]: React.CSSProperties;
}

export const styles: StyleSheet = {
    searchStyle: {
        position: 'absolute',
        left: 200,
        top: 120,
    }
} 