package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/shortest-distance-to-target-string-in-a-circular-array/description/?envType=daily-question&envId=2026-04-15">2515. 到目标字符串的最短距离</a>
 * @since 2026/4/15 00:22
 */
public class ClosestTarget {
    public static void main(String[] args) {

    }

    public int closestTarget(String[] words, String target, int startIndex) {
        int ans = words.length;
        int n = words.length;

        for (int i = 0; i < n; ++i) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - startIndex);
                ans = Math.min(ans, Math.min(dist, n - dist));
            }
        }

        return ans < n ? ans : -1;
    }
}
