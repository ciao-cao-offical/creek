package cn.ccy.leetcode.archive_2023.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/24 18:06
 * @description https://leetcode.cn/problems/last-substring-in-lexicographical-order/
 * ⭐️⭐️⭐️⭐️⭐️ cvd，又是值班+赶PPT的一天T^T...争取明天就可以正常做题了吧...加油！！！
 */
public class LastSubstring {
    public static void main(String[] args) {

    }

    public String lastSubstring(String s) {
        int i = 0, j = 1, n = s.length();
        while (j < n) {
            int k = 0;
            while (j + k < n && s.charAt(i + k) == s.charAt(j + k)) {
                k++;
            }
            if (j + k < n && s.charAt(i + k) < s.charAt(j + k)) {
                int t = i;
                i = j;
                j = Math.max(j + 1, t + k + 1);
            } else {
                j = j + k + 1;
            }
        }
        return s.substring(i);
    }
}
