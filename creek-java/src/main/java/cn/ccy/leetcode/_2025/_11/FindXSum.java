package cn.ccy.leetcode._2025._11;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-x-sum-of-all-k-long-subarrays-i/?envType=daily-question&envId=2025-11-04">3318. 计算子数组的 x-sum I</a>
 * @since 2025/11/4 00:11
 * ☆☆☆ 2025cvd
 */
public class FindXSum {
    public static void main(String[] args) {

    }

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length - k + 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int right = i + k - 1;
            int[][] map = new int[51][2];
            int cnt = 0;
            for (int j = i; j <= right; j++) {
                cnt = map[nums[j]][1] == 0 ? cnt + 1 : cnt;
                map[nums[j]][0] = nums[j];
                map[nums[j]][1] += 1;
            }
            int temp = Math.min(cnt, x);
            Arrays.sort(map, (int[] a, int[] b) -> a[1] < b[1] || (a[1] == b[1] && a[0] < b[0]) ? 1 : -1);
            int sum = 0;
            for (int m = 0; m < map.length && temp > 0; m++) {
                if (map[m][1] > 0) {
                    temp--;
                    sum += (map[m][0] * map[m][1]);
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
