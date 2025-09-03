package code_mu.level1;

/**
 * Уровень 14 задачника Java
 * № 143
 * <p>
 * <p>
 * Дано целое число, содержащее номер минуты от 0 до 60:
 * byte num = 30;
 * Определите, в какую четверть часа попадает это значение.
 */

public class _143_QuoteOfHourNumber {
    public static void main(String[] args) {
        byte num = 14;
        String result;

        if (num < 0 || num > 60) result = "Введено некорректное значение";
        else if (num == 60) result = "Указана последняя минута часа";
        else result = String.valueOf(num)+ " м.: " + (num / 15 + 1) + "-я четверть часа";

        System.out.println(result);
    }

}

