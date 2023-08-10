package cn.ccy.leetcode.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/6 19:53
 * @description https://leetcode.cn/problems/convert-to-base-2/solutions/
 */
public class BaseNeg2 {
    public static void main(String[] args) {

    }

    public String baseNeg2(int n) {
        if (n == 0 || n == 1) {
            return String.valueOf(n);
        }
        StringBuilder res = new StringBuilder();
        while (n != 0) {
            int remainder = n & 1;
            res.append(remainder);
            n -= remainder;
            n /= -2;
        }
        return res.reverse().toString();
    }
}
