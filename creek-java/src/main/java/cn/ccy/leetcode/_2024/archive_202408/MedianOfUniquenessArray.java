package cn.ccy.leetcode._2024.archive_202408;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/27 00:28:58
 * @description https://leetcode.cn/problems/find-the-median-of-the-uniqueness-array/submissions/558825419/?envType=daily-question&envId=2024-08-27
 * ☆☆☆☆☆ 2024cvd
 */
public class MedianOfUniquenessArray {
    public static void main(String[] args) {

    }

    public int medianOfUniquenessArray(int[] nums) {
        int n = nums.length;
        long median = ((long) n * (n + 1) / 2 + 1) / 2;
        int res = 0;
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (check(nums, mid, median)) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }

    // 检测数组中不同元素数目小于等于 t 的连续子数组数目是否大于等于 median
    public boolean check(int[] nums, int t, long median) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        long tot = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            cnt.put(nums[i], cnt.getOrDefault(nums[i], 0) + 1);
            while (cnt.size() > t) {
                cnt.put(nums[j], cnt.get(nums[j]) - 1);
                if (cnt.get(nums[j]) == 0) {
                    cnt.remove(nums[j]);
                }
                j++;
            }
            tot += i - j + 1;
        }
        return tot >= median;
    }
}
