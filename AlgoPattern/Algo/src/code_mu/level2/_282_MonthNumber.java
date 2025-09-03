package code_mu.level2;

/**
 * Уровень 2.8 задачника Java
 * № 28.2
 * <p>
 * Дано целое число, содержащее номер месяца от 1 до 12:
 *
 * byte num = 1;
 * Выведите название месяца, соответствующее этому числу.
 */

public class _282_MonthNumber {
    public static void main(String[] args) {
        byte num = 12;

        String[] months = {
                "Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        System.out.println((num > 0 && num < 13) ? months[num - 1] : "нет такого месяца");

    }
}
