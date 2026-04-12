package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-distance-to-the-target-element/?envType=daily-question&envId=2026-04-13">1848. 到目标元素的最小距离</a>
 * @since 2026/4/13 00:00
 */
public class GetMinDistance {
    public static void main(String[] args) {

    }

    public int getMinDistance(int[] nums, int target, int start) {
        if (nums[start] == target) {
            return 0;
        }
        int minDistance = Integer.MAX_VALUE;
        boolean leftFound = false, rightFound = false;
        int length = nums.length;
        for (int i = start - 1; i >= 0 && !leftFound; i--) {
            if (nums[i] == target) {
                minDistance = Math.min(minDistance, start - i);
                leftFound = true;
            }
        }
        for (int i = start + 1; i < length && i - start < minDistance && !rightFound; i++) {
            if (nums[i] == target) {
                minDistance = Math.min(minDistance, i - start);
                rightFound = true;
            }
        }
        return minDistance;
    }
}
