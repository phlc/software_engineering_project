import { InputContainer } from "../styles"

export const SignUp = () => {
    return (
        <>
            <form>
                <InputContainer error={false}>
                    <label>Nome</label>
                    <input/>
                </InputContainer>
                <InputContainer error={false}>
                    <label>CPF</label>
                    <input/>
                </InputContainer>
                <InputContainer error={false}>
                    <label>Email</label>
                    <input/>
                </InputContainer>
                <InputContainer error={false}>
                    <label>Senha</label>
                    <input/>
                </InputContainer>
            </form>
        </>
    )
}