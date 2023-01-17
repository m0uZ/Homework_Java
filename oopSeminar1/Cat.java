package oopSeminar1;

public class Cat {

    String nickname;

    public Cat(String nickname) {

        this.nickname = nickname;
    }

    public void asksForFood(Human name) {
        System.out.printf("%s просит кушать у своей хозяйки %s", this.nickname, name);
        System.out.printf("%s идет кормить %s", name, this.nickname);
    }
    

    @Override
    public String toString() {

        return nickname;
    }
}
