package cn.ccy.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/19 0019
 * @description https://leetcode.cn/problems/find-the-highest-altitude/
 */
public class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(new LargestAltitude().largestAltitude(gain));
    }

    public int largestAltitude(int[] gain) {
        int max = 0, preSum = 0;
        for (int i = 0; i < gain.length; i++) {
            preSum += gain[i];
            max = Math.max(max, preSum);
        }
        return max;
    }
}
