package com.ciao.leetcode.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/5 0005 22:51:54
 * @description https://leetcode.cn/problems/k-items-with-the-maximum-sum/
 */
public class KItemsWithMaximumSum {
    public static void main(String[] args) {

    }


    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        }
        if (k <= numOnes + numZeros) {
            return numOnes;
        }
        return numOnes - (k - numOnes - numZeros);
    }
}
