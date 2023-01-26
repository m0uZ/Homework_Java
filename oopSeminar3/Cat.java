package oopSeminar3;

public class Cat extends Pet implements i_Pet {

    public Cat(String name) {

        super(name);
    }

    @Override
    public void getFood(Object s) {

        System.out.printf("%s просит кушать у своей хозяйки %s", this.name, s);
    }

    @Override
    public void getVoice() {

        System.out.println("Мяу - Мяу");
    }

}
