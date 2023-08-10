package cn.ccy.leetcode.archive_202202_b;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/21
 * @description https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        int maxSubLen = 1;
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                break;
            }
            Set<Character> set = new HashSet<>();
            for (int j = i; j < len; j++) {
                if (!set.add(chars[j])) {
                    break;
                }
            }
            maxSubLen = Math.max(maxSubLen, set.size());
        }

        return maxSubLen;
    }
}
