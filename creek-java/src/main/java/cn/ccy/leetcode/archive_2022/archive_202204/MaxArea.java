package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/28 0028
 * @description https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new MaxArea().maxArea(height));
    }

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int cur = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, cur);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return max;
    }
}
