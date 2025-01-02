package cn.ccy.leetcode._2024.archive_202412;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/20 22:13:10
 * @description https://leetcode.cn/problems/minimum-length-of-anagram-concatenation/?envType=daily-question&envId=2024-12-20
 */
public class MinAnagramLength {
    public static void main(String[] args) {

    }

    public int minAnagramLength(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (n % i != 0) {
                continue;
            }
            if (check(s, i)) {
                return i;
            }
        }
        return n;
    }

    public boolean check(String s, int m) {
        int[] count0 = new int[26];
        for (int j = 0; j < s.length(); j += m) {
            int[] count1 = new int[26];
            for (int k = j; k < j + m; k++) {
                count1[s.charAt(k) - 'a']++;
            }
            if (j > 0 && !Arrays.equals(count0, count1)) {
                return false;
            }
            count0 = count1;
        }
        return true;
    }
}
