package cn.ccy.leetcode._2023.archive_202309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/15 0015 01:06:56
 * @description https://leetcode.cn/problems/queens-that-can-attack-the-king/?envType=daily-question&envId=2023-09-14
 */
public class QueensAttacktheKing {
    public static void main(String[] args) {

    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        Set<Integer> queenPos = new HashSet<Integer>();
        for (int[] queen : queens) {
            int x = queen[0], y = queen[1];
            queenPos.add(x * 8 + y);
        }

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int dx = -1; dx <= 1; ++dx) {
            for (int dy = -1; dy <= 1; ++dy) {
                if (dx == 0 && dy == 0) {
                    continue;
                }
                int kx = king[0] + dx, ky = king[1] + dy;
                while (kx >= 0 && kx < 8 && ky >= 0 && ky < 8) {
                    int pos = kx * 8 + ky;
                    if (queenPos.contains(pos)) {
                        List<Integer> posList = new ArrayList<Integer>();
                        posList.add(kx);
                        posList.add(ky);
                        ans.add(posList);
                        break;
                    }
                    kx += dx;
                    ky += dy;
                }
            }
        }
        return ans;
    }
}
