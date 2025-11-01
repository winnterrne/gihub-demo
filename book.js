const url = new URLSearchParams(window.location.search);
const id = url.get("id");

fetch("book.json")
    .then(res => res.json())
    .then(books => {
        const book = books.find(item => item.id == id);
        if (!book) return;

        document.querySelector(".img-book img").src = book.image;
        document.querySelector(".namebook h1").innerText = book.title;
        document.querySelector(".author .sytle-author").innerText = " " + book.author;

        document.querySelector(".prodcut-price").innerText = book.price.toLocaleString() + " VND";
        document.querySelector(".old-price").innerText = book.oldPrice.toLocaleString() + " VND";
        document.querySelector(".sale-price").innerText = book.discount + "%";

        document.querySelector("#description .content-book").innerHTML =
            `<p style="white-space: pre-line; line-height: 29px ">${book.description}</p>`;

        const detailItems = document.querySelectorAll("#details li span:last-child");
        detailItems[0].innerText = book.author;
        detailItems[1].innerText = book.translator;
        detailItems[2].innerText = book.publisher;
        detailItems[3].innerText = book.size;
        detailItems[4].innerText = book.pages;
        detailItems[5].innerText = book.published_year;
    });
