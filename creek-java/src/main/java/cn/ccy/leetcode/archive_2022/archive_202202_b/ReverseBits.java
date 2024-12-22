package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/29
 * @description https://leetcode-cn.com/problems/reverse-bits/
 */
public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverseBits(-3));
    }

    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
//            System.out.println(n);
        }
        return rev;
    }
}
