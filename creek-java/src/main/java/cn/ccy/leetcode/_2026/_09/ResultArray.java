package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-x-value-of-array-i/?envType=daily-question&envId=2026-09-21">3524. 求出数组的 X 值 I</a>
 * @since 2026/9/21 01:07
 */
public class ResultArray {
    public static void main(String[] args) {

    }

    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] result = new long[k];
        long[] dp = new long[k];  // 初始状态，表示尚未处理任何元素，因此不存在非空子数组

        for (int i = 0; i < n; i++) {
            long[] ndp = new long[k];  // 当前层状态（滚动数组）
            ndp[nums[i] % k]++;
            for (int r = 0; r < k; r++) {
                ndp[(int) (((long) r * nums[i]) % k)] += dp[r];
            }
            dp = ndp;  // 更新状态
            // 累加答案
            for (int r = 0; r < k; r++) {
                result[r] += dp[r];
            }
        }

        return result;
    }
}
