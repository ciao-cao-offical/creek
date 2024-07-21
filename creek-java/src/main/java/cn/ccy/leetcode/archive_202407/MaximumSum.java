package cn.ccy.leetcode.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/21 15:07:27
 * @description https://leetcode.cn/problems/maximum-subarray-sum-with-one-deletion/?envType=daily-question&envId=2024-07-21
 */
public class MaximumSum {
    public static void main(String[] args) {

    }

    public int maximumSum(int[] arr) {
        int len = arr.length;
        int r0 = arr[0];
        int r1 = 0;
        int res = arr[0];
        for (int i = 1; i < len; i++) {
            // 注意r1 和 r2 的赋值顺序
            r1 = Math.max(r1 + arr[i], r0);
            r0 = Math.max(r0, 0) + arr[i];
            res = Math.max(res, Math.max(r0, r1));
        }
        return res;
    }
}
