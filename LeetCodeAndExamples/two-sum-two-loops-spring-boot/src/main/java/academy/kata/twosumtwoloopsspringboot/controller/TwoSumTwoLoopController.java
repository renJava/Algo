package academy.kata.twosumtwoloopsspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TwoSumTwoLoopController {
    private final int[] nums;

    public TwoSumTwoLoopController() {
        this.nums = new int[]{2, 7, 11, 15};
    }

    @GetMapping("/twosum")
    public int[] twoSum(@RequestParam int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    log.info("Индексы элементов, сумма которых равна целевому значению: [{}, {}]", i, j);
                    return new int[]{i, j};
                }
            }
        }
        log.error("No two sum solution");
        throw new IllegalArgumentException("No two sum solution");
    }
}