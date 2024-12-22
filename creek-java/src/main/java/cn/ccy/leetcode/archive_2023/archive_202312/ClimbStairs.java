package cn.ccy.leetcode.archive_2023.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/10 0010 19:30:07
 * @description https://leetcode.cn/problems/climbing-stairs/?envType=daily-question&envId=2023-12-10
 */
public class ClimbStairs {
    public static void main(String[] args) {

    }

    // 滚动数组
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int p, q = 0, r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
