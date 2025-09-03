package code_mu.level3;

/**
 * Уровень 3.6 задачника Java
 * № 36.6
 * <p>
 * Дана некоторая переменная с числом:
 * <p>
 * int num = 5;
 * Сделайте строку, содержащую столько нулей, сколько указано в переменной.
 * В нашем случае получится такая строка:
 * "00000"
 */

public class _366_StringGenerator {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("\"" + stringGenerator(num) + "\"");
    }

    private static String stringGenerator(int numWork) {

        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < numWork; i++) {
            resultBuilder.append("0");
        }

//        resultBuilder.append("0".repeat(Math.max(0, numWork)));

        return resultBuilder.toString();
    }
/*
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < numWork; i++) {
            resultBuilder.append("0");
        }

        return resultBuilder.toString();
    }
*/
}
