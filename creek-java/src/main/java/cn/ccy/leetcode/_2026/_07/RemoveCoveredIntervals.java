package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/remove-covered-intervals/?envType=daily-question&envId=2026-07-06">1288. 删除被覆盖区间</a>
 * @since 2026/7/6 00:39
 */
public class RemoveCoveredIntervals {
    public static void main(String[] args) {

    }

    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int ans = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
