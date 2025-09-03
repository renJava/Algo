package code_mu.level1;

/**
 * Уровень 19 задачника Java
 * № 191
 * <p>
 * Даны два слова. Проверьте, что последняя буква первого слова совпадает с первой буквой
 * второго слова.
 */

public class _191_FirstLetterInTwoWords {
    public static void main (String[] args) {
        String firstWord = "Hello";
        String secondWord = "orld";
        System.out.println("Соседние буквы слов совпадают: "
                + firstWord.endsWith(secondWord.substring(0, 1)));
    }
}
