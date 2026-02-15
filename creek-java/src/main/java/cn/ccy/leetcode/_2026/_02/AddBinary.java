package cn.ccy.leetcode._2026._02;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/add-binary/?envType=daily-question&envId=2026-02-15">67. 二进制求和</a>
 * @since 2026/2/15 21:57
 */
public class AddBinary {
    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }
}
