package code_mu.level1;

/**
 * Уровень 1.1 задачника Java
 * № 116
 * <p>
 * Дано слово. Получите его последнюю букву. Если слово заканчивается на мягкий знак,
 * то получите предпоследнюю букву.
 */

public class _116_LastSimbolWithout {

    public static void main(String[] args) {

        String lastSimbolWithout = "vhь";

        int lastLength = lastSimbolWithout.length();
        String lastSimbolBefore = lastLength > 1
                ? lastSimbolWithout.substring(lastLength - 2, lastLength - 1)
                : "Мало символов";

        String lastSimbolResult = lastSimbolWithout.charAt(lastLength - 1) == 'ь'
                ? lastSimbolBefore
                : lastSimbolWithout.substring(lastLength - 1);

        System.out.println("Последний символ: " + lastSimbolResult);
    }
}
