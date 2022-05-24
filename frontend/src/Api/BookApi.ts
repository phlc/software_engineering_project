export const getAllBooks = async () => {
    const requestData = JSON.stringify({
        title: ""
    })
    
    const headers = new Headers();
    headers.append('Content-Type', 'application/json');

    const response = await fetch("/Book/GetByTitle", {
        method: "POST",
        headers: headers,
        body: requestData
    });
    const responseJson = await response.json();
    return responseJson;
  };
  

  export const getBookByAuthor = async (author: string) => {
    
    const requestData = JSON.stringify({
        author: "Stephen King"
    })
    
    const headers = new Headers();
    headers.append('Content-Type', 'application/json');

    const response = await fetch("/Book/GetByAuthor", {
        method: "POST",
        headers: headers,
        body: requestData
    });
    const responseJson = await response.json();
    return responseJson;
  };