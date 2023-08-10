package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/11
 * @description https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {
    public static void main(String[] args) {
        System.out.println(new MaxArea().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int ans = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int cur = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, cur);

            if (height[l] < height[r]) {
                l++;

            } else {
                r--;
            }
        }

        return ans;
    }
}
