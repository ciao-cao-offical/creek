package cn.ccy.leetcode._2023.archive_202305;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/5 0005 22:53:44
 * @description https://leetcode.cn/problems/the-employee-that-worked-on-the-longest-task/description/
 */
public class HardestWorker {
    public static void main(String[] args) {
        int n = 10;
        int[][] logs = {{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        System.out.println(new HardestWorker().hardestWorker(n, logs));
    }

    public int hardestWorker(int n, int[][] logs) {
        int id = 0;
        int max = -1;
        int preTime = 0;
        for (int[] log : logs) {
            int gap = log[1] - preTime;
            if (gap > max) {
                id = log[0];
                max = gap;

            } else if (gap == max && id > log[0]) {
                id = log[0];
            }

            preTime = log[1];
        }

        return id;
    }
}
