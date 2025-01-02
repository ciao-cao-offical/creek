package cn.ccy.leetcode._2022.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/27 0027
 * @description https://leetcode.cn/problems/longest-uncommon-subsequence-ii/
 */
public class FindLUSlength {
    public static void main(String[] args) {
        String[] strs = {"aaa", "aaa", "aa"};
        System.out.println(new FindLUSlength().findLUSlength(strs));
    }

    public int findLUSlength(String[] strs) {
        int ans = -1;
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            boolean check = true;
            for (int j = 0; j < n; j++) {
                if (i != j && isSubSeq(strs[i], strs[j])) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ans = Math.max(ans, strs[i].length());
            }
        }
        return ans;
    }

    private boolean isSubSeq(String s, String t) {
        int si = 0;
        int ti = 0;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
            }

            ti++;
        }
        return si == s.length();
    }
}
