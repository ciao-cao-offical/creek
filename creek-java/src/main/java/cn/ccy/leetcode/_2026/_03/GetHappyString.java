package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/?envType=daily-question&envId=2026-03-14">1415. 长度为 n 的开心字符串中字典序第 k 小的字符串</a>
 * @since 2026/3/14 14:54
 */
public class GetHappyString {
    public static void main(String[] args) {

    }

    public String getHappyString(int n, int k) {
        char[] chs = {'a', 'b', 'c'};
        StringBuilder res = new StringBuilder();
        if (k > 3 * (1 << (n - 1))) {
            return res.toString();
        }
        for (int i = 0; i < n; i++) {
            int count = 1 << (n - i - 1);
            for (char c : chs) {
                if (res.length() > 0 && res.charAt(res.length() - 1) == c) {
                    continue;
                }
                if (k <= count) {
                    res.append(c);
                    break;
                }
                k -= count;
            }
        }
        return res.toString();
    }
}
