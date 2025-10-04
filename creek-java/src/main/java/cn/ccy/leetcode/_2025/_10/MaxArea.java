package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/container-with-most-water/?envType=daily-question&envId=2025-10-04">11. 盛最多水的容器</a>
 * @since 2025/10/4 22:41
 */
public class MaxArea {
    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}
