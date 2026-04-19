package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/two-furthest-houses-with-different-colors/description/?envType=daily-question&envId=2026-04-20">2078. 两栋颜色不同且距离最远的房子</a>
 * @since 2026/4/20 00:07
 */
public class MaxDistance2 {
    public static void main(String[] args) {

    }
    
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int res = 0;   // 两栋颜色不同房子的最远距离
        // 遍历两栋房子下标并维护最远距离
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (colors[i] != colors[j]) {
                    res = Math.max(res, j - i);
                }
            }
        }
        return res;
    }
}
