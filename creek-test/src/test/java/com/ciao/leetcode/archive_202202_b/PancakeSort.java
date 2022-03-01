package com.ciao.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/19
 * @description https://leetcode-cn.com/problems/pancake-sorting/
 */
public class PancakeSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        System.out.println(new PancakeSort().pancakeSort(arr));
    }

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            int index = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] >= arr[index]) {
                    index = j;
                }
            }
            if (index == i) {
                continue;
            }

            reverse(arr, index);
            reverse(arr, i);

            ans.add(index + 1);
            ans.add(i + 1);
        }

        return ans;
    }

    private void reverse(int[] arr, int end) {
        for (int i = 0, j = end; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

    }

}
