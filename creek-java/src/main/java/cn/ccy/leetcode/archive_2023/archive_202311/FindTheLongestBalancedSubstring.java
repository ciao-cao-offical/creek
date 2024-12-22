package cn.ccy.leetcode.archive_2023.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/8 0008 01:07:59
 * @description https://leetcode.cn/problems/find-the-longest-balanced-substring-of-a-binary-string/?envType=daily-question&envId=2023-11-08
 */
public class FindTheLongestBalancedSubstring {
    public static void main(String[] args) {

    }

    public int findTheLongestBalancedSubstring(String S) {
        char[] s = S.toCharArray(); // 不想产生额外空间的话下面可以用 charAt
        int ans = 0, pre = 0, cur = 0, n = s.length;
        for (int i = 0; i < n; i++) {
            cur++;
            if (i == s.length - 1 || s[i] != s[i + 1]) { // i 是连续相同段的末尾
                if (s[i] == '1') {
                    ans = Math.max(ans, Math.min(pre, cur) * 2);
                }
                pre = cur;
                cur = 0;
            }
        }
        return ans;
    }
}
