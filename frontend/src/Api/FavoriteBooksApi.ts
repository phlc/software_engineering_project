import { FavoriteBook } from "../types";

export const getUserFavoriteBooks = async (clientId: number) : Promise<FavoriteBook[]> => {
    
    const requestData = JSON.stringify({
        client_id: clientId
    });
    
    const headers = new Headers();
    headers.append('Content-Type', 'application/json');
    const response = await fetch("/FavoriteBooks/GetFavoritesByUser", {
        method: "POST",
        headers: headers,
        body: requestData
    });
    const responseJson = await response.json();
    
    return responseJson;
  };


  export const setUserFavoriteBooks = async (clientId: number, bookId: number) => {
    
    const requestData = JSON.stringify({
        book_id: bookId,
        client_id: clientId
    });
    
    const headers = new Headers();
    headers.append('Content-Type', 'application/json');

    const response = await fetch("/FavoriteBooks/CreateOrDelete", {
        method: "POST",
        headers: headers,
        body: requestData
    });

    console.log(response);
    return response;
  };