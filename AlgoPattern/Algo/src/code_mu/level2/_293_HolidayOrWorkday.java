package code_mu.level2;

/**
 * Уровень 2.9 задачника Java
 * № 29.3
 * <p>
 * Дано целое число, содержащее номер дня недели от 1 до 7:
 * <p>
 * byte num = 1;
 * Определите, эта переменная содержит выходной или будний день.
 */

public class _293_HolidayOrWorkday {
    public static void main(String[] args) {
        byte num = 10;

        if (num < 1 || num > 7) {
            System.out.println("Номер дня недели, а у вас: " + num + "\nдолжен быть в диапазоне от 1 до 7");
            return;
        }

        System.out.println("Выходной или рабочий день недели номер " + num + "?\n" +
                (num == 6 || num == 7 ? "Holiday" : "Workday"));
    }
}
