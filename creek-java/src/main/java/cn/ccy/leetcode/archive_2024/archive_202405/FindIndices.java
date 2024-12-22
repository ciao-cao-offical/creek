package cn.ccy.leetcode.archive_2024.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/25 21:30:19
 * @description https://leetcode.cn/problems/find-indices-with-index-and-value-difference-i/?envType=daily-question&envId=2024-05-25
 */
public class FindIndices {
    public static void main(String[] args) {

    }

    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] res = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
