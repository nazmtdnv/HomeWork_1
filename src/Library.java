import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAvailableBooks() {
        boolean avaliableBooks = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
                avaliableBooks = true;
            }
        }
        if (!avaliableBooks) {
            System.out.println("Нет доступных книг.");
        }
    }

    public void findBooksByAuthor(String author) {
        boolean foundBooks = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author) && book.isAvailable()) {
                book.displayInfo();
                foundBooks = true;
            }
        }
        if (!foundBooks) {
            System.out.println("Нет доступных книг данного автора");
        }
    }

    public void reservationBook(String title){
        boolean reservation = false;
        for (Book book: books){
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()){
                book.borrowBook();
                reservation = true;
            }
        }
        if (!reservation) {
            System.out.println("Книга уже забронирована");
}
    }
    }

