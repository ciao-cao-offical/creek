package cn.ccy.leetcode._2024.archive_202412;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/26 21:31:43
 * @description https://leetcode.cn/problems/existence-of-a-substring-in-a-string-and-its-reverse/?envType=daily-question&envId=2024-12-26
 */
public class IsSubstringPresent {
    public static void main(String[] args) {

    }

    public boolean isSubstringPresent(String s) {
        for (int i = 0; i + 1 < s.length(); i++) {
            String substr = new StringBuilder(s.substring(i, i + 2)).reverse().toString();
            if (s.contains(substr)) {
                return true;
            }
        }
        return false;
    }
}
