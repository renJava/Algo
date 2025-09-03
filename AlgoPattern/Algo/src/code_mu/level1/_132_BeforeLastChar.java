package code_mu.level1;

/**
 * Уровень 13 задачника Java
 * № 132
 * <p>
 * Дана строка. Если в этой строке более одного символа, выведите в консоль предпоследний символ этой строки.
 */

public class _132_BeforeLastChar {
    static String someString = "abcde";

    public static void main(String[] args) {
        int StringLength = someString.length();
        if (StringLength > 1) {
            System.out.println("Предпоследний символ: " + someString.charAt(StringLength - 2));

        }
    }

}
