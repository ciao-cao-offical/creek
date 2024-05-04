package cn.ccy.leetcode.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/3 21:08:48
 * @description https://leetcode.cn/problems/average-salary-excluding-the-minimum-and-maximum-salary/?envType=daily-question&envId=2024-05-03
 */
public class Average {
    public static void main(String[] args) {

    }

    public double average(int[] salary) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : salary) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return (sum - min - max) / (salary.length - 2);
    }
}
