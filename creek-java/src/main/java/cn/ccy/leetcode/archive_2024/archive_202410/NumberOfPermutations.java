package cn.ccy.leetcode.archive_2024.archive_202410;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/17 01:17:51
 * @description https://leetcode.cn/problems/count-the-number-of-inversions/?envType=daily-question&envId=2024-10-17
 * ☆☆☆☆☆ 2024cvd
 */
public class NumberOfPermutations {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;
    Map<Integer, Integer> reqMap = new HashMap<Integer, Integer>();
    int[][] dp;

    public int numberOfPermutations(int n, int[][] requirements) {
        int maxCnt = 0;
        reqMap.put(0, 0);
        for (int[] req : requirements) {
            reqMap.put(req[0], req[1]);
            maxCnt = Math.max(maxCnt, req[1]);
        }
        if (reqMap.get(0) != 0) {
            return 0;
        }

        dp = new int[n][maxCnt + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return dfs(n - 1, reqMap.get(n - 1));
    }

    public int dfs(int end, int cnt) {
        if (end == 0) {
            return 1;
        }
        if (dp[end][cnt] != -1) {
            return dp[end][cnt];
        }
        if (reqMap.containsKey(end - 1)) {
            int r = reqMap.get(end - 1);
            if (r <= cnt && cnt <= end + r) {
                return dp[end][cnt] = dfs(end - 1, r);
            } else {
                return dp[end][cnt] = 0;
            }
        } else {
            int sm = 0;
            for (int i = 0; i <= Math.min(end, cnt); ++i) {
                sm = (sm + dfs(end - 1, cnt - i)) % MOD;
            }
            return dp[end][cnt] = sm;
        }
    }
}
