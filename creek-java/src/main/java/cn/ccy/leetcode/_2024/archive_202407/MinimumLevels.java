package cn.ccy.leetcode._2024.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/19 21:12:06
 * @description https://leetcode.cn/problems/minimum-levels-to-gain-more-points/?envType=daily-question&envId=2024-07-19
 */
public class MinimumLevels {
    public static void main(String[] args) {

    }

    public int minimumLevels(int[] possible) {
        int n = possible.length;
        int tot = 0;
        for (int x : possible) {
            tot += x == 1 ? 1 : -1;
        }
        int pre = 0;
        for (int i = 0; i < n - 1; i++) {
            pre += possible[i] == 1 ? 1 : -1;
            if (2 * pre > tot) {
                return i + 1;
            }
        }
        return -1;
    }
}
