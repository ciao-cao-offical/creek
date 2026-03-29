package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-strings-can-be-made-equal-with-operations-i/?envType=daily-question&envId=2026-03-29">2839. 判断通过操作能否让字符串相等 I</a>
 * @since 2026/3/29 20:37
 */
public class CanBeEqual {
    public static void main(String[] args) {

    }

    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        } else if (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0) && s1.charAt(1) == s2.charAt(3)
                && s1.charAt(3) == s2.charAt(1)) {
            return true;
        } else if (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2) && s1.charAt(1) == s2.charAt(3)
                && s1.charAt(3) == s2.charAt(1)) {
            return true;
        } else if (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3) && s1.charAt(0) == s2.charAt(2)
                && s1.charAt(2) == s2.charAt(0)) {
            return true;
        }
        return false;
    }
}
