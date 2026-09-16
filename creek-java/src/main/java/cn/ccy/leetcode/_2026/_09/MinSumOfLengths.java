package cn.ccy.leetcode._2026._09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/?envType=daily-question&envId=2026-09-17">1477. 找两个和为目标值且不重叠的子数组</a>
 * @since 2026/9/17 04:52
 */
public class MinSumOfLengths {
    public static void main(String[] args) {

    }

    public int minSumOfLengths(int[] arr, int target) {
        Map<Integer, Integer> pos = new HashMap<>();
        pos.put(0, -1);
        int n = arr.length, s = 0, ans = n + 1, minL = n;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            if (pos.containsKey(s - target)) {
                int j = pos.get(s - target), len = i - j;
                ans = Math.min(ans, len + (j == -1 ? n : arr[j]));
                minL = Math.min(minL, len);
            }
            arr[i] = minL;
            pos.put(s, i);
        }
        return ans == n + 1 ? -1 : ans;
    }
}
