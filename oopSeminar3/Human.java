package oopSeminar3;

public class Human<T extends Pet> {

    public String name;

    public Human(String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }

    public void call(T s) {
        System.out.printf("%s зовет своего питомца %s", this.name, s);
    }

    public void game(T s) {
        System.out.printf("%s играет со своим питомцем %s", this.name, s);
    }

}
