package cn.ccy.leetcode._2026._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/create-grid-with-exactly-one-path/?envType=daily-question&envId=2026-10-27">3963. 构造恰好一条路径的网格</a>
 * @since 2026/10/27 00:58
 */
public class CreateGrid {
    public static void main(String[] args) {

    }

    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        for (int i = 0; i < m; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < n; j++) {
                sb.append(i == 0 || j == n - 1 ? '.' : '#');
            }
            grid[i] = sb.toString();
        }
        return grid;
    }
}
