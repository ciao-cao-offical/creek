package cn.ccy.leetcode.archive_202206;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/16 0016
 * @description https://leetcode.cn/problems/k-diff-pairs-in-an-array/submissions/
 * cvd 玩嗨了...
 */
public class FindPairs {
    public static void main(String[] args) {

    }

    public int findPairs(int[] nums, int k) {
        Set<Integer> visited = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        for (int num : nums) {
            if (visited.contains(num - k)) {
                res.add(num - k);
            }
            if (visited.contains(num + k)) {
                res.add(num);
            }
            visited.add(num);
        }
        return res.size();
    }
}
