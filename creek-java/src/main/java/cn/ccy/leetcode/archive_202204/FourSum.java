package cn.ccy.leetcode.archive_202204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/16 0016
 * @description https://leetcode-cn.com/problems/4sum/
 */
public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(new FourSum().fourSum(nums, target));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 4) {
            return ans;
        }
        //排序
        Arrays.sort(nums);

        for (int first = 0; first < len - 3; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            if ((long) nums[first] + nums[first + 1] + nums[first + 2] + nums[first + 3] > target) {
                break;
            }
            if ((long) nums[first] + nums[len - 3] + nums[len - 2] + nums[len - 1] < target) {
                continue;
            }

            for (int second = first + 1; second < len - 2; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                if ((long) nums[first] + nums[second] + nums[first + 2] + nums[first + 3] > target) {
                    break;
                }
                if ((long) nums[first] + nums[second] + nums[len - 2] + nums[len - 1] < target) {
                    continue;
                }

                int third = second + 1;
                int fourth = len - 1;
                while (third < fourth) {
                    int sum = nums[first] + nums[second] + nums[third] + nums[fourth];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[first], nums[second], nums[third], nums[fourth]));
                        while (third < fourth && nums[third] == nums[third + 1]) {
                            third++;
                        }
                        third++;
                        while (third < fourth && nums[fourth] == nums[fourth - 1]) {
                            fourth--;
                        }
                        fourth--;

                    } else if (sum < target) {
                        third++;

                    } else {
                        fourth--;
                    }
                }
            }
        }

        return ans;
    }
}
