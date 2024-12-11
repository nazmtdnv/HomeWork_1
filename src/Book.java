public class Book {
    private String title;
    private String author;
    private int year;
    public boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.year = 2024;
        this.isAvailable = true;
    }

    public void borrowBook(){
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnBook(){
        isAvailable = true;
    }

    public void displayInfo(){

        String status = (isAvailable) ?  "Доступно" : "Забронировано";
        System.out.println("Название книги: " + title + " Автор: " + author + " Год: " + year + " " + status);
    }
    public String getTitle(){
        return  title;
    }
    public String getAuthor(){
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

