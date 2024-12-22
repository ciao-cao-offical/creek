package cn.ccy.leetcode.archive_2022.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/17
 * @description https://leetcode.cn/problems/duplicate-zeros/
 * ☆☆☆ b2t 【双指针】
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        new DuplicateZeros().duplicateZeros(arr);
    }

    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int top = 0;
        int i = -1;
        while (top < n) {
            i++;
            if (arr[i] != 0) {
                top++;
            } else {
                top += 2;
            }
        }
        int j = n - 1;
        if (top == n + 1) {
            arr[j] = 0;
            j--;
            i--;
        }
        while (j >= 0) {
            arr[j] = arr[i];
            j--;
            if (arr[i] == 0) {
                arr[j] = arr[i];
                j--;
            }
            i--;
        }
    }
}
