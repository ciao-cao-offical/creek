package cn.ccy.leetcode.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/2 22:03:02
 * @description https://leetcode.cn/problems/number-of-bit-changes-to-make-two-integers-equal/description/?envType=daily-question&envId=2024-11-02
 */
public class MinChanges {
    public static void main(String[] args) {

    }

    public int minChanges(int n, int k) {
        int res = 0;
        while (n > 0 || k > 0) {
            if ((n & 1) == 0 && (k & 1) == 1) {
                return -1;
            }
            if ((n & 1) == 1 && (k & 1) == 0) {
                res++;
            }
            n >>= 1;
            k >>= 1;
        }
        return res;
    }
}
