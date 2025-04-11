package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-symmetric-integers/?envType=daily-question&envId=2025-04-11">2843. 统计对称整数的数目</a>
 * @since 2025/4/11 21:37
 */
public class CountSymmetricIntegers {
    public static void main(String[] args) {

    }

    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int a = low; a <= high; ++a) {
            if (a < 100 && a % 11 == 0) {
                res++;
            } else if (1000 <= a && a < 10000) {
                int left = a / 1000 + (a % 1000) / 100;
                int right = (a % 100) / 10 + a % 10;
                if (left == right) {
                    res++;
                }
            }
        }
        return res;
    }
}

