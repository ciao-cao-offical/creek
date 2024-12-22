package cn.ccy.leetcode.archive_2022.archive_202210;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/28 0028
 * @description https://leetcode.cn/problems/sum-of-subarray-minimums/
 */
public class SumSubarrayMins {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(new SumSubarrayMins().sumSubarrayMins(arr));
    }

    int MOD = (int) 1e9 + 7;

    //【单调栈 + 数学】，from：https://leetcode.cn/problems/sum-of-subarray-minimums/solution/by-ac_oier-w2ya/，还有一种优化解法
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length, ans = 0;
        int[] l = new int[n], r = new int[n];
        Arrays.fill(l, -1);
        Arrays.fill(r, n);
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!d.isEmpty() && arr[d.peekLast()] >= arr[i]) r[d.pollLast()] = i;
            d.addLast(i);
        }
        d.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!d.isEmpty() && arr[d.peekLast()] > arr[i]) l[d.pollLast()] = i;
            d.addLast(i);
        }
        for (int i = 0; i < n; i++) {
            int a = i - l[i], b = r[i] - i;
            ans += a * 1L * b % MOD * arr[i] % MOD;
            ans %= MOD;
        }
        return ans;
    }

}
