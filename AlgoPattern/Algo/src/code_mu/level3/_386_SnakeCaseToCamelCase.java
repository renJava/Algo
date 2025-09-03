package code_mu.level3;

/**
 * Уровень 3.8 задачника Java
 * № 38.6
 * <p>
 * Дана строка в формате:
 * "snake_case"
 * Преобразуйте ее в формат:
 * <p>
 * "camelCase"
 */

public class _386_SnakeCaseToCamelCase {
    public static void main(String[] args) {
        String str = "snake_CASE";
        System.out.println("Результат в camelCase: " + toCamelCase(str));
    }

    private static String toCamelCase(String strIn) {
        if ((strIn == null || strIn.isEmpty()) || !strIn.contains("_") || strIn.length() < 2) return strIn;

        String[] strManipul = strIn.split("_");
        StringBuilder result = new StringBuilder(strManipul[0]);

        for (int i = 1; i < strManipul.length; i++) {
            strManipul[i] = strManipul[i].substring(0, 1).toUpperCase() +
                    strManipul[i].substring(1).toLowerCase();
            result.append(strManipul[i]);
        }

        return result.toString();

/*
        for (int i = 1; i < strManipul.length; i++) {
            strManipul[i] = strManipul[i].substring(0, 1).toUpperCase()
                    + strManipul[i].substring(1).toLowerCase();
            result.append(strManipul[i]);
        }
        return result.toString();
*/


    }
}
