public class Book {
    int id;
    String author;
    String title;
    double price;

    public Book() {

    }

    public Book(int id, String author, String title, double price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[ " + "ID : " + id + ", AUTHOR : " + author + ", TITLE : " + title + ", PRICE : " + price + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.id == b.id && this.author == b.author && this.title == b.title && this.price == b.price;
    }
}
