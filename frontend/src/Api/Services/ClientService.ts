import { getAllUsers } from "../ClientApi";

export const getUsers = async () => {
    const response = await getAllUsers();
    return response;
}