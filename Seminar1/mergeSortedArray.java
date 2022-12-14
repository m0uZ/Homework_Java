// Вам даны два массива целых nums1 чисел и nums2, отсортированные в порядке неубывания, 
// и два целых m числа и n, представляющие количество элементов в nums1 и nums2 соответственно.
// Объединить nums1 и nums2 в единый массив, отсортированный в порядке неубывания.
// Окончательный отсортированный массив не должен быть возвращен функцией, 
// а вместо этого должен храниться внутри массива nums1 . Чтобы учесть это, nums1 имеет длинуm + n, 
// где первые mэлементы обозначают элементы, которые должны быть объединены, а последние nэлементы имеют значение 0и должны игнорироваться. 
// nums2 имеет длину n.
// Пример 1:
// Входные данные: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Вывод: [1,2,2,3,5,6]
// Объяснение: объединяемые массивы - это [1,2,3] и [2,5,6].
// Результатом слияния является [1,2,2,3,5,6] с подчеркнутыми элементами, исходящими из nums1.

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
        int m = 3, n = 3;
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (k >= 0) {
            if (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            } else if (i >= 0) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}