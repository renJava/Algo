package sobes_training;
/**
 * Выведите первое не повторяющиеся имя с минимальным значением
 * Map<String, Integer> map = new HashMap<>{{"Аня", 1},{"Катя", 3},{"Аня", 4},{"Даша", 1},};
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatableNameWithMinNumber {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>() {{
            put("Аня", 1);
            put("Катя", 3);
            put("Аня", 4); // Последнее значение "Ани" перезаписывает предыдущее
            put("Даша", 1);
        }};

        // Вызываем метод для поиска первого не повторяющегося имени с минимальным значением
        String result = findFirstNonRepeatingNameWithMinValue(map);
        // Выводим результат
        System.out.println(result);
    }

    // Метод для поиска первого не повторяющегося имени с минимальным значением
    public static String findFirstNonRepeatingNameWithMinValue(Map<String, Integer> map) {
        // Создаем LinkedHashMap для хранения количества вхождений имен
        Map<String, Integer> countMap = new LinkedHashMap<>();

        // Подсчитываем количество вхождений каждого имени
        for (String name : map.keySet()) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        // Переменные для хранения имени с минимальным значением
        String minName = null;
        int minValue = Integer.MAX_VALUE; // Устанавливаем начальное значение как максимальное

        // Ищем имя с минимальным значением, которое встречается только один раз
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey(); // Получаем имя
            int value = entry.getValue(); // Получаем значение

            // Проверяем, если имя встречается только один раз и его значение меньше текущего минимального
            if (countMap.get(name) == 1 && value < minValue) {
                minValue = value; // Обновляем минимальное значение
                minName = name; // Обновляем имя
            }
        }

        // Возвращаем найденное имя или сообщение, если такого имени нет
        return minName != null ? minName : "Нет не повторяющихся имен";
    }
}
