package cn.ccy.leetcode._2026._01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-ways-to-paint-n-3-grid/?envType=daily-question&envId=2026-01-03">1411. 给 N x 3 网格图涂色的方案数</a>
 * @since 2026/1/3 19:09
 * ☆☆☆☆☆ 2026cvd
 */
public class NumOfWays {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;

    public int numOfWays(int n) {
        // 预处理出所有满足条件的 type
        List<Integer> types = new ArrayList<Integer>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 3; ++k) {
                    if (i != j && j != k) {
                        // 只要相邻的颜色不相同就行
                        // 将其以十进制的形式存储
                        types.add(i * 9 + j * 3 + k);
                    }
                }
            }
        }
        int typeCnt = types.size();
        // 预处理出所有可以作为相邻行的 type 对
        int[][] related = new int[typeCnt][typeCnt];
        for (int i = 0; i < typeCnt; ++i) {
            // 得到 types[i] 三个位置的颜色
            int x1 = types.get(i) / 9, x2 = types.get(i) / 3 % 3, x3 = types.get(i) % 3;
            for (int j = 0; j < typeCnt; ++j) {
                // 得到 types[j] 三个位置的颜色
                int y1 = types.get(j) / 9, y2 = types.get(j) / 3 % 3, y3 = types.get(j) % 3;
                // 对应位置不同色，才能作为相邻的行
                if (x1 != y1 && x2 != y2 && x3 != y3) {
                    related[i][j] = 1;
                }
            }
        }
        // 递推数组
        int[][] f = new int[n + 1][typeCnt];
        // 边界情况，第一行可以使用任何 type
        for (int i = 0; i < typeCnt; ++i) {
            f[1][i] = 1;
        }
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < typeCnt; ++j) {
                for (int k = 0; k < typeCnt; ++k) {
                    // f[i][j] 等于所有 f[i - 1][k] 的和
                    // 其中 k 和 j 可以作为相邻的行
                    if (related[k][j] != 0) {
                        f[i][j] += f[i - 1][k];
                        f[i][j] %= MOD;
                    }
                }
            }
        }
        // 最终所有的 f[n][...] 之和即为答案
        int ans = 0;
        for (int i = 0; i < typeCnt; ++i) {
            ans += f[n][i];
            ans %= MOD;
        }
        return ans;
    }
}
