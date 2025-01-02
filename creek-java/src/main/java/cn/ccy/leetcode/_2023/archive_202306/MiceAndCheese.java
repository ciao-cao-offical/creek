package cn.ccy.leetcode._2023.archive_202306;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/7 0007 22:47:58
 * @description https://leetcode.cn/problems/mice-and-cheese/
 */
public class MiceAndCheese {
    public static void main(String[] args) {
        int[] reward1 = {1, 4, 4, 6, 4};
        int[] reward2 = {6, 5, 3, 6, 1};
        int k = 1;
        System.out.println(new MiceAndCheese().miceAndCheese(reward1, reward2, k));
    }

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int ans = 0;
        int n = reward1.length;
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            ans += reward2[i];
            diffs[i] = reward1[i] - reward2[i];
        }
        Arrays.sort(diffs);
        for (int i = 1; i <= k; i++) {
            ans += diffs[n - i];
        }
        return ans;
    }
}
