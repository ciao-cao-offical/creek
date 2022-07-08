package com.ciao.leetcode.archive_202207;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/8
 * @description https://leetcode.cn/problems/minimum-cost-to-move-chips-to-the-same-position/
 */
public class MinCostToMoveChips {
    public static void main(String[] args) {
        int[] position = new int[]{2, 2, 2, 3, 3};
        System.out.println(new MinCostToMoveChips().minCostToMoveChips(position));
    }

    public int minCostToMoveChips(int[] position) {
        if (position == null || position.length == 0) {
            return 0;
        }
        int odd = 0;
        int even = 0;
        for (int i : position) {
            if ((i & 1) != 0) {
                odd++;

            } else {
                even++;
            }
        }

        return Math.min(odd, even);
    }
}
