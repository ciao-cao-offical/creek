package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/make-array-elements-equal-to-zero/?envType=daily-question&envId=2025-10-28">3354. 使数组元素等于零</a>
 * @since 2025/10/28 01:16
 */
public class CountValidSelections {
    public static void main(String[] args) {

    }

    public int countValidSelections(int[] nums) {
        int count = 0, nonZeros = 0, n = nums.length;
        for (int x : nums)
            if (x > 0) {
                nonZeros++;
            }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (isValid(nums, nonZeros, i, -1)) {
                    count++;
                }
                if (isValid(nums, nonZeros, i, 1)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isValid(int[] nums, int nonZeros, int start, int direction) {
        int n = nums.length, curr = start;
        int[] temp = nums.clone();
        while (nonZeros > 0 && curr >= 0 && curr < n) {
            if (temp[curr] > 0) {
                temp[curr]--;
                direction *= -1;
                if (temp[curr] == 0) {
                    nonZeros--;
                }
            }
            curr += direction;
        }
        return nonZeros == 0;
    }
}
