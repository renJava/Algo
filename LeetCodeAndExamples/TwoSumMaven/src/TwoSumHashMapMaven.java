import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMapMaven {
    public static final Logger logger = LoggerFactory.getLogger(TwoSumHashMapMaven.class);
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        logger.info("[{}, {}]", result[0], result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        // Создаем словарь (HashMap)
        Map<Integer, Integer> numMap = new HashMap<>();

        // Проходим по массиву nums
        for (int i = 0; i < nums.length; i++) {
            // Вычисляем разницу между target и текущим числом
            int complement = target - nums[i];

            // Если разница есть в словаре, возвращаем индексы
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            // Иначе добавляем текущее число и его индекс в словарь
            numMap.put(nums[i], i);
        }

        // Если решение не найдено, возвращаем пустой массив
        return new int[0];
    }
}
