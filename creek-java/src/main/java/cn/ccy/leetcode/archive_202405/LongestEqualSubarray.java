package cn.ccy.leetcode.archive_202405;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/23 23:10:32
 * @description https://leetcode.cn/problems/find-the-longest-equal-subarray/?envType=daily-question&envId=2024-05-23
 */
public class LongestEqualSubarray {
    public static void main(String[] args) {
        List<Integer> nums = Lists.newArrayList(1, 3, 2, 3, 1, 3);
        int k = 3;
        System.out.println(new LongestEqualSubarray().longestEqualSubarray(nums, k));
    }

    // 滑动窗口
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        Map<Integer, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pos.computeIfAbsent(nums.get(i), x -> new ArrayList<>()).add(i);
        }
        int ans = 0;
        for (List<Integer> vec : pos.values()) {
            for (int i = 0, j = 0; i < vec.size(); i++) {
                /* 缩小窗口，直到不同元素数量小于等于 k */
                while (vec.get(i) - vec.get(j) - (i - j) > k) {
                    j++;
                }
                ans = Math.max(ans, i - j + 1);
            }
        }
        return ans;
    }
}
