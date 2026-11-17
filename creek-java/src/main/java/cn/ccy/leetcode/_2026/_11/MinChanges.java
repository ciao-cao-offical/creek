package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-number-of-changes-to-make-binary-string-beautiful/?envType=daily-question&envId=2026-11-18">2914. 使二进制字符串变美丽的最少修改次数</a>
 * @since 2026/11/18 01:03
 */
public class MinChanges {
    public static void main(String[] args) {

    }

    public int minChanges(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ans++;
            }
        }
        return ans;
    }
}
