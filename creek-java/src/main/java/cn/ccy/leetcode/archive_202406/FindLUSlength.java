package cn.ccy.leetcode.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/16 20:31:11
 * @description https://leetcode.cn/problems/longest-uncommon-subsequence-i/?envType=daily-question&envId=2024-06-16
 */
public class FindLUSlength {
    public static void main(String[] args) {

    }

    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}
