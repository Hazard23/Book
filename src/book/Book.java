package book;
public class Book {
    String title;
    private String author;
    private short numberOfPages;

    public Book(String title, String author, short numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
   
    @Override
    public String toString() {
        return "Book{" + "Title= " + title + ", Author= " + author + ", Number Of Pages= " + numberOfPages + '}';
    }
    
     
}
