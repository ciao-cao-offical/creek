package cn.ccy.leetcode._2026._04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-make-a-uni-value-grid/?envType=daily-question&envId=2026-04-28">2033. 获取单值网格的最小操作数</a>
 * @since 2026/4/28 00:02
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    public int minOperations(int[][] grid, int x) {
        List<Integer> nums = new ArrayList<>();
        int m = grid.length, n = grid[0].length;
        int base = grid[0][0];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if ((grid[i][j] - base) % x != 0) {
                    return -1;
                }
                nums.add(grid[i][j]);
            }
        }

        Collections.sort(nums);
        int choose = nums.get(nums.size() / 2);
        int ans = 0;
        for (int num : nums) {
            ans += Math.abs(num - choose) / x;
        }
        return ans;
    }
}
