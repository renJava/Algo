import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwoSumTwoLoopsMaven {
    private static final Logger logger = LoggerFactory.getLogger(TwoSumTwoLoopsMaven.class);

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    logger.info("Индексы элементов, сумма которых равна целевому значению: [{}, {}]", i, j);
                    return new int[]{i, j};
                }
            }
        }
        logger.error("No two sum solution");
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        logger.info("Проверка равенства суммы 2-х элементов массива заданному числу");

        TwoSumTwoLoopsMaven twoSumTwoLoopsMaven = new TwoSumTwoLoopsMaven();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumTwoLoopsMaven.twoSum(nums, target); // Вызываем нестатический метод twoSum()
    }
}