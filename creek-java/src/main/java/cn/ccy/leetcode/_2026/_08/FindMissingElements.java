package cn.ccy.leetcode._2026._08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-missing-elements/?envType=daily-question&envId=2026-08-04">3731. 找出缺失的元素</a>
 * @since 2026/8/4 01:00
 */
public class FindMissingElements {
    public static void main(String[] args) {

    }

    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                ans.add(j);
            }
        }

        return ans;
    }
}
