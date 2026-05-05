package cn.ccy.leetcode._2026._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/rotating-the-box/?envType=daily-question&envId=2026-05-06">1861. 旋转盒子</a>
 * @since 2026/5/6 00:03
 */
public class RotateTheBox {
    public static void main(String[] args) {

    }

    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] ans = new char[n][m];

        for (int i = 0; i < m; i++) {
            char[] row = boxGrid[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                char ch = row[j];
                if (ch == '#') { // 石头
                    cnt++;
                    ch = '.'; // 先把石头清空
                }
                ans[j][m - 1 - i] = ch;
                if (j == n - 1 || row[j + 1] == '*') { // 下一个格子是障碍物
                    // 石头垂直掉落后，从 j 往前 cnt 个格子都是石头
                    for (int k = j; k > j - cnt; k--) {
                        ans[k][m - 1 - i] = '#';
                    }
                    cnt = 0; // 重置计数器
                }
            }
        }

        return ans;
    }
}
