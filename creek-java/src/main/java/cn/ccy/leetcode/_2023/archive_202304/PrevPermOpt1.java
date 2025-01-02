package cn.ccy.leetcode._2023.archive_202304;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/3 17:47
 * @description https://leetcode.cn/problems/previous-permutation-with-one-swap/
 */
public class PrevPermOpt1 {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(Arrays.toString(new PrevPermOpt1().prevPermOpt1(arr)));
    }

    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                int j = n - 1;
                while (arr[j] >= arr[i] || arr[j] == arr[j - 1]) {
                    j--;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }
}
