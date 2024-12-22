package cn.ccy.leetcode.archive_2024.archive_202412;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/13 00:12:16
 * @description https://leetcode.cn/problems/final-array-state-after-k-multiplication-operations-i/?envType=daily-question&envId=2024-12-13
 */
public class GetFinalState {
    public static void main(String[] args) {

    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int m = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[m]) {
                    m = j;
                }
            }
            nums[m] *= multiplier;
        }
        return nums;
    }
}
