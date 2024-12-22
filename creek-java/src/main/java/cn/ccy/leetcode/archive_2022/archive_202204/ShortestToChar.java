package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/19
 * @description https://leetcode-cn.com/problems/shortest-distance-to-a-character/
 */
public class ShortestToChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(new ShortestToChar().shortestToChar(s, c)));
    }

    //两次遍历
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] ans = new int[len];
        for (int i = 0, idx = -len; i < len; i++) {
            if (s.charAt(i) == c) {
                idx = i;
            }

            ans[i] = i - idx;
        }

        for (int i = len - 1, idx = 2 * len; i >= 0; i--) {
            if (s.charAt(i) == c) {
                idx = i;
            }

            ans[i] = Math.min(ans[i], idx - i);
        }

        return ans;
    }
}
