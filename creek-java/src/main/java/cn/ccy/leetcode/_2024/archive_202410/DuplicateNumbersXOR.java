package cn.ccy.leetcode._2024.archive_202410;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/12 00:27:39
 * @description https://leetcode.cn/problems/find-the-xor-of-numbers-which-appear-twice/?envType=daily-question&envId=2024-10-12
 */
public class DuplicateNumbersXOR {
    public static void main(String[] args) {

    }

    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> cnt = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            if (cnt.contains(num)) {
                res ^= num;
            } else {
                cnt.add(num);
            }
        }
        return res;
    }
}
