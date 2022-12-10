// Фраза является палиндромом, если после преобразования всех прописных букв в строчные и 
// удаления всех не алфавитно-цифровых символов она одинаково читается вперед и назад. 
// Буквенно-цифровые символы включают буквы и цифры.
// Если задана строкаs, возвращайте, является trueли она палиндромом илиfalse нет.
// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

public class validPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int l = 0, h = s.length() - 1;
        while (l < h) {
            char charl = s.charAt(l), charh = s.charAt(h);
            if (!Character.isLetterOrDigit(charl))
                l++;
            else if (!Character.isLetterOrDigit(charh))
                h--;
            else {
                if (Character.toLowerCase(charl) != Character.toLowerCase(charh))
                    System.out.println(false);
                l++;
                h--;
            }
        }
        System.out.println(true);
    }
}
