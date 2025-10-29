package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/?envType=daily-question&envId=2025-10-30">1526. 形成目标数组的子数组最少增加次数</a>
 * @since 2025/10/30 00:05
 * ★★★ 2025cvd
 */
public class MinNumberOperations {
    public static void main(String[] args) {

    }

    public int minNumberOperations(int[] target) {
        int n = target.length;
        int ans = target[0];
        for (int i = 1; i < n; ++i) {
            ans += Math.max(target[i] - target[i - 1], 0);
        }
        return ans;
    }
}
