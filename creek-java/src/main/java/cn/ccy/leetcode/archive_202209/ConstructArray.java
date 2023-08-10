package cn.ccy.leetcode.archive_202209;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/8
 * @description https://leetcode.cn/problems/beautiful-arrangement-ii/
 */
public class ConstructArray {
    public static void main(String[] args) {
        int n = 3, k = 1;
        System.out.println(Arrays.toString(new ConstructArray().constructArray(n, k)));
    }

    public int[] constructArray(int n, int k) {
        int[] answer = new int[n];
        int idx = 0;
        for (int i = 1; i < n - k; ++i) {
            answer[idx] = i;
            ++idx;
        }
        for (int i = n - k, j = n; i <= j; ++i, --j) {
            answer[idx] = i;
            ++idx;
            if (i != j) {
                answer[idx] = j;
                ++idx;
            }
        }
        return answer;
    }
}
