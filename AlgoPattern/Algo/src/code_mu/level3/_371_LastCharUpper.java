package code_mu.level3;

/**
 * Уровень 3.7 задачника Java
 * № 37.1
 * <p>
 * Дана строка. Сделайте заглавной последнюю букву каждого слова в этой строке.
 */

public class _371_LastCharUpper {

    public static void main(String[] args) {
        String str = " Каждый  охотник  желает знать где сидит  фазан ";

        System.out.println("Результат преобразования: " + strConvert(str));

    }

/*
    private static String strConvert(String strIn) {
        String[] strResult = strIn.trim().split("\\s+");
        for (int i = 0; i < strResult.length; i++) {
            strResult[i] = strResult[i].substring(0, strResult[i].length() - 1)
                    + strResult[i].substring(strResult[i].length() - 1).toUpperCase();
        }
        return String.join(" ", strResult).trim(); //Убрали последний пробел
    }
*/


    private static String strConvert(String strIn) {
        String[] strManipul = strIn.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strManipul.length; i++) {
            strManipul[i] = strManipul[i].substring(0, strManipul[i].length() - 1)
                    + strManipul[i].substring(strManipul[i].length() - 1).toUpperCase();
            result.append(strManipul[i]).append(" ");
        }
        return result.toString().trim(); //Убрали последний пробел
    }


}
