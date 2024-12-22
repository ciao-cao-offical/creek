package cn.ccy.leetcode.archive_2024.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/6 18:27:09
 * @description https://leetcode.cn/problems/gas-station/?envType=daily-question&envId=2024-10-06
 */
public class CanCompleteCircuit {
    public static void main(String[] args) {

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n) {
            int sumOfGas = 0, sumOfCost = 0;
            int cnt = 0;
            while (cnt < n) {
                int j = (i + cnt) % n;
                sumOfGas += gas[j];
                sumOfCost += cost[j];
                if (sumOfCost > sumOfGas) {
                    break;
                }
                cnt++;
            }
            if (cnt == n) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }
}
