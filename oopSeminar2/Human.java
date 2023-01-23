package oopSeminar2;

public class Human extends Humans {
    public int age;
    public String sex;

    public Human(int age, String sex, String name) {
        super.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        
        return this.name;
    }

    public void call(Cat s) {
        System.out.printf("%s зовет своего питомца %s", this.name, s);
    }

    public void game(Cat s) {
        System.out.printf("%s играет со своим питомцем %s", this.name, s);
    }

    public void call(Dog s) {
        System.out.printf("%s зовет своего питомца %s", this.name, s);
    }

    public void game(Dog s) {
        System.out.printf("%s играет со своим питомцем %s", this.name, s);
    }
}
