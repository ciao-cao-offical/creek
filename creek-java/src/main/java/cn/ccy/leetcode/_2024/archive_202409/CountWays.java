package cn.ccy.leetcode._2024.archive_202409;

import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/4 01:28:52
 * @description https://leetcode.cn/problems/happy-students/?envType=daily-question&envId=2024-09-04
 */
public class CountWays {
    public static void main(String[] args) {

    }

    public int countWays(List<Integer> nums) {
        int n = nums.size();
        int res = 0;
        Collections.sort(nums);
        for (int k = 0; k <= n; k++) {
            // 前 k 个元素的最大值是否小于 k
            if (k > 0 && nums.get(k - 1) >= k) {
                continue;
            }
            // 后 n - k 个元素的最小值是否大于 k
            if (k < n && nums.get(k) <= k) {
                continue;
            }
            res++;
        }
        return res;
    }
}
