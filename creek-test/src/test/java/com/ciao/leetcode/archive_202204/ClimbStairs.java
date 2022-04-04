package com.ciao.leetcode.archive_202204;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/1
 * @description https://leetcode-cn.com/problems/climbing-stairs/
 * 试一试【动态规划：滚动数组思想】，【矩阵快速幂】，【通项公式】
 */
public class ClimbStairs {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>() {{
        put(1, 1);
        put(2, 2);
    }};

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(3));
    }

    //滚动数组
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
    /*public int climbStairs(int n) {
        Integer way = map.get(n);
        if (way != null) {
            return way;
        }

        way = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, way);

        return way;
    }*/
}

