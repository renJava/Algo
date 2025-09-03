package code_mu.level1;

/**
 * Уровень 17 задачника Java
 * № 176
 * <p>
 * Дано дробное число, содержащее количество гигабайт:
 * <p>
 * float gb = 35.24;
 * Переведите это значение в мегабайты, килобайты и байты.
 */

public class _176_FloatGbToMbKbAndBt {
    static float gb = 35.24f;

    public static void main(String[] args) {
        float mb = gb * 1024;
        float kb = mb * 1024;
        float bt = kb * 1024;
        System.out.println("В мегабайт-mb: " + mb);
        System.out.println("В килобайт-kb: " + kb);
        System.out.println("В байтах-bt: " + bt);

        /*
        float mb = gb * 1024;
        float kb = mb * 1024;
        float bt = kb * 1024;
        System.out.println(mb);
        System.out.println(kb);
        System.out.println(bt);*/
    }
}
