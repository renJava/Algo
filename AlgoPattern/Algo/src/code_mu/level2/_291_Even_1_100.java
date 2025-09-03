package code_mu.level2;

/**
 * Уровень 2.9 задачника Java
 * № 29.1
 * <p>
 * С помощью цикла заполните массив четными числами из промежутка от 1 до 100.
 */

public class _291_Even_1_100 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        System.out.println("\nМассив с чётными числами: ");

        for (int i = 2; i <= 100; i += 2) {
            int j = i - 1; // Чётные числа в нечётных индексах, начиная с нулевого
            arr[j] = i;    // см. пред. коммент
            System.out.print(i % 50 == 0
                    ? arr[j] + "\n"
                    : arr[j] + " ");
        }
    }
}
