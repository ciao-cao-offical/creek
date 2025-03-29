package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-cycle-in-a-graph/?envType=daily-question&envId=2025-03-29">2360. 图中的最长环</a>
 * @since 2025/3/29 18:54
 * ☆☆☆☆☆ 2024cvd
 */
public class LongestCycle {
    public static void main(String[] args) {

    }

    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] label = new int[n];
        int current_label = 0, ans = -1;
        for (int i = 0; i < n; ++i) {
            if (label[i] != 0) {
                continue;
            }
            int pos = i, start_label = current_label;
            while (pos != -1) {
                ++current_label;
                // 如果遇到了已经遍历过的节点
                if (label[pos] != 0) {
                    // 如果该节点是这一次 i 循环中遍历的，说明找到了新的环，更新答案
                    if (label[pos] > start_label) {
                        ans = Math.max(ans, current_label - label[pos]);
                    }
                    break;
                }
                label[pos] = current_label;
                pos = edges[pos];
            }
        }
        return ans;
    }
}
