package code_mu.level3;

/**
 * Уровень 3.8 задачника Java
 * № 38.7
 * <p>
 * Дана строка в формате:
 * "camelCase"
 * Преобразуйте ее в формат:
 * <p>
 * "snake_case"
 */

public class _387_CamelCaseToSnakeCase {
    public static void main(String[] args) {
        String str = "E";
        System.out.println("Результат в snake_case: " + toSnakeCase(str));
    }

    private static String toSnakeCase(String camelIn) {
/*
        if (camelIn == null) return (camelIn + " - исправьте входящий формат");
        return camelIn.replaceAll("[A-Z]", "_$0").toLowerCase();
*/
//        if (camelIn == null && camelIn.length() > 1) return (camelIn + " - исправьте входящий формат");

        StringBuilder result = new StringBuilder();

        for (char ch : camelIn.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // Если это заглавная буква, добавляем подчеркивание и букву в нижнем регистре
                if (!result.isEmpty()) result.append('_');

                result.append(Character.toLowerCase(ch));
            } else {
                // Если это строчная буква, просто добавляем ее
                result.append(ch);
            }
        }

        return result.toString();
    }
/*
        if (camelIn == null && camelIn.matches("^[a-zA-Z0-9+$]")) return (camelIn
                + " - исправьте входящий формат");
        String[] stringManipul = camelIn.split("A-Z");
        StringBuilder result = new StringBuilder(stringManipul[0]);

        for (int i = 1; i < stringManipul.length; i++) {
            result.append("_");
//            result.append(stringManipul[i].substring(0, stringManipul.length));
        }
        return result.toString();
    }
*/

}
