package cn.ccy.leetcode.archive_202402;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/28 0028 23:03:34
 * @description https://leetcode.cn/problems/make-costs-of-paths-equal-in-a-binary-tree/?envType=daily-question&envId=2024-02-28
 */
public class MinIncrements {
    public static void main(String[] args) {

    }

    public int minIncrements(int n, int[] cost) {
        int ans = 0;
        for (int i = n - 2; i > 0; i -= 2) {
            ans += Math.abs(cost[i] - cost[i + 1]);
            // 叶节点 i 和 i+1 的双亲节点下标为 i/2（整数除法）
            cost[i / 2] += Math.max(cost[i], cost[i + 1]);
        }
        return ans;
    }
}
