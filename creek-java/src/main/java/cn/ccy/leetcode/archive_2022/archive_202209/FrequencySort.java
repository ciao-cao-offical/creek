package cn.ccy.leetcode.archive_2022.archive_202209;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/19
 * @description https://leetcode.cn/problems/sort-array-by-increasing-frequency/
 */
public class FrequencySort {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(new FrequencySort().frequencySort(nums)));
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        list.sort((a, b) -> {
            Integer cntA = map.get(a);
            Integer cntB = map.get(b);
            return !Objects.equals(cntA, cntB) ? cntA - cntB : b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
