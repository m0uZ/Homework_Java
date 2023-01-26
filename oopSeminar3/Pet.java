package oopSeminar3;

public abstract class Pet {

    public String name;

    public Pet(String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }
}
