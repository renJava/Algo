package code_mu.level3;

/**
 * Уровень 3.3 задачника Java
 * № 33.2
 * <p>
 *
 * Дано некоторое слово:
 *
 * "abcba"
 * Проверьте, что это слово читается одинаково с любой стороны.
 */

public class _332_IsPalindrom {
    public static void main (String[] args) {
        String wordIn = "abcba ";
        String wordInLowCase = wordIn.trim().toLowerCase().intern();
        String wordOut = new StringBuilder(wordInLowCase).reverse().toString().intern();

        System.out.println("\nСлово: " + wordIn
                + (wordInLowCase == wordOut
                ? "\nПалиндром: " + wordOut
                : "\nНе палиндром: " + wordOut));
    }
}
