package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/9
 * @description https://leetcode-cn.com/problems/count-number-of-pairs-with-absolute-difference-k/
 */
public class CountKDifference {
    public static void main(String[] args) {
        System.out.println(new CountKDifference().countKDifference(new int[]{1, 2, 2, 1}, 1));
    }

    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            ans = ans + map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}
