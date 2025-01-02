package cn.ccy.leetcode._2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/1 22:28:44
 * @description https://leetcode.cn/problems/maximum-energy-boost-from-two-drinks/?envType=daily-question&envId=2024-11-01
 */
public class MaxEnergyBoost {
    public static void main(String[] args) {

    }

    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n = energyDrinkA.length;
        long[][] d = new long[n + 1][2];
        for (int i = 1; i <= n; i++) {
            d[i][0] = d[i - 1][0] + energyDrinkA[i - 1];
            d[i][1] = d[i - 1][1] + energyDrinkB[i - 1];
            if (i >= 2) {
                d[i][0] = Math.max(d[i][0], d[i - 2][1] + energyDrinkA[i - 1]);
                d[i][1] = Math.max(d[i][1], d[i - 2][0] + energyDrinkB[i - 1]);
            }
        }
        return Math.max(d[n][0], d[n][1]);
    }
}
