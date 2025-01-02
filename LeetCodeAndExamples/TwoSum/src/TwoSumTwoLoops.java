public class TwoSumTwoLoops {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        System.out.println("Проверка равенства суммы 2-х элементов массива заданному числу");

        TwoSumTwoLoops twoSumTwoLoops = new TwoSumTwoLoops();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumTwoLoops.twoSum(nums, target); // Вызываем нестатический метод twoSum()

        System.out.println("Индексы элементов, сумма которых равна целевому значению: [" + result[0] + ", " + result[1]
                + "]");
    }
}