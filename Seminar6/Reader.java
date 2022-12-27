package Seminar6;

import java.util.StringJoiner;

public class Reader {
    
    private String fio;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fio, int libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Информация о читателе: \n" +
                "ФИО - " + fio + "\n" +
                "Номер билета - " + libraryCardNumber + "\n" +
                "Факультет - " + faculty + "\n" +
                "День рождения - " + dateOfBirth + "\n" +
                "Телефон - " + phone + "\n";
    }

    public void takeBook(int numberOfBooks) {
        // Можно взять не более пяти книг!
        if (numberOfBooks == 1) {
            
            System.out.printf("%s взял %d книгу", this.fio, numberOfBooks);
        }
        else if (numberOfBooks <= 4 && numberOfBooks > 1) {
            System.out.printf("%s взял %d книги", this.fio, numberOfBooks);
        }
        else if (numberOfBooks == 5) {
            System.out.printf("%s взял %d книг", this.fio, numberOfBooks);
        }
    }
    
    public void takeBook(String... nameBooks) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String book : nameBooks) {
            joiner.add(book);
        }
        System.out.printf("%s взял книги: %s\n", this.fio, joiner);
    }

    public void takeBook(Book... books) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Book book : books) {
            joiner.add(book.toString());
        }
        System.out.printf("%s взял книги: %s\n", this.fio, joiner);
    }
    
    public void returnBook(int numberOfBooks) {
        if (numberOfBooks == 1) {
            
            System.out.printf("%s вернул %d книгу", this.fio, numberOfBooks);
        }
        else if (numberOfBooks <= 4 && numberOfBooks > 1) {
            System.out.printf("%s вернул %d книги", this.fio, numberOfBooks);
        }
        else if (numberOfBooks == 5) {
            System.out.printf("%s вернул %d книг", this.fio, numberOfBooks);
        }
    }

    public void returnBook(String... numberOfBooks) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String book : numberOfBooks) {
            joiner.add(book);
        }
        System.out.printf("%s вернул книги: %s\n", this.fio, joiner);
    }

    public void returnBook(Book... books) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Book book : books) {
            joiner.add(book.toString());
        }
        System.out.printf("%s вернул книги: %s\n", this.fio, joiner);
    }
}
