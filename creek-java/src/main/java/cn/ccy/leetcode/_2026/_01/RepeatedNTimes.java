package cn.ccy.leetcode._2026._01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/n-repeated-element-in-size-2n-array/?envType=daily-question&envId=2026-01-02">961. 在长度 2N 的数组中找出重复 N 次的元素</a>
 * @since 2026/1/2 22:38
 */
public class RepeatedNTimes {
    public static void main(String[] args) {

    }

    public int repeatedNTimes(int[] nums) {
        Set<Integer> found = new HashSet<Integer>();
        for (int num : nums) {
            if (!found.add(num)) {
                return num;
            }
        }
        // 不可能的情况
        return -1;
    }
}
