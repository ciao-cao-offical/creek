package com.ciao.leetcode.archive_202209;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/14 0014
 * @description https://leetcode.cn/problems/mean-of-array-after-removing-some-elements/
 */
public class TrimMean {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        System.out.println(new TrimMean().trimMean(arr));
    }

    //排序
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int partialSum = 0;
        for (int i = n / 20; i < 19 * n / 20; i++) {
            partialSum += arr[i];
        }
        return partialSum / (n * 0.9);
    }

    //不得不说，我的这个方法，有点蠢...哎，如答案所示，直接平分20份就好了嘛，T^T
    /*public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int gap = Double.valueOf(len * 0.05).intValue();
        double sum = 0;
        for (int i = gap; i < len - gap; i++) {
            sum += arr[i];
        }

        return sum / (len - 2 * gap);
    }*/
}
