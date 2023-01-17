package oopSeminar1;

public class Program {
    public static void main(String[] args) {

        Human human = new Human("Илона", 23, "Ж");
        Cat cat = new Cat("Тимка");
        Cat cat2 = new Cat("Белка");
        human.call(cat);
        System.out.println();
        human.call(cat, cat2);
        System.out.println();
        cat.asksForFood(human);
        System.out.println();
    }
}
