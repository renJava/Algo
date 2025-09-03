package code_mu.level1;

/**
 * Уровень 14 задачника Java
 * № 141
 * <p>
 * Выведите в консоль все четные числа из промежутка от 1 до 100.
 */

public class _141_1_100_OnlyEven {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i);
            if (i % 10 == 0) {
                // Если это 100, ставим точку, иначе запятую
                System.out.println(i != 100 ? "," : ".");
            } else {
                System.out.print(", "); // Запятая после остальных чисел
            }
        }
    }
    }
