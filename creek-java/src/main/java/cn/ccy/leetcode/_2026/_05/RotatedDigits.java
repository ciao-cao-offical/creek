package cn.ccy.leetcode._2026._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/rotated-digits/?envType=daily-question&envId=2026-05-02">788. 旋转数字</a>
 * @since 2026/5/2 22:30
 */
public class RotatedDigits {
    public static void main(String[] args) {

    }

    static int[] check = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};

    public int rotatedDigits(int n) {
        int ans = 0;
        for (int i = 1; i <= n; ++i) {
            String num = String.valueOf(i);
            boolean valid = true, diff = false;
            for (int j = 0; j < num.length(); ++j) {
                char ch = num.charAt(j);
                if (check[ch - '0'] == -1) {
                    valid = false;
                } else if (check[ch - '0'] == 1) {
                    diff = true;
                }
            }
            if (valid && diff) {
                ++ans;
            }
        }
        return ans;
    }
}
