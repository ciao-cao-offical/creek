package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/construct-uniform-parity-array-ii/?envType=daily-question&envId=2026-09-03">3876. 构造奇偶一致的数组 II</a>
 * @since 2026/9/3 00:51
 */
public class UniformArray2 {
    public static void main(String[] args) {

    }

    public boolean uniformArray(int[] nums1) {
        int mn = nums1[0];
        boolean hasOdd = false;
        for (int v : nums1) {
            if (v < mn) {
                mn = v;
            }
            if ((v & 1) == 1) {
                hasOdd = true;
            }
        }
        if ((mn & 1) == 1) {
            return true;
        }
        return !hasOdd;
    }
}
