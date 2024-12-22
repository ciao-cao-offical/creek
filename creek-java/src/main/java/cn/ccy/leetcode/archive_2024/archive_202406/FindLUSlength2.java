package cn.ccy.leetcode.archive_2024.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/17 00:02:25
 * @description https://leetcode.cn/problems/longest-uncommon-subsequence-ii/?envType=daily-question&envId=2024-06-17
 * ☆☆☆ 2024cvd
 */
public class FindLUSlength2 {
    public static void main(String[] args) {

    }

    public int findLUSlength(String[] strs) {
        int n = strs.length;
        int ans = -1;
        for (int i = 0; i < n; ++i) {
            boolean check = true;
            for (int j = 0; j < n; ++j) {
                if (i != j && isSubseq(strs[i], strs[j])) {
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

    public boolean isSubseq(String s, String t) {
        int ptS = 0, ptT = 0;
        while (ptS < s.length() && ptT < t.length()) {
            if (s.charAt(ptS) == t.charAt(ptT)) {
                ++ptS;
            }
            ++ptT;
        }
        return ptS == s.length();
    }
}
