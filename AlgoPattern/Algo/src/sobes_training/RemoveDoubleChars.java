package sobes_training;
import java.util.LinkedHashSet;

public class RemoveDoubleChars {
    public static void main(String[] args) {
        // Исходная строка с повторяющимися символами
        String input = "МммоооосссскккКкВваааа,,, уууууууУУУввввввввввыыыыыыыы,,  , сссСлЛлееЕЕЕззАаАаААммммм нннееЕЕЕе вввЕееррррРРиит!!!!!!";

        // Вызов метода для удаления повторяющихся символов и сохранения слов
        String result = removeDuplicatesAndPreserveWords(input);

        // Преобразуем первую букву в заглавную
        result = capitalizeFirstLetter(result);

        // Вывод результата
        System.out.println(result);
    }

    public static String removeDuplicatesAndPreserveWords(String str) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        String[] words = str.split("(?<=\\s|,|$)|(?=\\s|,)"); // Разделяем строку на слова и знаки

        for (String word : words) {
            if (word.trim().isEmpty()) {
                continue; // Пропускаем пустые строки
            }

            StringBuilder uniqueWord = new StringBuilder();
            seen.clear();
            boolean addedComma = false;

            for (char currentChar : word.toCharArray()) {
                char lowerChar = Character.toLowerCase(currentChar);

                if (currentChar != ' ') {
                    if (currentChar == ',') {
                        // Добавляем запятую только один раз
                        if (!addedComma) {
                            uniqueWord.append(currentChar);
                            addedComma = true;
                        }
                    } else {
                        if (!seen.contains(lowerChar)) {
                            uniqueWord.append(lowerChar);
                            seen.add(lowerChar);
                        }
                    }
                }
            }

            // Добавляем уникальное слово в итоговую строку
            if (uniqueWord.length() > 0) {
                sb.append(uniqueWord).append(" "); // Добавляем пробел после слова
            }
        }

        // Убираем лишние пробелы и запятые
        String result = sb.toString().trim();
        result = result.replaceAll(",\\s*,+", ","); // Заменяем несколько запятых на одну
        result = result.replaceAll("\\s*,", ","); // Убираем пробелы перед запятой
        result = result.replaceAll(",\\s+", ", "); // Убираем лишние пробелы после запятой

        // Убираем все двойные запятые и запятые, разделенные пробелами
        result = result.replaceAll(",\\s*,", ",");
        result = result.replaceAll(",+", ","); // Убираем все двойные запятые

        return result;
    }

    public static String capitalizeFirstLetter(String str) {
        if (str.isEmpty()) {
            return str; // Если строка пустая, возвращаем её
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1); // Делаем первую букву заглавной
    }
}