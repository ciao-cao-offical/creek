package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/30 0030
 * @description https://leetcode-cn.com/problems/assign-cookies/
 */
public class FindContentChildren {
    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        System.out.println(new FindContentChildren().findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s) {
        if (s == null || s.length == 0) {
            return 0;
        }
        int gl = g.length;
        int sl = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0, j = 0; i < gl && j < sl; i++, j++) {
            while (j < sl && g[i] > s[j]) {
                j++;
            }

            if (j < sl) {
                count++;
            }
        }

        return count;
    }
}
