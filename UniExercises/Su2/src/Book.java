public class Book {
    private final String title;
    private final String author;
    private final double price    ;

    public Book(String bookTitle, String bookAuthor, double bookPrice) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.price = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " - " + price;
    }
}
