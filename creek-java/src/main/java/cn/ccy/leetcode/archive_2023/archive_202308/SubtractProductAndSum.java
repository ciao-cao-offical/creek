package cn.ccy.leetcode.archive_2023.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/9 0009 01:29:04
 * @description https://leetcode.cn/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(new SubtractProductAndSum().subtractProductAndSum(n));
    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        long multi = 1;
        while (n != 0) {
            int i = n % 10;
            sum += i;
            multi *= i;
            n /= 10;
        }
        return (int) (multi - sum);
    }
}
