// Учитывая целочисленный массив nums и целое число val, удалите все вхождения val in nums на месте. 
// Относительный порядок элементов может быть изменен.
// Поскольку в некоторых языках невозможно изменить длину массива, 
// вместо этого вы должны поместить результат в первую часть массива nums. Более формально, 
// если kпосле удаления дубликатов есть элементы, то первые kэлементы numsдолжны содержать конечный результат. 
// Не имеет значения, что вы оставляете за пределами первых kэлементов.
// Возврат kпосле размещения конечного результата в первыхk слотахnums .
// не выделять дополнительное пространство для другого массива. Вы должны сделать это, 
// изменив входной массив на месте с помощью O (1) дополнительной памяти.
// Пример 1:
// Ввод: nums = [3,2,2,3], значение = 3
// Вывод: 2, nums = [2,2,_,_]
// Объяснение: ваша функция должна возвращать k = 2, причем первые два элемента nums равны 2.
// Не имеет значения, что вы оставляете за пределами возвращаемого k (следовательно, они являются символами подчеркивания).

public class removeElement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);
    }
}