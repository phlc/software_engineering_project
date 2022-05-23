import { getAllUsers } from "../ClientApi";

export const getUsers = async () => {
    const response = await getAllUsers();
    console.log(Object(response));
    return response;
}