package cn.ccy.leetcode._2026._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-deletions-to-make-string-balanced/?envType=daily-question&envId=2026-02-07">1653. 使字符串平衡的最少删除次数</a>
 * @since 2026/2/7 22:53
 */
public class MinimumDeletions {
    public static void main(String[] args) {

    }

    public int minimumDeletions(String s) {
        int leftb = 0, righta = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                righta++;
            }
        }
        int res = righta;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                righta--;
            } else {
                leftb++;
            }
            res = Math.min(res, leftb + righta);
        }
        return res;
    }
}
