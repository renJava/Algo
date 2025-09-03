package code_mu.level2;

/**
 * Уровень 2.7 задачника Java
 * № 27.3
 * <p>
 *
 * Дан массив с датой:
 *
 * String[] arr = {"2025", "12", "31"};
 * Из элементов этого массива соберите дату в следующем формате:
 *
 * "31-12-2025"
 */

public class _273_DateFromString {
    public static void main(String[] args) {
        String[] arr = {"2025", "12", "31"};
        String date = arr[2];
        String month = arr[1];
        String year = arr[0];

        String dateFromStringArray = String.join("-", date, month, year);

        System.out.println(dateFromStringArray);
    }
}
