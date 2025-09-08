package code_mu.level4;

/**
 Дано целое число:

 int num = 12345;
 Выведите в консоль количество четных цифр в этом числе.
 */

public class _422_EvenNumbersReportStream {
    public static void main(String[] args) {
        int num = 12345;

        long evenCount = String.valueOf(num) // Преобразуем число в строку
                .chars() // Получаем поток символов
                .map(Character::getNumericValue) // Преобразуем символы в цифры
                .filter(digit -> digit % 2 == 0) // Фильтруем четные цифры
                .count(); // Считаем количество

        System.out.println("Количество четных цифр: " + evenCount);
    }
}
