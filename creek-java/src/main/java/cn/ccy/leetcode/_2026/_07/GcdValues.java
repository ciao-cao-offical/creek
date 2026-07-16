package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/sorted-gcd-pair-queries/?envType=daily-question&envId=2026-07-17">查询排序后的最大公约数</a>
 * @since 2026/7/17 01:36
 */
public class GcdValues {
    public static void main(String[] args) {

    }

    public int[] gcdValues(int[] nums, long[] queries) {
        int m = 0;
        for (int num : nums) {
            m = Math.max(m, num);
        }
        long[] cnt = new long[m + 1];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = i * 2; j <= m; j += i) {
                cnt[i] += cnt[j];
            }
        }
        for (int i = 1; i <= m; i++) {
            cnt[i] = cnt[i] * (cnt[i] - 1) / 2;
        }
        for (int i = m; i >= 1; i--) {
            for (int j = i * 2; j <= m; j += i) {
                cnt[i] -= cnt[j];
            }
        }
        for (int i = 1; i <= m; i++) {
            cnt[i] += cnt[i - 1];
        }
        int[] ans = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            long q = queries[k] + 1;
            int left = 1, right = m;
            while (left < right) {
                int mid = (left + right) / 2;
                if (cnt[mid] >= q) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            ans[k] = left;
        }
        return ans;
    }
}
