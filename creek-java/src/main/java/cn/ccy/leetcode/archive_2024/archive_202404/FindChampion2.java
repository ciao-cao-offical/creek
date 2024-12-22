package cn.ccy.leetcode.archive_2024.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/13 20:16:55
 * @description https://leetcode.cn/problems/find-champion-ii/?envType=daily-question&envId=2024-04-13
 */
public class FindChampion2 {
    public static void main(String[] args) {

    }

    public int findChampion(int n, int[][] edges) {
        int[] degree = new int[n];
        for (int[] e : edges) {
            degree[e[1]]++;
        }
        int champion = -1;
        for (int i = 0; i < n; i++) {
            if (degree[i] == 0) {
                if (champion == -1) {
                    champion = i;
                } else {
                    return -1;
                }
            }
        }
        return champion;
    }
}
