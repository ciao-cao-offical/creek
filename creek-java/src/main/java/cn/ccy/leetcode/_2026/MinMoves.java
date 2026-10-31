package cn.ccy.leetcode._2026;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-moves-to-equal-array-elements/?envType=daily-question&envId=2026-11-01">453. 最小操作次数使数组元素相等</a>
 * @since 2026/11/1 00:14
 */
public class MinMoves {
    public static void main(String[] args) {

    }

    public int minMoves(int[] nums) {
        int minNum = Arrays.stream(nums).min().getAsInt();
        int res = 0;
        for (int num : nums) {
            res += num - minNum;
        }
        return res;
    }
}
