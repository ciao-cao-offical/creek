package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/23
 * @description https://leetcode-cn.com/problems/richest-customer-wealth/
 */
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(new MaximumWealth().maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        if (accounts == null) {
            return 0;
        }

        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j : account) {
                sum += j;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
