// Вам будут предоставлены две строки word1и word2. Объединяйте строки, добавляя буквы в порядке чередования, 
// начиная с word1. Если строка длиннее другой, добавьте дополнительные буквы в конец объединенной строки.
// Возвращает объединенную строку.
// Пример 1:
// Ввод: word1 = "abc", word2 = "pqr"
// Вывод: "apbqcr"
// Объяснение: объединенная строка будет объединена таким образом:
// word1: a b c
// word2: p q r
// объединены: a p b q c r

public class mergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "asdf", word2 = "qwer";
        int m = word1.length(), n = word2.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m || i < n; ++i) {
            if (i < m)
                sb.append(word1.charAt(i));
            if (i < n)
                sb.append(word2.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
