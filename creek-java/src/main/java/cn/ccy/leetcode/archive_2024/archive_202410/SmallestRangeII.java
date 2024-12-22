package cn.ccy.leetcode.archive_2024.archive_202410;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/21 00:02:28
 * @description https://leetcode.cn/problems/smallest-range-ii/?envType=daily-question&envId=2024-10-21
 */
public class SmallestRangeII {
    public static void main(String[] args) {

    }

    public int smallestRangeII(int[] A, int K) {
        int N = A.length;
        Arrays.sort(A);
        int ans = A[N - 1] - A[0];

        for (int i = 0; i < A.length - 1; ++i) {
            int a = A[i], b = A[i + 1];
            int high = Math.max(A[N - 1] - K, a + K);
            int low = Math.min(A[0] + K, b - K);
            ans = Math.min(ans, high - low);
        }
        return ans;
    }
}
