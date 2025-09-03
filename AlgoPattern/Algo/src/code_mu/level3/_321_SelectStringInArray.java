package code_mu.level3;

/**
 * Уровень 3.2 задачника Java
 * № 32.1
 * <p>
 * Дан массив со строками.
 * Выведите в консоль только те строки, которые начинаются на "http://".
 */

public class _321_SelectStringInArray {
    public static void main(String[] args) {
        String[] arr = {"http://www.site1.com", "Ahttp://www.site2.com", "https://www.site3.com"};
        for (String str : arr) {
            if (str.startsWith("http://")) {
                System.out.println("Строка: " + str);
            }
        }
    }
}