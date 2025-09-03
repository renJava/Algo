package code_mu.level1;

/**
 * Уровень 1.1 задачника Java
 * № 111
 * <p>
 * Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
 */

public class _111_NegativeNumber {
    public static void main(String[] args) {
        int number = -5;
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
}
