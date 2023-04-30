package com.ciao.leetcode.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/30 0030 23:04:18
 * @description 简要描述当前类の作用
 */
public class NumMovesStones {
    public static void main(String[] args) {

    }

    public int[] numMovesStones(int a, int b, int c) {
        int x = Math.min(Math.min(a, b), c);
        int z = Math.max(Math.max(a, b), c);
        int y = a + b + c - x - z;

        int[] res = new int[2];
        res[0] = 2;
        if (z - y == 1 && y - x == 1) {
            res[0] = 0;
        } else if (z - y <= 2 || y - x <= 2) {
            res[0] = 1;
        }
        res[1] = z - x - 2;
        return res;
    }
}
