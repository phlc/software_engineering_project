export const getAllUsers = async () => {
    const response = await fetch('/Client/GetAll')
    const body = await response.json();
    return body;
};