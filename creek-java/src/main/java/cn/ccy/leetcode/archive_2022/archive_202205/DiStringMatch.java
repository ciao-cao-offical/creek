package cn.ccy.leetcode.archive_2022.archive_202205;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/9 0009
 * @description https://leetcode.cn/problems/di-string-match/
 * 经典我是SB系列... 凸(艹皿艹 )...
 */
public class DiStringMatch {
    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(Arrays.toString(new DiStringMatch().diStringMatch(s)));
    }

    //贪心
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];
        int left = 0;
        int right = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = left++;

            } else {
                ans[i] = right--;
            }
        }
        ans[n] = left;
        return ans;
    }
}
