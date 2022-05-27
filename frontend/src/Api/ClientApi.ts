import { AuthenticatedUser } from "../types";

export const getAllUsers = async () => {
  const response = await fetch("/Client/GetAll");
  const responseJson = await response.json();
  return responseJson;
};

export const login = async (email: string, password: string) => {
  const requestData = {
    email: email,
    password: btoa(password)
  };

  const headers = new Headers();
  headers.append('Content-Type', 'application/json');

  const response = await fetch("/Client/Login", {
    method: "POST",
    body: JSON.stringify(requestData),
    headers: headers
  });

  const responseJson: AuthenticatedUser = await response.json();
  return responseJson;
};

export const signup = async (
  name: string, 
  cpf: string,
  email: string, 
  password: string
) => {
  const requestData = {
    email: email,
    name: name,
    cpf: cpf,
    password: btoa(password)
  };

  const headers = new Headers();
  headers.append('Content-Type', 'application/json');

  const response = await fetch("/Client/Provide", {
    method: "POST",
    body: JSON.stringify(requestData),
    headers: headers
  });
  
  return response.status;
}
