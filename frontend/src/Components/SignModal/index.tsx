import { CloseContainer, CloseButton, Container, FormContainer } from "./styles"
import {MenuBookTwoTone, CloseOutlined} from '@material-ui/icons';
import { SignIn } from "./SignIn";
import { SignUp } from "./SignUp";
import { useGlobal } from "../../Contexts/Global/Global";

export enum ShowSignModalType {
    SIGNIN,
    SIGNUP
}

export interface SignModalProps {
    showBody: ShowSignModalType
}


export const SignModal = ({showBody}: SignModalProps) => {
    const { setShowSignModal } = useGlobal()
    return (
        <div onClick={() => setShowSignModal(2)}>
            <Container onClick={e => e.stopPropagation()}>
                <CloseContainer>
                    <CloseButton onClick={() => setShowSignModal(2)}><CloseOutlined fontSize="small"/></CloseButton>
                </CloseContainer>
                <div> <MenuBookTwoTone fontSize="large"/> </div>
            <FormContainer>
                    {
                        (showBody === ShowSignModalType.SIGNIN) 
                        ? (<SignIn />) 
                        : (<SignUp />)
                    }
            </FormContainer>
            </Container>

        </div>
    )
}