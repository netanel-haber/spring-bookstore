const qsa = document.querySelectorAll.bind(document);
const qs = document.querySelector.bind(document);

const table = document.querySelector("#booksTable");

const rows = qsa(".book");



// table.addEventListener("mouseover",()=>{
    // console.log("here")
// })
// rows.forEach(r => {
//     r.addEventListener("mouseover", () => {
//         console.log("hello")
//         const overlay = document.createElement("span");
//         overlay.style="position:absolute;left:0;top:0;";
//         overlay.innerText = "jjjj";
//         r.appendChild(overlay);
//     })
// });
// const headerCells = Array.from(headerRow.querySelectorAll("th"));
// const indexOfIdColumn = headerCells.findIndex((th) => th.id === "bookId");
// const delBookButton = qsa(".deleteBook");


// delBookButton.forEach((btn, index) => {
//     btn.addEventListener("click", (e) => {
//         let bookId = retrieveBookId(index);
//         fetch(`/books/${bookId}`, {credentials: 'include'})
//         .then(res=>{
//             console.log(res)
//         })
//         .catch(ex=>{
//             console.log(ex);
//         })
//     })
// })











// const retrieveBookId = (rowIndex) => rows[rowIndex].children[indexOfIdColumn].innerText;


