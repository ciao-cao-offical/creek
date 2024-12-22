package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/24 0024
 * @description https://leetcode-cn.com/problems/binary-gap/
 */
public class BinaryGap {
    public static void main(String[] args) {
        int n = 22;
        System.out.println(new BinaryGap().binaryGap(n));
    }

    //位运算
    public int binaryGap(int n) {
        int res = 0;
        int count = -1, s = -1, e = -1;
        while (n != 0) {
            count++;
            if ((n & 1) == 1) {
                e = count;
            }
            if (s != -1) {
                res = Math.max(res, e - s);
            }
            s = e;
            n >>= 1;
        }

        return res;
    }
}
