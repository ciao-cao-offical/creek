package cn.ccy.leetcode._2022.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/31
 * @description https://leetcode-cn.com/problems/super-washing-machines/
 * ☆☆☆☆☆
 */
public class FindMinMoves {
    public static void main(String[] args) {
        int[] machines = {1, 0, 5};
        System.out.println(new FindMinMoves().findMinMoves(machines));
    }

    //贪心算法
    public int findMinMoves(int[] machines) {
        int sum = Arrays.stream(machines).sum();
        int n = machines.length;
        if (sum % n != 0) {
            return -1;
        }
        int avg = sum / n;
        int ans = 0;
        int partSum = 0;
        for (int num : machines) {
            num -= avg;
            partSum += num;
            ans = Math.max(ans, Math.max(Math.abs(partSum), num));
        }
        return ans;
    }
}
