package code_mu.level1;

/**
 * Уровень 13 задачника Java
 * № 131
 * <p>
 * Выведите в консоль все целые числа от 1 до 100.
 */

public class _131_1_100_Integer {
    public static void main(String[] args) {
/*        for (int i = 1; i <= 100; i++) {

            if (i % 10 != 0 && i != 100) {
                System.out.print(i + ", ");
            } else {
                if (i % 10 == 0 && i != 100) {
                    System.out.println(i + ", ");
                } else if (i == 100) {
                    System.out.println(i);
                }
            }
*/

/*
        Запятая после 10-х чисел не ставится, но ставим точку после 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 10 == 0) {
                System.out.print(i == 10 ? "," : ""); // Точка после 100, иначе новая строка
                System.out.println(i == 100 ? "." : ""); // Точка после 100, иначе новая строка
            } else {
                System.out.print(", "); // Запятая после остальных чисел
            }
*/
//        Запятая после каждых 10, точка после 100. Каждый десяток с новой строки
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 10 == 0) {
                // Если это 100, ставим точку, иначе запятую
                System.out.println(i == 100 ? "." : ",");
            } else {
                System.out.print(", "); // Запятая после остальных чисел
            }
        }
    }
}


