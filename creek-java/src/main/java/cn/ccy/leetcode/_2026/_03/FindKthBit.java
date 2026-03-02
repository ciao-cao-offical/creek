package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-kth-bit-in-nth-binary-string/?envType=daily-question&envId=2026-03-03">1545. 找出第 N 个二进制字符串中的第 K 位</a>
 * @since 2026/3/3 00:48
 */
public class FindKthBit {
    public static void main(String[] args) {

    }

    public char findKthBit(int n, int k) {
        if (k == 1) {
            return '0';
        }
        int mid = 1 << (n - 1);
        if (k == mid) {
            return '1';
        } else if (k < mid) {
            return findKthBit(n - 1, k);
        } else {
            k = mid * 2 - k;
            return invert(findKthBit(n - 1, k));
        }
    }

    public char invert(char bit) {
        return (char) ('0' + '1' - bit);
    }
}
