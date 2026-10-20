import java.util.Arrays;

public class BookStack {

    private Book[] books;
    private int size;

    public BookStack(int initialCapacity) {
        books = new Book[initialCapacity];
        size = 0;
    }

    public void push(Book book) {
        if (size == books.length) {
            resize();
        }
        books[size] = book;
        size++;
    }

    public Book pop() {
        if (size == 0) {
            return null;
        }
        size--;
        Book removed = books[size];
        books[size] = null;
        return removed;
    }

    private void resize() {
        books = Arrays.copyOf(books, books.length * 2);
    }

    public void searchByPrice(double minPrice) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= minPrice) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with price >= " + minPrice);
        }
    }

    public void printStackInformation() {
        System.out.println("Number of books: " + size);
        System.out.println("Array capacity: " + books.length);

        if (size == 0) {
            System.out.println("The stack is empty.");
            return;
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}
