package cn.ccy.leetcode.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/10 00:07:04
 * @description https://leetcode.cn/problems/count-increasing-quadruplets/?envType=daily-question&envId=2024-09-10
 * ☆☆☆☆☆ 2024cvd
 */
public class CountQuadruplets {
    public static void main(String[] args) {

    }

    public long countQuadruplets(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        long ans = 0;
        for (int j = 0; j < n; ++j) {
            int suf = 0;
            for (int k = n - 1; k > j; --k) {
                if (nums[j] > nums[k]) {
                    ans += (long) pre[nums[k]] * suf;
                } else {
                    ++suf;
                }
            }
            for (int x = nums[j] + 1; x <= n; ++x) {
                ++pre[x];
            }
        }
        return ans;
    }
}
