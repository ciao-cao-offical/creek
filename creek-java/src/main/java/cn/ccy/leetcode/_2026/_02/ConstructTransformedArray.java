package cn.ccy.leetcode._2026._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/transformed-array/?envType=daily-question&envId=2026-02-05">3379. 转换数组</a>
 * @since 2026/2/5 00:15
 */
public class ConstructTransformedArray {
    public static void main(String[] args) {

    }

    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[((i + nums[i]) % n + n) % n];
        }
        return res;
    }
}
