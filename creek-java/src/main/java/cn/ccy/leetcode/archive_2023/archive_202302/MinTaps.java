package cn.ccy.leetcode.archive_2023.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/21
 * @description https://leetcode.cn/problems/minimum-number-of-taps-to-open-to-water-a-garden/
 * ⭐️⭐️⭐️⭐️⭐️ cvd
 */
public class MinTaps {
    public static void main(String[] args) {

    }

    //cv自：https://leetcode.cn/problems/minimum-number-of-taps-to-open-to-water-a-garden/solutions/2123855/yi-zhang-tu-miao-dong-pythonjavacgo-by-e-wqry/
    public int minTaps(int n, int[] ranges) {
        int[] rightMost = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            int r = ranges[i];
            // 这样写可以在 i>r 时少写一个 max
            // 凭借这个优化，恭喜你超越了 100% 的用户
            // 说「超越」是因为原来的最快是 2ms，现在优化后是 1ms
            if (i > r) rightMost[i - r] = i + r; // 对于 i-r 来说，i+r 必然是它目前的最大值
            else rightMost[0] = Math.max(rightMost[0], i + r);
        }

        int ans = 0;
        int curRight = 0; // 已建造的桥的右端点
        int nextRight = 0; // 下一座桥的右端点的最大值
        for (int i = 0; i < n; ++i) { // 注意这里没有遍历到 n，因为它已经是终点了
            nextRight = Math.max(nextRight, rightMost[i]);
            if (i == curRight) { // 到达已建造的桥的右端点
                if (i == nextRight) return -1; // 无论怎么造桥，都无法从 i 到 i+1
                curRight = nextRight; // 造一座桥
                ++ans;
            }
        }
        return ans;
    }
}
