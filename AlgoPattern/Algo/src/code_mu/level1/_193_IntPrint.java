package code_mu.level1;

/**
 * Уровень 19 задачника Java
 * № 193
 * <p>
 * Выведите в консоль все целые числа от -100 до 0.
 */

public class _193_IntPrint {
    public static void main(String[] args) {

        for (int i = -100; i <= 0; i++) {
            System.out.print(i);
            // Проверяем, нужно ли добавить запятую или точку
            System.out.print(i < 0 ? ", " : ".");
            // Переход на новую строку после каждых 10 чисел и после числа 0
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}

