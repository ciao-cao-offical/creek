package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-maximum-length-of-valid-subsequence-i/?envType=daily-question&envId=2025-07-16">3201. 找出有效子序列的最大长度 I</a>
 * @since 2025/7/16 22:45
 */
public class MaximumLength {
    public static void main(String[] args) {

    }

    public int maximumLength(int[] nums) {
        int res = 0;
        int[][] patterns = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
        for (int[] pattern : patterns) {
            int cnt = 0;
            for (int num : nums) {
                if (num % 2 == pattern[cnt % 2]) {
                    cnt++;
                }
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}
