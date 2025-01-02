package cn.ccy.leetcode._2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/22 00:48:38
 * @description https://leetcode.cn/problems/find-the-count-of-numbers-which-are-not-special/?envType=daily-question&envId=2024-11-22
 */
public class NonSpecialCount {
    public static void main(String[] args) {

    }

    public int nonSpecialCount(int l, int r) {
        int n = (int) Math.sqrt(r);
        int[] v = new int[n + 1];
        int res = r - l + 1;
        for (int i = 2; i <= n; i++) {
            if (v[i] == 0) {
                if (i * i >= l && i * i <= r) {
                    res--;
                }
                for (int j = i * 2; j <= n; j += i) {
                    v[j] = 1;
                }
            }
        }
        return res;
    }
}
