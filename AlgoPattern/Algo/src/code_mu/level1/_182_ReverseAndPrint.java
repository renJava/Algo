package code_mu.level1;

/**
 * Уровень 18 задачника Java
 * № 182
 * <p>
 * Дана некоторая строка:
 * "abcde"
 * Переберите и выведите в консоль по очереди все символы с конца строки.
 */

public class _182_ReverseAndPrint {
    public static void main(String[] args) {
        String str = "abcde";
        int strLength = str.length();
        System.out.print("Символы в обратном порядке: " + str + "\n" + "Вывод: ");
        for (int i = strLength - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
            System.out.print (i > 0 ? ", " : ".");
        }
    }
}
