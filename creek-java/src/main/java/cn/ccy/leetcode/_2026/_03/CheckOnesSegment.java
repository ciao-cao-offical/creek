package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/?envType=daily-question&envId=2026-03-06">1784. 检查二进制字符串字段</a>
 * @since 2026/3/6 01:48
 */
public class CheckOnesSegment {
    public static void main(String[] args) {

    }

    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
