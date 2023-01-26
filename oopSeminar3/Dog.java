package oopSeminar3;

public class Dog extends Pet implements i_Pet {

    public Dog(String name) {

        super(name);
    }

    @Override
    public void getFood(Object s) {

        System.out.printf("%s просит кушать у своей хозяйки %s", this.name, s);
    }

    @Override
    public void getVoice() {

        System.out.println("Гав - Гав");
    }

}
