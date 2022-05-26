"use strict";

const query = async function (queryString) {
  const jsonData = await fetch(
    `http://openlibrary.org/search.json?q=${queryString}`
  ).then((response) => response.json());

  const books = jsonData["docs"].map(function (elem) {
    const book = {
      titulo: elem["title"],
      autor: elem["author_name"],
      editora: elem["publisher"],
      chave: elem["key"].split("/")[2],
      capa: `https://covers.openlibrary.org/b/olid/${
        elem["key"].split("/")[2]
      }-M.jpg`,
    };
    return book;
  });
  return books;
};

const main = async function () {
  const data = await query("Pedro Bial");
  console.log(data);
};

main();
