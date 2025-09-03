package code_mu.level1;

/**
 * Уровень 1.1 задачника Java
 * № 115
 * <p>
 * Даны два слова. Проверьте, что первые буквы этих слов совпадают.
 */

public class _115_TwoWordsThreeFirstLettersMatch {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "archy";

        boolean matchLetter = ((s1.charAt(0) == s2.charAt(0)) && (s1.charAt(1) == s2.charAt(1)));

        System.out.println("Совпадают ли первые буквы слов: " + matchLetter);
    }
}
