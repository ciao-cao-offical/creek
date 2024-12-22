package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/28
 * @description https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class SortByBits {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(new SortByBits().sortByBits(arr)));
    }

    public int[] sortByBits(int[] arr) {
        if (arr == null || arr.length == 1) {
            return arr;
        }

        int n = arr.length;
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            counts[i] = getOneNum(arr[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            int ci = i;
            for (int j = 0; j < i; j++) {
                if (counts[j] < counts[ci]) {
                    continue;

                } else if (counts[j] == counts[ci] && arr[ci] >= arr[j]) {
                    continue;
                }

                ci = j;
            }

            if (ci != i) {
                int temp = arr[ci];
                arr[ci] = arr[i];
                arr[i] = temp;

                temp = counts[ci];
                counts[ci] = counts[i];
                counts[i] = temp;
            }
        }
        return arr;
    }

    private int getOneNum(int num) {
        if (num == 0) {
            return 0;
        }
        int cur = num;
        int count = 0;
        while (cur > 0) {
            cur = cur & (cur - 1);
            count++;
        }

        return count;
    }

}
