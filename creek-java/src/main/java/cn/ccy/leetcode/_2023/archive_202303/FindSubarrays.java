package cn.ccy.leetcode._2023.archive_202303;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/26 0026 22:15:51
 * @description https://leetcode.cn/problems/find-subarrays-with-equal-sum/
 */
public class FindSubarrays {
    public static void main(String[] args) {

    }

    public boolean findSubarrays(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (!set.add(sum)) {
                return true;
            }
        }
        return false;
    }
}
