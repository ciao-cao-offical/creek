package cn.ccy.leetcode._2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/7 0007 00:17:47
 * @description https://leetcode.cn/problems/find-the-divisibility-array-of-a-string/?envType=daily-question&envId=2024-03-07
 */
public class DivisibilityArray {
    public static void main(String[] args) {

    }

    public int[] divisibilityArray(String word, int m) {
        int[] res = new int[word.length()];
        long cur = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            cur = (cur * 10 + (c - '0')) % m;
            res[i] = (cur == 0) ? 1 : 0;
        }
        return res;
    }
}
