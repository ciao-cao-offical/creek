package cn.ccy.leetcode.archive_2024.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/30 22:45:30
 * @description https://leetcode.cn/problems/number-of-employees-who-met-the-target/?envType=daily-question&envId=2024-04-30
 */
public class NumberOfEmployeesWhoMetTarget {
    public static void main(String[] args) {

    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }

        return count;
    }
}
