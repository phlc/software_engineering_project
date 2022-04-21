import { InputContainer } from "../styles"

export const SignIn = () => {
    return (
        <>
            <form>
                <InputContainer>
                    <label>Email:</label>
                    <input/>
                </InputContainer>
                <InputContainer>
                    <label>Senha</label>
                    <input/>
                </InputContainer>
            </form>
        </>
    )
}