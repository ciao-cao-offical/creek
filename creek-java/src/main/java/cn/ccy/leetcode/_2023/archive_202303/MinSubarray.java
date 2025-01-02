package cn.ccy.leetcode._2023.archive_202303;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/10
 * @description https://leetcode.cn/problems/make-sum-divisible-by-p/
 */
public class MinSubarray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int p = 3;
        System.out.println(new MinSubarray().minSubarray(nums, p));
    }

    //cvd，【前缀和】+什么叫【同余】：https://leetcode.cn/problems/make-sum-divisible-by-p/solutions/2158435/tao-lu-qian-zhui-he-ha-xi-biao-pythonjav-rzl0/
    public int minSubarray(int[] nums, int p) {
        long t = 0;
        for (int v : nums) t += v;
        int x = (int) (t % p);
        if (x == 0) return 0; // 移除空子数组（这行可以不要）

        int n = nums.length, ans = n, s = 0;
        Map<Integer, Integer> last = new HashMap<>(); // 注：填入 n+1 可以加速
        last.put(s, -1); // 由于下面 i 是从 0 开始的，前缀和下标就要从 -1 开始了
        for (int i = 0; i < n; ++i) {
            s = (s + nums[i]) % p;
            last.put(s, i);
            // 如果不存在，-n 可以保证 i-j >= n
            int j = last.getOrDefault((s - x + p) % p, -n);
            ans = Math.min(ans, i - j);
        }
        return ans < n ? ans : -1;
    }
}
