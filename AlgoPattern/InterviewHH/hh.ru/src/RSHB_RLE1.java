public class RSHB_RLE1 {
    /**
     * Дана строка (возможно, пустая), состоящая из любых символов, кроме цифр:
     * AAAABBBCCXYZDDDDEEEfff~~BBBBBBBBBBBBBBBBBBBBBBBBBBBB Нужно написать функцию RLE,
     * которая на выходе даст строку,
     * вида: A4B3C2XYZD4E3f3~2B28 И сгенерирует ошибку, если на вход пришла невалидная строка с цифрами,
     * Пояснения: Если символ встречается 1 раз, он остается без изменений;,
     * Если символ повторяется более 1 раза подряд, к нему,
     * добавляется количество повторений.
     */
    // Метод для выполнения RLE-сжатия строки
    public static String encode(String input) {

        // Проверка: если строка содержит хотя бы одну цифру — выбрасываем исключение
        if (input.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Строка содержит цифры — недопустимо.");
        }

        // Здесь будем собирать результат
        StringBuilder result = new StringBuilder();

        // Счётчик повторений символов
        int count = 1;

        // Основной цикл по символам строки
        for (int i = 1; i <= input.length(); i++) {

            // Если текущий символ такой же, как предыдущий — увеличиваем счётчик
            if (i < input.length() && input.charAt(i - 1) == input.charAt(i) ) {
                count++;

            } else {
                // Добавляем символ в результат
                result.append(input.charAt(i - 1));

                // Если символ встречался больше одного раза — добавляем число
                if (count > 1) {
                    result.append(count);
                }

                // Сбрасываем счётчик повторяющихся символов перед началом обработки нового символа в строке
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Пример входной строки
        String input = "AAAABBBCCXYZDDDDEEEfff~~BBBBBBBBBBBBBBBBBBBBBBBBBBBB";

        try {
            // Вызов метода и вывод результата
            String output = encode(input);
            System.out.println("RLE: " + output);

        } catch (IllegalArgumentException e) {
            // В случае невалидной строки с цифрами — выводим ошибку
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
