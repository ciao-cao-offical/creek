package cn.ccy.leetcode._2026._10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/subarrays-distinct-element-sum-of-squares-i/?envType=daily-question&envId=2026-10-15">2913. 子数组不同元素数目的平方和 I</a>
 * @since 2026/10/15 02:10
 */
public class SumCounts {
    public static void main(String[] args) {

    }

    public int sumCounts(List<Integer> nums) {
        int n = nums.size(), res = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = i; j < n; j++) {
                s.add(nums.get(j));
                res += s.size() * s.size();
            }
        }
        return res;
    }
}
