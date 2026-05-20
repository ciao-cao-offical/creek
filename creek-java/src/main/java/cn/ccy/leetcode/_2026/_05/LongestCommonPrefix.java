package cn.ccy.leetcode._2026._05;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-length-of-the-longest-common-prefix/description/?envType=daily-question&envId=2026-05-21">3043. 最长公共前缀的长度</a>
 * @since 2026/5/21 00:01
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr1) {
            while (num > 0) {
                seen.add(num);
                num /= 10;
            }
        }

        int best = 0;
        for (int num : arr2) {
            while (num > 0) {
                if (seen.contains(num)) {
                    best = Math.max(best, num);
                }
                num /= 10;
            }
        }

        return best == 0 ? 0 : String.valueOf(best).length();
    }
}
