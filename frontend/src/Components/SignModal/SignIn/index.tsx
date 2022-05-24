import { InputContainer, FormError, LoginButton, SignUpLinkArea, SignUpLink } from "../styles"
import * as yup from "yup"
import { useFormik } from "formik"

export const SignIn = () => {
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
        onSubmit: (values) => {
          console.log(values.email, values.password)
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
                <SignUpLink>
                    Criar Conta
                </SignUpLink>
            </SignUpLinkArea>
        </>
    )
}