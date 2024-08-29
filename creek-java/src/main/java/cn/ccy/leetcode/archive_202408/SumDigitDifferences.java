package cn.ccy.leetcode.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/30 00:22:45
 * @description https://leetcode.cn/problems/sum-of-digit-differences-of-all-pairs/?envType=daily-question&envId=2024-08-30
 * ☆☆☆ 2024cvd
 */
public class SumDigitDifferences {
    public static void main(String[] args) {

    }

    public long sumDigitDifferences(int[] nums) {
        long res = 0;
        int n = nums.length;
        while (nums[0] > 0) {
            int[] cnt = new int[10];
            for (int i = 0; i < n; i++) {
                cnt[nums[i] % 10]++;
                nums[i] /= 10;
            }
            for (int i = 0; i < 10; i++) {
                res += (long) (n - cnt[i]) * cnt[i];
            }
        }
        return res / 2;
    }
}
