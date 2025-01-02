package academy.kata.twosumhashmapspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/two-sum")
public class TwoSumHashMapController {
    @GetMapping
    public int[] twoSum(@RequestParam int[] nums, @RequestParam int target) {
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