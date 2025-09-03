package code_mu.level3;

/**
 * Уровень 3.8 задачника Java
 * № 38.5
 * <p>
 * Дана строка в формате:
 * "kebab-case"
 * Преобразуйте ее в формат:
 * "snake_case"
 */

public class _385_KebabCaseToSnakeCase {
    public static void main(String[] args) {
        String str = "kebab-ca-se";
        char[] chars = str.toCharArray();

        System.out.println("Результат в snake_case: " + toSnakeCase(chars));
    }

    private static String toSnakeCase(char[] charsIn) {
        for (int i = 0; i < charsIn.length; i++) {
            if (charsIn[i] == '-') {
                charsIn[i] = '_';
            }
        }
//        return new String(charsIn);
        return String.valueOf(charsIn);
/*
        System.out.println("Результат в snake_case: "
                + str.replace("-", "_"));
*/
    }
}
