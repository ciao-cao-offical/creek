package cn.ccy.leetcode.archive_2023.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/26 0026 02:21:28
 * @description https://leetcode.cn/problems/pass-the-pillow/?envType=daily-question&envId=Invalid%20Date
 */
public class PassThePillow {
    public static void main(String[] args) {

    }

    public int passThePillow(int n, int time) {
        time %= (n - 1) * 2;
        return time < n ? time + 1 : n * 2 - time - 1;
    }
}
