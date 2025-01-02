package cn.ccy.leetcode._2023.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/15 0015 00:53:38
 * @description https://leetcode.cn/problems/WHnhjV/?envType=daily-question&envId=2023-09-15
 */
public class GiveGem {
    public static void main(String[] args) {

    }

    public int giveGem(int[] gem, int[][] operations) {
        for (int[] op : operations) {
            int gift = gem[op[0]] / 2;
            gem[op[0]] = gem[op[0]] - gift;
            gem[op[1]] += gift;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : gem) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        return max - min;
    }
}
