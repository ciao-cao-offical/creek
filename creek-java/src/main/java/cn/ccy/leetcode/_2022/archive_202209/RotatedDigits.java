package cn.ccy.leetcode._2022.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/25 0025
 * @description https://leetcode.cn/problems/rotated-digits/
 * ☆☆☆ 试试【】
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
