package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/?envType=daily-question&envId=2026-03-07">1888. 使二进制字符串字符交替的最少反转次数</a>
 * @since 2026/3/7 16:33
 */
public class MinFlips {
    public static void main(String[] args) {

    }

    public int minFlips(String s) {
        int n = s.length();
        int[][] pre = new int[n][2];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // 计算前缀数组
            pre[i][0] = (i == 0 ? 0 : pre[i - 1][1]) + (ch == '1' ? 1 : 0);
            pre[i][1] = (i == 0 ? 0 : pre[i - 1][0]) + (ch == '0' ? 1 : 0);
        }

        int ans = Math.min(pre[n - 1][0], pre[n - 1][1]);
        // 如果是奇数长度，需要考虑移动操作
        if (n % 2 == 1) {
            int[][] suf = new int[n][2];
            for (int i = n - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                // 计算后缀数组
                suf[i][0] = (i == n - 1 ? 0 : suf[i + 1][1]) + (ch == '1' ? 1 : 0);
                suf[i][1] = (i == n - 1 ? 0 : suf[i + 1][0]) + (ch == '0' ? 1 : 0);
            }

            // 遍历所有分割点
            for (int i = 0; i < n - 1; i++) {
                ans = Math.min(ans, pre[i][0] + suf[i + 1][0]);
                ans = Math.min(ans, pre[i][1] + suf[i + 1][1]);
            }
        }

        return ans;
    }
}
