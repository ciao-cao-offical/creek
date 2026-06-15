package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/process-string-with-special-operations-i/?envType=daily-question&envId=2026-06-16">3612. 用特殊操作处理字符串 I</a>
 * @since 2026/6/16 00:24
 */
public class ProcessStr {
    public static void main(String[] args) {

    }

    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (result.length() > 0) result.deleteCharAt(result.length() - 1);
            } else if (ch == '#') {
                result.append(result.toString());
            } else if (ch == '%') {
                result.reverse();
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
