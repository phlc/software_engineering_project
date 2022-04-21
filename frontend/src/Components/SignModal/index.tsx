import { Container, FormContainer } from "./styles"
import {MenuBookTwoTone} from '@material-ui/icons';
import { SignIn } from "./SignIn";
import { SignUp } from "./SignUp";

export enum ShowSignModalType {
    SIGNIN,
    SIGNUP
}

export interface SignModalProps {
    showBody: ShowSignModalType
}


export const SignModal = ({showBody}: SignModalProps) => {
    return (
        <Container>
            <div> <MenuBookTwoTone fontSize="medium"/> </div>
           <FormContainer>
                {
                    (showBody === ShowSignModalType.SIGNIN) 
                      ? (<SignIn />) 
                      : (<SignUp />)
                }
           </FormContainer>
        </Container>
    )
}