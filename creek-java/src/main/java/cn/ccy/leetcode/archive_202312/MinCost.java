package cn.ccy.leetcode.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/28 0028 00:37:38
 * @description https://leetcode.cn/problems/collecting-chocolates/?envType=daily-question&envId=2023-12-28
 * ☆☆☆☆☆ 2023cvd
 */
public class MinCost {
    public static void main(String[] args) {

    }

    public long minCost(int[] nums, int x) {
        int n = nums.length;
        int[] f = new int[n];
        System.arraycopy(nums, 0, f, 0, n);
        long ans = getSum(f);
        for (int k = 1; k < n; ++k) {
            for (int i = 0; i < n; ++i) {
                f[i] = Math.min(f[i], nums[(i + k) % n]);
            }
            ans = Math.min(ans, (long) k * x + getSum(f));
        }
        return ans;
    }

    public long getSum(int[] f) {
        long sum = 0;
        for (int num : f) {
            sum += num;
        }
        return sum;
    }
}
