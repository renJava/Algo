package code_mu.level1;

/**
 * Уровень 1.1 задачника Java
 * № 114
 * <p>
 * Дано число. Проверьте, четное оно или нет.
 */

public class _114_EvenOdd {
    static int EvenOdd = 5;

    public static void main(String[] args) {
        if (EvenOdd % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечетное");
        }
    }
}