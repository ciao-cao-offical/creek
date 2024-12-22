package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/8
 * @description https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (map.get(target - cur) == null) {
                map.put(cur, i);

            } else {
                return new int[]{i, map.get(target - cur)};
            }
        }
        return null;
    }
}
