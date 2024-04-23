public class PalindromeReverse {
    public static void main(String[] args) {
        String palindrome = "А роза упала на лапу Азора";
        String reversed = reversePalindrome(palindrome);

        System.out.println("Исходный палиндром: " + palindrome);
        System.out.println("Обращенный палиндром: " + reversed);
    }

    public static String reversePalindrome(String palindrome) {
        StringBuilder reversedBuilder = new StringBuilder(palindrome);
        return reversedBuilder.reverse().toString();
    }
}