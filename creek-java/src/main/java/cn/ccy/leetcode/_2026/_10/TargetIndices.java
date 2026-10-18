package cn.ccy.leetcode._2026._10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-target-indices-after-sorting-array/description/?envType=daily-question&envId=2026-10-19">2089. 找出数组排序后的目标下标</a>
 * @since 2026/10/19 00:19
 */
public class TargetIndices {
    public static void main(String[] args) {

    }

    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }
}
