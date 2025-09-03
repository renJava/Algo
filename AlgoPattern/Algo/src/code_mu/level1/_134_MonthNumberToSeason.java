package code_mu.level1;

/**
 * Уровень 13 задачника Java
 * № 134
 * <p>
 * Дано целое число, содержащее номер месяца от 1 до 12:
 * <p>
 * byte num = 1;
 * Определите, в какую пору года попадает этот месяц.
 */

public class _134_MonthNumberToSeason {
    static int monthNumber = 13;

    public static void main(String[] args) {
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Номер месяца не соответствует диапазону от 1 до 12";
        };
        System.out.println("Время года: " + season);
    }
}
