package cn.ccy.leetcode.archive_202304;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/20 0020 22:59:18
 * @description https://leetcode.cn/problems/make-array-strictly-increasing/
 * ☆☆☆☆☆ cvd
 */
public class MakeArrayIncreasing {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 6, 7}, arr2 = {1, 3, 2, 4};
        System.out.println(new MakeArrayIncreasing().makeArrayIncreasing(arr1, arr2));
    }

    private int[] a, b;
    private Map<Integer, Integer> memo[];

    public int makeArrayIncreasing(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        Arrays.sort(b); // 为能二分查找，对 b 排序
        int n = a.length;
        memo = new HashMap[n];
        Arrays.setAll(memo, e -> new HashMap<>());
        int ans = dfs(n - 1, Integer.MAX_VALUE); // 假设 a[n-1] 右侧有个无穷大的数
        return ans < Integer.MAX_VALUE / 2 ? ans : -1;
    }

    private int dfs(int i, int pre) {
        if (i < 0) return 0;
        if (memo[i].containsKey(pre))
            return memo[i].get(pre); // 之前计算过了
        // 不替换 a[i]
        int res = a[i] < pre ? dfs(i - 1, a[i]) : Integer.MAX_VALUE / 2;
        // 二分查找 b 中小于 pre 的最大数的下标
        int k = lowerBound(b, pre) - 1;
        if (k >= 0) // a[i] 替换成小于 pre 的最大数
            res = Math.min(res, dfs(i - 1, b[k]) + 1);
        memo[i].put(pre, res); // 记忆化
        return res;
    }

    // 见 https://www.bilibili.com/video/BV1AP41137w7/
    private int lowerBound(int[] nums, int target) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // nums[left] < target
            // nums[right] >= target
            int mid = (left + right) >>> 1;
            if (nums[mid] < target)
                left = mid; // 范围缩小到 (mid, right)
            else
                right = mid; // 范围缩小到 (left, mid)
        }
        return right;
    }
}
