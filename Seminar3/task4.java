// На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)

package Seminar3;

import java.util.ArrayList;
import java.util.Iterator;

public class task4 {
    public static void main(String[] args) {
        ArrayList<Integer> someList = new ArrayList<>();
        someList.add(10);
        someList.add(3);
        someList.add(2);
        someList.add(5);
        someList.add(4);
        Iterator<Integer> iterator = someList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(someList);
    }
}
