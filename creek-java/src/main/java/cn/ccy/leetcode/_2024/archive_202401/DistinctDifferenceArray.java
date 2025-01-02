package cn.ccy.leetcode._2024.archive_202401;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/31 0031 21:02:25
 * @description https://leetcode.cn/problems/find-the-distinct-difference-array/?envType=daily-question&envId=2024-01-31
 */
public class DistinctDifferenceArray {
    public static void main(String[] args) {

    }

    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<Integer>();
        int[] sufCnt = new int[n + 1];
        for (int i = n - 1; i > 0; i--) {
            set.add(nums[i]);
            sufCnt[i] = set.size();
        }
        int[] res = new int[n];
        set.clear();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            res[i] = set.size() - sufCnt[i + 1];
        }
        return res;
    }
}
