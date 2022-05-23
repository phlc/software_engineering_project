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

  const response = await fetch("/login", {
    method: "POST",
    body: requestData,
  });

  return response;
};
