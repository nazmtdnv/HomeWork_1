public class Main {
    public static void main(String[] args){

        Library library = new Library();
        Book book1 = new Book("Руководство для начинающих", "Герберт Шилдт", 2018, true);
        Book book2 = new Book("Полное руководство", "Герберт Шилдт", 2022, true);
        Book book3 = new Book("Алгоритмы на Java", "Роберт Седжвик", 2013, true);
        Book book4 = new Book("Философия Java", "Брюс Эккель");
        Book book5 = new Book("Чистый Код", "Роберт Мартин");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println("Доступные книги в моей библиотеке:");
        library.printAvailableBooks();
        library.reservationBook("Чистый Код");
        library.reservationBook("Чистый Код");
        System.out.println("Доступные книги в моей библиотеке:");
        library.printAvailableBooks();
        System.out.println("Книги автора:");
        library.findBooksByAuthor("Герберт Шилдт");
    }
}

