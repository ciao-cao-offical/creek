package cn.ccy.leetcode._2025._04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-complete-subarrays-in-an-array/?envType=daily-question&envId=2025-04-24">2799. 统计完全子数组的数目</a>
 * @since 2025/4/24 22:22
 */
public class CountCompleteSubarrays {
    public static void main(String[] args) {

    }

    public int countCompleteSubarrays(int[] nums) {
        int res = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        int n = nums.length;
        int right = 0;
        int distinct = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new))).size();

        for (int left = 0; left < n; left++) {
            if (left > 0) {
                int remove = nums[left - 1];
                cnt.put(remove, cnt.get(remove) - 1);
                if (cnt.get(remove) == 0) {
                    cnt.remove(remove);
                }
            }
            while (right < n && cnt.size() < distinct) {
                int add = nums[right];
                cnt.put(add, cnt.getOrDefault(add, 0) + 1);
                right++;
            }
            if (cnt.size() == distinct) {
                res += (n - right + 1);
            }
        }
        return res;
    }
}
