package cn.ccy.leetcode._2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/12 00:13:23
 * @description https://leetcode.cn/problems/count-substrings-that-satisfy-k-constraint-i/?envType=daily-question&envId=2024-11-12
 */
public class CountKConstraintSubstrings {
    public static void main(String[] args) {

    }

    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length(), res = 0;
        for (int i = 0; i < n; ++i) {
            int[] count = new int[2];
            for (int j = i; j < n; ++j) {
                count[s.charAt(j) - '0']++;
                if (count[0] > k && count[1] > k) {
                    break;
                }
                res++;
            }
        }
        return res;
    }
}
