package cn.ccy.leetcode._2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/14
 * @description https://leetcode-cn.com/problems/richest-customer-wealth/
 */
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(new MaximumWealth().maximumWealth(accounts));
    }

    //暴力
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int a : ints) {
                sum += a;
            }
            max = Math.max(sum, max);
        }

        return max;
    }
}
