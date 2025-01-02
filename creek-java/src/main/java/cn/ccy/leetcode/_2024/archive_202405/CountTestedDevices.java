package cn.ccy.leetcode._2024.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/10 16:04:08
 * @description https://leetcode.cn/problems/count-tested-devices-after-test-operations/?envType=daily-question&envId=2024-05-10
 */
public class CountTestedDevices {
    public static void main(String[] args) {

    }

    public int countTestedDevices(int[] batteryPercentages) {
        int n = batteryPercentages.length;
        int need = 0;
        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] > 0) {
                need++;
                for (int j = i + 1; j < n; j++) {
                    batteryPercentages[j] = Math.max(batteryPercentages[j] - 1, 0);
                }
            }
        }
        return need;
    }
}
