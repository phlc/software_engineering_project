export const purchase = async (
    books_id: string,
    client_id: string
  ) => {
    const requestData = {
        books_id,
        client_id
    };
  
    const headers = new Headers();
    headers.append('Content-Type', 'application/json');
  
    const response = await fetch("/Purcase/Provide", {
      method: "POST",
      body: JSON.stringify(requestData),
      headers: headers
    });
    
    return response.status;
  }