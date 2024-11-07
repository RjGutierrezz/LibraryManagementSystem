// This class represents books in the library

public class Book {
    public String bookName;
    public String authorName;
    public int isbnBook;
    public boolean availability;

    // constructor method
    public Book(String book, String name) {
        bookName = book;
        authorName = name;
    }

    public String toString(){
        return bookName + " by " + authorName;
    }
}