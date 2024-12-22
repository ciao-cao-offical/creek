package cn.ccy.leetcode.archive_2024.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/11 0011 01:11:03
 * @description https://leetcode.cn/problems/minimum-additions-to-make-valid-string/description/?envType=daily-question&envId=2024-01-11
 */
public class AddMinimum {
    public static void main(String[] args) {

    }

    public int addMinimum(String word) {
        int n = word.length();
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = d[i - 1] + 2;
            if (i > 1 && word.charAt(i - 1) > word.charAt(i - 2)) {
                d[i] = d[i - 1] - 1;
            }
        }
        return d[n];
    }
}
