package cn.ccy.leetcode._2023.archive_202302;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/16 0016 22:57:24
 * @description https://leetcode.cn/problems/maximum-number-of-pairs-in-array/
 */
public class NumberOfPairs {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 3, 2, 2};
        System.out.println(Arrays.toString(new NumberOfPairs().numberOfPairs(nums)));
    }

    public int[] numberOfPairs(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return new int[]{0, 1};

        } else if (len == 2) {
            if (nums[0] == nums[1]) {
                return new int[]{1, 0};
            } else {
                return new int[]{0, 2};
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int numOfPairs = 0;
        int numOfLeft = 0;
        for (Integer num : map.keySet()) {
            Integer count = map.get(num);
            numOfPairs += count / 2;
            numOfLeft += count % 2;
        }
        return new int[]{numOfPairs, numOfLeft};
    }
}
