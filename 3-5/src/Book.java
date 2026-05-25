public class Book {
    int id;
    String title;
    String author;
    int pages;
    
    public Book(String title, String author, int id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public Book(String title, String author, int pages, int id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

}
