import { useFormik } from "formik";
import { login, signup } from "../../../Api/ClientApi";
import { useGlobal } from "../../../Contexts/Global/Global";
import { FormError, InputContainer, RegisterButton } from "../styles"
import * as yup from "yup"


export const SignUp = () => {
    const { setAuthenticatedUser, setShowSignModal } = useGlobal()
    const formikSignForm = useFormik({
        initialValues: {
          name: "",
          cpf: "",  
          email: "",
          password: "",
        },
        validationSchema: yup.object({
          name: yup
            .string()
            .required("O campo é obrigatório."),
          cpf: yup
            .string()
            .max(11)
            .required("O campo é obrigatório."),
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
            const signupResponse = await signup(
                values.name, 
                values.cpf,
                values.email, 
                values.password
            )

            if(signupResponse === "SUCCESS") {
                const loginResponse = await login(values.email, values.password)
                if(loginResponse) {
                  setAuthenticatedUser(loginResponse)
                }
            } else {
                throw new Error("Não foi possível registrar o usuário")
            }
          } catch (e) {
            alert(e)
          }
        },
      });
    return (
        <>
            <form onSubmit={formikSignForm.handleSubmit}>
                <InputContainer error={!!(formikSignForm.touched.name && formikSignForm.errors.name)}>
                    <label >Nome:</label>
                    <input
                        name="name"
                        onChange={formikSignForm.handleChange}
                        value={formikSignForm.values.name}
                    />
                    {formikSignForm.touched.name && formikSignForm.errors.name ? (
                        <FormError>{formikSignForm.errors.name}</FormError>
                    ) : null}
                </InputContainer>
                <InputContainer error={!!(formikSignForm.touched.cpf && formikSignForm.errors.cpf)}>
                    <label >CPF:</label>
                    <input
                        name="cpf"
                        onChange={formikSignForm.handleChange}
                        value={formikSignForm.values.cpf}
                    />
                    {formikSignForm.touched.cpf && formikSignForm.errors.cpf ? (
                        <FormError>{formikSignForm.errors.cpf}</FormError>
                    ) : null}
                </InputContainer>
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
                <RegisterButton 
                    isDisabled={
                        !!(
                           formikSignForm.errors.name ||  
                           formikSignForm.errors.cpf || 
                           formikSignForm.errors.email || 
                           formikSignForm.errors.password
                    )}>
                        Registrar
                </RegisterButton>
            </form>
        </>
    )
}