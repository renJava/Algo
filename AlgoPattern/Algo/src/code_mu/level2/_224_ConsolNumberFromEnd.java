package code_mu.level2;

/**
 * Уровень 2.2 задачника Java
 * № 22.4
 * <p>
 * Дано некоторое целое число:
 *
 * int num = 12345;
 * Выведите в консоль все его цифры с конца.
 */
public class _224_ConsolNumberFromEnd {
    public static void main(String[] args) {
        int num = 12345;
        System.out.print("\nЦифры числа " + num + " с конца: ");
        for (int i = num; i > 0; i /= 10) {
            System.out.print(i % 10);
        }
    }
}
