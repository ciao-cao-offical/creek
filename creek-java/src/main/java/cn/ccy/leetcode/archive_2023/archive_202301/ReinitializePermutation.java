package cn.ccy.leetcode.archive_2023.archive_202301;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/9 0009 22:14:44
 * @description https://leetcode.cn/problems/minimum-number-of-operations-to-reinitialize-a-permutation/
 */
public class ReinitializePermutation {
    public static void main(String[] args) {

    }

    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i;
            target[i] = i;
        }

        int step = 0;
        do {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if ((i & 1) != 0) {
                    arr[i] = perm[n / 2 + (i - 1) / 2];

                } else {
                    arr[i] = perm[i / 2];
                }
            }

            step++;
            perm = arr;
        } while (!Arrays.equals(perm, target));

        return step;
    }
}
