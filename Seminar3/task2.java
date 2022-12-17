// На вход методу приходят два ArrayList<Integer> и целое число num. 
// Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.

package Seminar3;

import java.util.ArrayList;

public class task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> someList1 = new ArrayList<>();
        someList1.add(5);
        someList1.add(3);
        someList1.add(1);
        someList1.add(3);
        someList1.add(3);
        ArrayList<Integer> someList2 = new ArrayList<>();
        someList2.add(5);
        someList2.add(3);
        someList2.add(3);
        someList2.add(3);
        int num = 3;
        int count = 0;
        int count1 = 0;
        for (Integer i : someList1) {
            if (i == num) {
                count++;
            }
        }
        for (Integer j : someList2) {
            if (j == num) {
                count1++;
            }
        }
        System.out.println(count == count1);
    }
}
