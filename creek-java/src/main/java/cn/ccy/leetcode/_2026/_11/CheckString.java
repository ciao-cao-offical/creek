package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-all-as-appears-before-all-bs/?envType=daily-question&envId=2026-11-22">2124. 检查是否所有 A 都在 B 之前</a>
 * @since 2026/11/22 01:01
 */
public class CheckString {
    public static void main(String[] args) {

    }

    public boolean checkString(String s) {
        int n = s.length();
        int lasta = -1;   // 'a' 最后一次出现的下标
        int firstb = n;   // 'b' 第一次出现的下标
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'a') {
                lasta = Math.max(lasta, i);
            } else {
                firstb = Math.min(firstb, i);
            }
        }
        return lasta < firstb;
    }
}
