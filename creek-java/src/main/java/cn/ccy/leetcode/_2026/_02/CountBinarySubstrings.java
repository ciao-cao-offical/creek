package cn.ccy.leetcode._2026._02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-binary-substrings/?envType=daily-question&envId=2026-02-19">696. 计数二进制子串</a>
 * @since 2026/2/19 21:54
 */
public class CountBinarySubstrings {
    public static void main(String[] args) {

    }

    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<Integer>();
        int ptr = 0, n = s.length();
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            counts.add(count);
        }
        int ans = 0;
        for (int i = 1; i < counts.size(); ++i) {
            ans += Math.min(counts.get(i), counts.get(i - 1));
        }
        return ans;
    }
}
