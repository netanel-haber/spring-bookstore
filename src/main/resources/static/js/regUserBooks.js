const bookRows = Array.from($(".book"));
const addToCartCheckBoxes = $('input[id^="add-to-cart"]');
const priceColumnIndex = Number(Array.from($("th")).findIndex(th => th.innerText.toLowerCase() === "price"));

const cart = {
    sum: 0,
    bookPrices: bookRows.map(book => Number(book.children[priceColumnIndex].innerText)),
    toggleIndex(index) {
        this.sum += this.bookPrices[index];
        this.bookPrices[index] *= -1;
        this.setCartElementContent();
    },
    setCartElementContent() {
        $('#cartTotal').text(`Total price of books selected: ${this.sum}`);
    },
    reset() {
        this.sum = 0;
        this.bookPrices = this.bookPrices.map(price => Math.abs(price));
        this.setCartElementContent();
    }
}

$('#resetCart').click(function resetCart() {
    bookRows.forEach(el => el.classList.remove("active-book"));
    cart.reset();
})


addToCartCheckBoxes.click(function toggleAddedRowColor() {
    const clickedBookIndex = this.id.split("add-to-cart")[1];
    bookRows[clickedBookIndex].classList.toggle("active-book");
    cart.toggleIndex(clickedBookIndex);
})


