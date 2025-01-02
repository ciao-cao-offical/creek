package cn.ccy.leetcode._2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/20
 * @description https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/
 */
public class IsOneBitCharacter {
    public static void main(String[] args) {
        int[] bits = {1, 0, 0};
        System.out.println(new IsOneBitCharacter().isOneBitCharacter(bits));
    }

    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int i = 0;
        while (i < len - 1) {
            i += bits[i] + 1;
        }
        return i == len - 1;
    }
}
