package cn.ccy.leetcode.archive_202401;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/27 0027 17:55:00
 * @description https://leetcode.cn/problems/maximum-number-of-alloys/?envType=daily-question&envId=2024-01-27
 */
public class MaxNumberOfAlloys {
    public static void main(String[] args) {

    }

    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int left = 1, right = 200000000, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            boolean valid = false;
            for (int i = 0; i < k; ++i) {
                long spend = 0;
                for (int j = 0; j < n; ++j) {
                    spend += Math.max((long) composition.get(i).get(j) * mid - stock.get(j), 0) * cost.get(j);
                }
                if (spend <= budget) {
                    valid = true;
                    break;
                }
            }
            if (valid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
