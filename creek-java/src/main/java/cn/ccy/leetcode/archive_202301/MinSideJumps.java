package cn.ccy.leetcode.archive_202301;

import java.util.Arrays;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/21
 * @description https://leetcode.cn/problems/minimum-sideway-jumps/
 */
public class MinSideJumps {
    public static void main(String[] args) {

    }

    static final int INF = 0x3fffffff;

    //对不起了，题题，我真的好想过年，贴了一整天春联，累毕，让我们新的一年扬眉🐇气，大展宏🐇，头发不🐇！cv！
    public int minSideJumps(int[] obstacles) {
        int n = obstacles.length - 1;
        int[] d = new int[3];
        Arrays.fill(d, 1);
        d[1] = 0;
        for (int i = 1; i <= n; i++) {
            int minCnt = INF;
            for (int j = 0; j < 3; j++) {
                if (j == obstacles[i] - 1) {
                    d[j] = INF;
                } else {
                    minCnt = Math.min(minCnt, d[j]);
                }
            }
            for (int j = 0; j < 3; j++) {
                if (j == obstacles[i] - 1) {
                    continue;
                }
                d[j] = Math.min(d[j], minCnt + 1);
            }
        }
        return Math.min(Math.min(d[0], d[1]), d[2]);
    }
}
