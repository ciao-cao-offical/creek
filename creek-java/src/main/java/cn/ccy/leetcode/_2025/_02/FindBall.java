package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/15 20:33
 * @description/link https://leetcode.cn/problems/where-will-the-ball-fall/?envType=daily-question&envId=2025-02-15
 */
public class FindBall {
    public static void main(String[] args) {

    }

    public int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int j = 0; j < n; j++) {
            int col = j;  // 球的初始列
            for (int[] row : grid) {
                int dir = row[col];
                col += dir;  // 移动球
                if (col < 0 || col == n || row[col] != dir) {  // 到达侧边或 V 形
                    col = -1;
                    break;
                }
            }
            ans[j] = col;  // col >= 0 为成功到达底部
        }
        return ans;
    }
}
