export const getAllUsers = async () => {
  const response = await fetch("/Client/GetAll");
  const responseJson = await response.json();
  return responseJson;
};

export const login = async (email: string, password: string) => {
  const requestData = JSON.stringify({
    email: email,
    password: Buffer.from(password, "base64"),
  });

  const headers = new Headers();
  headers.append('Content-Type', 'application/json');

  const response = await fetch("/login", {
    method: "POST",
    body: requestData,
    headers,
  });

  const responseJson = await response.json();
  return responseJson;
};

export const signup = async (
  name: string, 
  cpf: string,
  email: string, 
  password: string
) => {
  const requestData = JSON.stringify({
    name,
    cpf,
    email,
    password: Buffer.from(password, "base64"),
  });

  const headers = new Headers();
  headers.append('Content-Type', 'application/json');

  const response = await fetch("/provide", {
    method: "POST",
    body: requestData,
    headers
  });

  const responseJson = await response.json();
  return responseJson;
}
