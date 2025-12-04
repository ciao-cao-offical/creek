package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-partitions-with-even-sum-difference/?envType=daily-question&envId=2025-12-05">3432. 统计元素和差值为偶数的分区方案</a>
 * @since 2025/12/5 01:03
 */
public class CountPartitions {
    public static void main(String[] args) {

    }

    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }
        return totalSum % 2 == 0 ? nums.length - 1 : 0;
    }
}
