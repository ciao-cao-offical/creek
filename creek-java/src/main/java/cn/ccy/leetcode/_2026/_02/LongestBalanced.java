package cn.ccy.leetcode._2026._02;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-balanced-subarray-i/?envType=daily-question&envId=2026-02-10">3719. 最长平衡子数组 I</a>
 * @since 2026/2/10 00:26
 */
public class LongestBalanced {
    public static void main(String[] args) {

    }

    public int longestBalanced(int[] nums) {
        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> odd = new HashMap<>();
            HashMap<Integer, Integer> even = new HashMap<>();

            for (int j = i; j < nums.length; j++) {
                HashMap<Integer, Integer> map = (nums[j] & 1) == 1 ? odd : even;
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

                if (odd.size() == even.size()) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        return len;
    }
}
