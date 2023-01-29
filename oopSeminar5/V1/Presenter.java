package oopSeminar5.V1;

public class Presenter {
    View view = new View();
    Model model = new Model();

    public void buttonClick() {
        Double a = view.getValue("a: ");
        Double b = view.getValue("b: ");
        int choice = view.getChoice();
        System.out.println("Выбрана операция: " + choice);
        model.operation(a, b, choice);
    }
}
