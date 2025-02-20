package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/20 23:30
 * @description/link https://leetcode.cn/problems/number-of-even-and-odd-bits/?envType=daily-question&envId=2025-02-20
 */
public class EvenOddBit {
    public static void main(String[] args) {

    }

    public int[] evenOddBit(int n) {
        int[] res = new int[2];
        int i = 0;
        while (n > 0) {
            res[i] += n & 1;
            n >>= 1;
            i ^= 1;
        }
        return res;
    }

    /*
    public int[] evenOddBit(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        String s = sb.toString();
        char[] cs = s.toCharArray();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '1') {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        return new int[]{even, odd};
    }
    */
}
