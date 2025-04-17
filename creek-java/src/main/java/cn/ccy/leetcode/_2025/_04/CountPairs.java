package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-equal-and-divisible-pairs-in-an-array/?envType=daily-question&envId=2025-04-17">2176. 统计数组中相等且可以被整除的数对</a>
 * @since 2025/4/17 22:57
 */
public class CountPairs {
    public static void main(String[] args) {

    }

    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
