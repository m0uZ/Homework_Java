package Seminar6;

public class Main {
    public static void main(String[] args) {
        
        Reader reader1 = new Reader(
            "Фральцов М.Н.",
            20,
            "Информатика",
            "10.04.1988",
            "89996665522");

        Book book1 = new Book("Стивен Кинг", "Зеленая миля");
        Book book2 = new Book("Артур Конан Дойл", "Шерлок Холмс");
        
            
            reader1.takeBook(3);
            System.out.println();
            reader1.takeBook(book1, book2);
            System.out.println();
            reader1.takeBook("Приключения", "Детективы", "Учебник информатики");
            System.out.println();

            reader1.returnBook(3);
            System.out.println();
            reader1.returnBook("Приключения", "Детективы", "Учебник информатики");
            System.out.println();
            reader1.returnBook(book1, book2);
            System.out.println();
    }
}
