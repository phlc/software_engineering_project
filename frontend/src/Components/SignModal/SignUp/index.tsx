import { InputContainer } from "../styles"

export const SignUp = () => {
    return (
        <>
            <form>
                <InputContainer>
                    <label>Nome</label>
                    <input/>
                </InputContainer>
                <InputContainer>
                    <label>CPF</label>
                    <input/>
                </InputContainer>
                <InputContainer>
                    <label>Email</label>
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