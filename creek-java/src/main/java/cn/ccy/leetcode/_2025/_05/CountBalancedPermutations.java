package cn.ccy.leetcode._2025._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-number-of-balanced-permutations/?envType=daily-question&envId=2025-05-09">3343. 统计平衡排列的数目</a>
 * @since 2025/5/9 23:33
 * ★★★★★ 2025cvd
 */
public class CountBalancedPermutations {
    public static void main(String[] args) {

    }

    private static final long MOD = 1_000_000_007;
    private long[][][] memo;
    private int[] cnt;
    private int[] psum;
    private int target;
    private long[][] comb;

    public int countBalancedPermutations(String num) {
        int tot = 0, n = num.length();
        cnt = new int[10];
        for (char ch : num.toCharArray()) {
            int d = ch - '0';
            cnt[d]++;
            tot += d;
        }
        if (tot % 2 != 0) {
            return 0;
        }

        target = tot / 2;
        int maxOdd = (n + 1) / 2;

        /* 预计算组合数 */
        comb = new long[maxOdd + 1][maxOdd + 1];
        for (int i = 0; i <= maxOdd; i++) {
            comb[i][i] = comb[i][0] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % MOD;
            }
        }

        psum = new int[11];
        for (int i = 9; i >= 0; i--) {
            psum[i] = psum[i + 1] + cnt[i];
        }

        memo = new long[10][target + 1][maxOdd + 1];
        for (long[][] arr2 : memo) {
            for (long[] arr1 : arr2) {
                Arrays.fill(arr1, -1);
            }
        }

        return (int) dfs(0, 0, maxOdd);
    }

    private long dfs(int pos, int curr, int oddCnt) {
        /* 如果剩余位置无法合法填充，或者当前奇数位置元素和大于目标值 */
        if (oddCnt < 0 || psum[pos] < oddCnt || curr > target) {
            return 0;
        }
        if (pos > 9) {
            return curr == target && oddCnt == 0 ? 1 : 0;
        }
        if (memo[pos][curr][oddCnt] != -1) {
            return memo[pos][curr][oddCnt];
        }
        /* 偶数位剩余需要填充的位数 */
        int evenCnt = psum[pos] - oddCnt;
        long res = 0;
        for (int i = Math.max(0, cnt[pos] - evenCnt); i <= Math.min(cnt[pos], oddCnt); i++) {
            /* 当前数字在奇数位填充 i 位，偶数位填充 cnt[pos] - i 位 */
            long ways = comb[oddCnt][i] * comb[evenCnt][cnt[pos] - i] % MOD;
            res = (res + ways * dfs(pos + 1, curr + i * pos, oddCnt - i) % MOD) % MOD;
        }
        memo[pos][curr][oddCnt] = res;
        return res;
    }
}
