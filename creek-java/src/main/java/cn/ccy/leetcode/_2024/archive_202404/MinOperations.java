package cn.ccy.leetcode._2024.archive_202404;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/8 00:34:31
 * @description https://leetcode.cn/problems/minimum-number-of-operations-to-make-array-continuous/?envType=daily-question&envId=2024-04-08
 * ☆☆☆☆☆ 2024cvd
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> sortedUniqueNums = new ArrayList<Integer>(set);
        Collections.sort(sortedUniqueNums);
        int res = n;
        int j = 0;
        for (int i = 0; i < sortedUniqueNums.size(); i++) {
            int left = sortedUniqueNums.get(i);
            int right = left + n - 1;
            while (j < sortedUniqueNums.size() && sortedUniqueNums.get(j) <= right) {
                res = Math.min(res, n - (j - i + 1));
                j++;
            }
        }
        return res;
    }
}
