const qsa = document.querySelectorAll.bind(document);
const qs = document.querySelector.bind(document);

const table = qs("#booksTable");
const [headerRow, ...rows] = table.rows;
const headerCells = Array.from(headerRow.querySelectorAll("th"));
const indexOfIdColumn = headerCells.findIndex((th) => th.id === "bookId");
const delBookButton = qsa(".deleteBook");


delBookButton.forEach((btn, index) => {
    btn.addEventListener("click", (e) => {
        let bookId = retrieveBookId(index);
        fetch(`/api/books/${bookId}/delete`)
    })
})











const retrieveBookId = (rowIndex) => rows[rowIndex].children[indexOfIdColumn].innerText;

