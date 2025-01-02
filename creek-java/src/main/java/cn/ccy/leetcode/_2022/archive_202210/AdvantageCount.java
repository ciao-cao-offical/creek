package cn.ccy.leetcode._2022.archive_202210;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/8
 * @description https://leetcode.cn/problems/advantage-shuffle/
 */
public class AdvantageCount {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {1, 10, 4, 11};
        System.out.println(Arrays.toString(new AdvantageCount().advantageCount(nums1, nums2)));
    }

    //田忌赛马 🐂🍺 from：https://leetcode.cn/problems/advantage-shuffle/solution/tian-ji-sai-ma-by-endlesscheng-yxm6/
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        Arrays.sort(nums1);
        Integer[] ids = IntStream.range(0, n).boxed().toArray(Integer[]::new);
        Arrays.sort(ids, (i, j) -> nums2[i] - nums2[j]);
        int left = 0, right = n - 1;
        for (Integer x : nums1)
            ans[x > nums2[ids[left]] ? ids[left++] : ids[right--]] = x;
        return ans;
    }
}
