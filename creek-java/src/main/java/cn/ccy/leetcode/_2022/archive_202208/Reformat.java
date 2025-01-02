package cn.ccy.leetcode._2022.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/11 0011
 * @description https://leetcode.cn/problems/reformat-the-string/
 */
public class Reformat {
    public static void main(String[] args) {
        String s = "a0b1c2";
        System.out.println(new Reformat().reformat(s));
    }

    public String reformat(String s) {
        StringBuilder a = new StringBuilder(), b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a') a.append(c);
            else b.append(c);
        }
        int n = a.length(), m = b.length(), tot = n + m;
        if (Math.abs(n - m) > 1) return "";
        StringBuilder sb = new StringBuilder();
        while (sb.length() != tot) {
            if (n > m) sb.append(a.charAt(--n));
            else if (n < m) sb.append(b.charAt(--m));
            else {
                if (sb.length() != 0 && sb.charAt(sb.length() - 1) >= 'a') sb.append(b.charAt(--m));
                else sb.append(a.charAt(--n));
            }
        }
        return sb.toString();
    }
}
