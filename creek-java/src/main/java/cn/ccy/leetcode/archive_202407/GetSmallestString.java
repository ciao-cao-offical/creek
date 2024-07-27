package cn.ccy.leetcode.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/27 15:31:09
 * @description https://leetcode.cn/problems/lexicographically-smallest-string-after-operations-with-constraint/?envType=daily-question&envId=2024-07-27
 */
public class GetSmallestString {
    public static void main(String[] args) {

    }

    public String getSmallestString(String s, int k) {
        char[] ans = s.toCharArray();
        for (int i = 0; i < s.length(); ++i) {
            int dis = Math.min(s.charAt(i) - 'a', 'z' - s.charAt(i) + 1);
            if (dis <= k) {
                ans[i] = 'a';
                k -= dis;
            } else {
                ans[i] -= k;
                break;
            }
        }
        return new String(ans);
    }
}
