package com.ciao.leetcode.archive_202209;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/28
 * @description https://leetcode.cn/problems/get-kth-magic-number-lcci/
 */
public class GetKthMagicNumber {
    public static void main(String[] args) {

    }

    //优先队列 参考自：https://leetcode.cn/problems/get-kth-magic-number-lcci/solution/by-ac_oier-2czm/，试试【多路归并】
    public int getKthMagicNumber(int k) {
        int[] nums = new int[]{3, 5, 7};
        PriorityQueue<Long> q = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        q.add(1L);
        set.add(1L);
        while (!q.isEmpty()) {
            long t = q.poll();
            if (--k == 0) return (int) t;
            for (int x : nums) {
                if (!set.contains(x * t)) {
                    q.add(x * t);
                    set.add(x * t);
                }
            }
        }
        return -1;
    }
}
