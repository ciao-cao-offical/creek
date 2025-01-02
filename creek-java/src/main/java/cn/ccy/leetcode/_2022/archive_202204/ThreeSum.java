package cn.ccy.leetcode._2022.archive_202204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/16 0016
 * @description https://leetcode-cn.com/problems/3sum/
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeSum().threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return ans;
        }
        //数组排序
        Arrays.sort(nums);

        for (int first = 0; first < len; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int target = -nums[first];
            int third = len - 1;
            for (int second = first + 1; second < len; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }

                if (third == second) {
                    break;
                }

                if (nums[second] + nums[third] == target) {
                    List<Integer> part = new ArrayList<>();
                    part.add(nums[first]);
                    part.add(nums[second]);
                    part.add(nums[third]);
                    ans.add(part);
                }
            }
        }
        return ans;
    }
}
