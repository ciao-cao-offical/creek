package com.ciao.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/4
 * @description https://leetcode.cn/problems/reach-a-number/
 */
public class ReachNumber {
    public static void main(String[] args) {
        int target = 2;
        System.out.println(new ReachNumber().reachNumber(target));
    }

    //【数学】，看一下优化算法：https://leetcode.cn/problems/reach-a-number/solutions/1947254/fen-lei-tao-lun-xiang-xi-zheng-ming-jian-sqj2/
    public int reachNumber(int target) {
        if (target < 0) {
            target = -target;
        }

        int step = 0;
        int sum = 0;
        while (sum < target || ((target - sum) & 1) == 1) {
            step++;
            sum += step;
        }
        return step;
    }
}
