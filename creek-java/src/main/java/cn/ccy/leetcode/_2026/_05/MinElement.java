package cn.ccy.leetcode._2026._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-element-after-replacement-with-digit-sum/?envType=daily-question&envId=2026-05-29">3300. 替换为数位和以后的最小元素</a>
 * @since 2026/5/29 00:25
 */
public class MinElement {
    public static void main(String[] args) {

    }

    public int minElement(int[] nums) {
        int ans = 37;
        for (int num : nums) {
            int dig = 0;
            while (num > 0) {
                dig += num % 10;
                num /= 10;
            }
            ans = Math.min(ans, dig);
        }
        return ans;
    }
}
