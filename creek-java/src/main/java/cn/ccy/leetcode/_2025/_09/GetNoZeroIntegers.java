package cn.ccy.leetcode._2025._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/convert-integer-to-the-sum-of-two-no-zero-integers/?envType=daily-question&envId=2025-09-08">1317. 将整数转换为两个无零整数的和</a>
 * @since 2025/9/8 22:24
 */
public class GetNoZeroIntegers {
    public static void main(String[] args) {

    }

    public int[] getNoZeroIntegers(int n) {
        for (int A = 1; A < n; ++A) {
            int B = n - A;
            if (!String.valueOf(A).contains("0") && !String.valueOf(B).contains("0")) {
                return new int[]{A, B};
            }
        }
        return new int[0];
    }
}
