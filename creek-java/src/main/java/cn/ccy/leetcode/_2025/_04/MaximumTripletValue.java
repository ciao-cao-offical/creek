package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-value-of-an-ordered-triplet-i/?envType=daily-question&envId=2025-04-02">2873. 有序三元组中的最大值 I</a>
 * @since 2025/4/2 23:50
 */
public class MaximumTripletValue {
    public static void main(String[] args) {

    }

    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    res = Math.max(res, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return res;
    }
}
