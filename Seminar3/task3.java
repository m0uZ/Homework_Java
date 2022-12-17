// На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа. 
// Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]

package Seminar3;

import java.util.*;


public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> someList = new ArrayList<>();
        someList.add(10);
        someList.add(3);
        someList.add(2);
        someList.add(5);
        someList.add(4);
        someList.add(9);
        ArrayList<Integer> evenList = new ArrayList<>();
        
        for (Integer integer : someList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }
        Collections.sort(evenList);
        int j = 0;
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) % 2 == 0) {
                someList.set(i, evenList.get(j));
                j++;
            }
        }
        System.out.println(someList);
    }
}
