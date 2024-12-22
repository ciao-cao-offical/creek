package cn.ccy.leetcode.archive_2023.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/5 0005 23:38:00
 * @description https://leetcode.cn/problems/maximum-profit-of-operating-a-centennial-wheel/description/
 */
public class MinOperationsMaxProfit {
    public static void main(String[] args) {

    }

    //模拟 这个官解看的我甚是迷糊...https://leetcode.cn/problems/maximum-profit-of-operating-a-centennial-wheel/solutions/2147029/jing-ying-mo-tian-lun-de-zui-da-li-run-b-4mdh/
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int ans = -1;
        int maxProfit = 0;
        int totalProfit = 0;
        int operations = 0;
        int customersCount = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            operations++;
            customersCount += customers[i];
            int curCustomers = Math.min(customersCount, 4);
            customersCount -= curCustomers;
            totalProfit += boardingCost * curCustomers - runningCost;
            if (totalProfit > maxProfit) {
                maxProfit = totalProfit;
                ans = operations;
            }
        }
        if (customersCount == 0) {
            return ans;
        }
        int profitEachTime = boardingCost * 4 - runningCost;
        if (profitEachTime <= 0) {
            return ans;
        }
        if (customersCount > 0) {
            int fullTimes = customersCount / 4;
            totalProfit += profitEachTime * fullTimes;
            operations += fullTimes;
            if (totalProfit > maxProfit) {
                maxProfit = totalProfit;
                ans = operations;
            }
            int remainingCustomers = customersCount % 4;
            int remainingProfit = boardingCost * remainingCustomers - runningCost;
            totalProfit += remainingProfit;
            if (totalProfit > maxProfit) {
                maxProfit = totalProfit;
                operations++;
                ans++;
            }
        }
        return ans;
    }
}
