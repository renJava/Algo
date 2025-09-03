package code_mu.level3;

/**
 * Уровень 3.5 задачника Java
 * № 35.1
 * <p>
 * Дан текст со словами. Запишите в массив все слова, начинающиеся на букву "a".
 */

public class _351_WordsStartWithAa {
    public static void main(String[] args) {
        String inString = "  Альпака ела апельсин из аптеки  ";
        String prepareString = inString.trim().toLowerCase();
        String[] stringArray = prepareString.split(" ");

        for (String s : stringArray) {
            if (s.startsWith("а")) System.out.print(" " + s);
        }
    }

}
