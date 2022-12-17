// На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство. 
// Нужно реализовать алгоритм, не использовать метод equals.

package Seminar3;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> someList1 = new ArrayList<>();
        someList1.add(5);
        someList1.add(3);
        someList1.add(1);
        someList1.add(1);
        ArrayList<Integer> someList2 = new ArrayList<>();
        someList2.add(5);
        someList2.add(3);
        someList2.add(1);
        someList2.add(1);
        int count = 0;
        if (someList1.size() == someList2.size()) {
            for (int i = 0; i < someList1.size(); i++) {

                if (someList1.get(i) == someList2.get(i)) {
                    count++;
                }
            }
        }
        if (count == someList1.size()) {
            System.out.println("Массивы равны.");
        } else {
            System.out.println("Массивы не равны.");
        }

    }
}
