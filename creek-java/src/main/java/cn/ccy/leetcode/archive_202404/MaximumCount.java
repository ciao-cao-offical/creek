package cn.ccy.leetcode.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/9 23:46:12
 * @description https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/?envType=daily-question&envId=2024-04-09
 */
public class MaximumCount {
    public static void main(String[] args) {

    }

    public int maximumCount(int[] nums) {
        int pos = 0, neg = 0;
        for (int num : nums) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}
