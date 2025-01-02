package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/30 0030
 * @description https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new MaxArea().maxArea(height));
    }

    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int cur = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(cur, max);

            if (height[left] < height[right]) {
                left++;

            } else {
                right--;
            }
        }
        return max;
    }
}
