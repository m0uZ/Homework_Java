package Seminar6;

public class Book {
    String bookAuthor;
    String bookName;

    public Book(String bookAuthor, String bookName) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "\"" + bookName + "\" - " + bookAuthor;
    }
}


