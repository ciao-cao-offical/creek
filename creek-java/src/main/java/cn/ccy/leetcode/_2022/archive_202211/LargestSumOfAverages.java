package cn.ccy.leetcode._2022.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/28 0028
 * @description https://leetcode.cn/problems/largest-sum-of-averages/
 * ★★★★★ 我是数学小垃圾...
 */
public class LargestSumOfAverages {
    public static void main(String[] args) {
        int[] nums = {9, 1, 2, 3, 9};
        int k = 3;
        System.out.println(new LargestSumOfAverages().largestSumOfAverages(nums, k));
    }

    //【前缀和 + 序列 DP】 参考自：https://leetcode.cn/problems/largest-sum-of-averages/solutions/1995139/by-ac_oier-yfnt/
    public double largestSumOfAverages(int[] nums, int m) {
        int n = nums.length;
        double[] sum = new double[n + 10];
        for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] + nums[i - 1];
        double[][] f = new double[n + 10][m + 10];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, m); j++) {
                if (j == 1) {
                    f[i][1] = sum[i] / i;
                } else {
                    for (int k = 2; k <= i; k++) {
                        f[i][j] = Math.max(f[i][j], f[k - 1][j - 1] + (sum[i] - sum[k - 1]) / (i - k + 1));
                    }
                }
            }
        }
        return f[n][m];
    }
}
