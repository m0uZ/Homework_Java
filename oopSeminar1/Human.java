package oopSeminar1;

import java.util.StringJoiner;

public class Human {

    private String name;
    private int age;
    private String sex;

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void call(Cat nickname) {
        System.out.printf("%s зовет %s кис кис " + "\n", this.name, nickname);
        System.out.printf("%s бежит к своей хозяйке %s", nickname, this.name);
    }

    public void call(Cat... nicknames) {
        StringJoiner cats = new StringJoiner(", ");
        for (Cat cat : nicknames) {
            cats.add(cat.toString());
        }
        System.out.printf("%s зовет любимых котиков %s" + "\n", this.name, cats);
        System.out.printf("%s бегут к своей хозяйке %s", cats, this.name);
    }
    
    @Override
    public String toString() {
        
        return this.name;
    }

}
