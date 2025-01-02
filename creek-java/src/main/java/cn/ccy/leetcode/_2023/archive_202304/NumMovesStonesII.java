package cn.ccy.leetcode._2023.archive_202304;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/7 0007 22:50:27
 * @description https://leetcode.cn/problems/moving-stones-until-consecutive-ii/solutions/
 */
public class NumMovesStonesII {
    public static void main(String[] args) {

    }

    // 灵神yyds，参考自：https://leetcode.cn/problems/moving-stones-until-consecutive-ii/solutions/2212638/tu-jie-xia-tiao-qi-pythonjavacgo-by-endl-r1eb/
    public int[] numMovesStonesII(int[] stones) {
        Arrays.sort(stones);
        int n = stones.length;
        int leftMax = stones[n - 2] - stones[0] - 1 - (n - 3);
        int rightMax = stones[n - 1] - stones[1] - 1 - (n - 3);

        int max = Math.max(leftMax, rightMax);
        if (leftMax == 0 || rightMax == 0) {
            return new int[]{Math.min(2, max), max};
        }

        int maxCount = 0, left = 0;
        for (int right = 0; right < n; right++) {
            while (stones[right] - stones[left] - 1 > n) {
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        return new int[]{n - maxCount, max};
    }
}
