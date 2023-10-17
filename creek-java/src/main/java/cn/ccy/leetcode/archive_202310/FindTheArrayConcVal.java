package cn.ccy.leetcode.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/12 21:22
 * @description https://leetcode.cn/problems/find-the-array-concatenation-value/solutions/2420231/zhao-chu-shu-zu-de-chuan-lian-zhi-by-lee-4aam/?envType=daily-question&envId=2023-10-12
 */
public class FindTheArrayConcVal {
    public static void main(String[] args) {

    }

    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            if (i != j) {
                ans += Integer.parseInt(Integer.toString(nums[i]) + Integer.toString(nums[j]));
            } else {
                ans += nums[i];
            }
        }
        return ans;
    }
}
