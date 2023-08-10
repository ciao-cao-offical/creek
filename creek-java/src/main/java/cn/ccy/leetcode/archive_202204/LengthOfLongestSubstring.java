package cn.ccy.leetcode.archive_202204;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/10 0010
 * @description https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }

    //滑动窗口
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int k = -1;
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }

            while (k + 1 < len && !set.contains(s.charAt(k + 1))) {
                set.add(s.charAt(k + 1));
                k++;
            }

            max = Math.max(max, k - i + 1);
        }

        return max;
    }
}
