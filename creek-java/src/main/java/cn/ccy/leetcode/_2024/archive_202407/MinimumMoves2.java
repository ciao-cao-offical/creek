package cn.ccy.leetcode._2024.archive_202407;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/20 12:37:00
 * @description https://leetcode.cn/problems/minimum-moves-to-spread-stones-over-grid/?envType=daily-question&envId=2024-07-20
 * ☆☆☆ 2024cvd
 */
public class MinimumMoves2 {
    public static void main(String[] args) {

    }

    public int minimumMoves(int[][] grid) {
        List<int[]> more = new ArrayList<int[]>();
        List<int[]> less = new ArrayList<int[]>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (grid[i][j] > 1) {
                    for (int k = 2; k <= grid[i][j]; ++k) {
                        more.add(new int[]{i, j});
                    }
                } else if (grid[i][j] == 0) {
                    less.add(new int[]{i, j});
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        do {
            int steps = 0;
            for (int i = 0; i < more.size(); i++) {
                steps += Math.abs(less.get(i)[0] - more.get(i)[0]) + Math.abs(less.get(i)[1] - more.get(i)[1]);
            }
            ans = Math.min(ans, steps);
        } while (nextPermutation(more));
        return ans;
    }

    public boolean nextPermutation(List<int[]> more) {
        int p = -1;
        for (int i = 0; i < more.size() - 1; i++) {
            if (isLess(more.get(i), more.get(i + 1))) {
                p = i;
            }
        }
        if (p == -1) {
            return false;
        }
        int q = -1;
        for (int j = p + 1; j < more.size(); j++) {
            if (isLess(more.get(p), more.get(j))) {
                q = j;
            }
        }
        Collections.swap(more, p, q);
        int i = p + 1, j = more.size() - 1;
        while (i < j) {
            Collections.swap(more, i, j);
            i++;
            j--;
        }
        return true;
    }

    public boolean isLess(int[] pair1, int[] pair2) {
        return pair1[0] < pair2[0] || (pair1[0] == pair2[0] && pair1[1] < pair2[1]);
    }
}
