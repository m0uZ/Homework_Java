package oopSeminar5.V1;

public class Model {

    public void operation(Double a, Double b, int choice) {
        switch (choice) {
            case 1 -> System.out.println("a + b = " + (a + b));
            case 2 -> System.out.println("a - b = " + (a - b));
            case 3 -> System.out.println("a * b = " + (a * b));
            case 4 -> System.out.println("a / b = " + (a / b));
        }
    }
}
