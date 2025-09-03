package code_mu.level1;

/**
 * Уровень 1.10 задачника Java
 * № 1.104
 * <p>
 * Дано некоторое число:
 * <p>
 * float num = 12345;
 * Делите его на 2 столько раз, пока результат не будет меньше 10.
 * Сколько итераций для этого потребуется?
 */

public class _1104_DivideDy10 {
    public static void main(String[] args) {
        float num = 12345;
        int count = 0;
        while (num >= 10) {
            num /= 2;
            count++;
        }
        System.out.println("Количество итераций: " + count);

    }
}
