package cn.ccy.leetcode.archive_2023.archive_202303;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/16 0016 21:53:43
 * @description https://leetcode.cn/problems/count-subarrays-with-median-k/
 * ★★★★★ cvd, from https://leetcode.cn/problems/count-subarrays-with-median-k/solutions/1993439/deng-jie-zhuan-huan-pythonjavacgo-by-end-5w11/
 */
public class CountSubarrays {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 5};
        int k = 4;
        System.out.println(new CountSubarrays().countSubarrays(nums, k));
    }

    public int countSubarrays(int[] nums, int k) {
        int pos = 0, n = nums.length;
        while (nums[pos] != k) ++pos;

        Map<Integer, Integer> cnt = new HashMap<>();
        // i=pos 的时候 x 是 0，直接记到 cnt 中，这样下面不是大于 k 就是小于 k
        cnt.put(0, 1);
        for (int i = pos - 1, x = 0; i >= 0; --i) { // 从 pos-1 开始累加 x
            x += nums[i] < k ? 1 : -1;
            cnt.merge(x, 1, Integer::sum);
        }

        // i=pos 的时候 x 是 0，直接加到答案中，这样下面不是大于 k 就是小于 k
        int ans = cnt.get(0) + cnt.getOrDefault(-1, 0);
        for (int i = pos + 1, x = 0; i < n; ++i) { // 从 pos+1 开始累加 x
            x += nums[i] > k ? 1 : -1;
            ans += cnt.getOrDefault(x, 0) + cnt.getOrDefault(x - 1, 0);
        }
        return ans;
    }
}
