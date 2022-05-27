import { InputContainer, FormError, LoginButton, SignUpLinkArea, SignUpLink } from "../styles"
import * as yup from "yup"
import { useFormik } from "formik"
import { login } from "../../../Api/ClientApi";
import { useGlobal } from "../../../Contexts/Global/Global";
import { useToast } from "../../../Contexts/Toast/Toast";

export const SignIn = () => {
    const { setAuthenticatedUser, setShowSignModal } = useGlobal()
    const { addToast } = useToast()

    const formikSignForm = useFormik({
        initialValues: {
          email: "",
          password: "",
        },
        validationSchema: yup.object({
          email: yup
            .string()
            .email("E-mail inválido.")
            .required("O campo é obrigatório."),
          password: yup
            .string()
            .required("O campo é obrigatório.")
            .max(10)
        }),
        onSubmit: async (values) => {
          try {
              const response = await login(values.email, values.password)
              if(response) {
                setAuthenticatedUser(response)
                addToast({
                  type:"success",
                  title: "Login realizado",
                  description: "Você está logado."
                })
                setShowSignModal(2);
              }
          } catch (e) {
            addToast({
              type: 'error',
              title: 'Erro na autenticação',
              description: 'Ocorreu um erro ao fazer login, cheque as credenciais.'
            })
          }
        },
      });
    return (
        <>
            <form onSubmit={formikSignForm.handleSubmit}>
                <InputContainer error={!!(formikSignForm.touched.email && formikSignForm.errors.email)}>
                    <label >Email:</label>
                    <input
                        name="email"
                        onChange={formikSignForm.handleChange}
                        value={formikSignForm.values.email}
                    />
                    {formikSignForm.touched.email && formikSignForm.errors.email ? (
                        <FormError>{formikSignForm.errors.email}</FormError>
                    ) : null}
                </InputContainer>
                <InputContainer error={!!(formikSignForm.touched.password && formikSignForm.errors.password)}>
                    <label>Senha:</label>
                    <input
                        name="password"
                        type="password"
                        onChange={formikSignForm.handleChange}
                        value={formikSignForm.values.password}
                    />
                    {formikSignForm.touched.password && formikSignForm.errors.password ? (
                        <FormError>{formikSignForm.errors.password}</FormError>
                    ) : null}
                </InputContainer>
                <LoginButton isDisabled={!!(formikSignForm.errors.email || formikSignForm.errors.password)}>Entrar</LoginButton>
            </form>
            <SignUpLinkArea>
                <SignUpLink onClick={() => setShowSignModal(1)}>
                    Criar Conta
                </SignUpLink>
            </SignUpLinkArea>
        </>
    )
}