package cn.ccy.leetcode.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/4 0004 22:48:16
 * @description https://leetcode.cn/problems/triples-with-bitwise-and-equal-to-zero/
 * ☆☆☆☆☆
 */
public class CountTriplets {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3};
        System.out.println(new CountTriplets().countTriplets(nums));
    }

    //CVD，https://leetcode.cn/problems/triples-with-bitwise-and-equal-to-zero/solutions/2145654/you-ji-qiao-de-mei-ju-chang-shu-you-hua-daxit/
    public int countTriplets(int[] nums) {
        int u = 1;
        for (int x : nums)
            while (u <= x)
                u <<= 1;
        int[] cnt = new int[u];
        cnt[0] = nums.length; // 直接统计空集
        for (int m : nums) {
            m ^= u - 1;
            for (int s = m; s > 0; s = (s - 1) & m) // 枚举 m 的非空子集
                ++cnt[s];
        }
        int ans = 0;
        for (int x : nums)
            for (int y : nums)
                ans += cnt[x & y];
        return ans;
    }
}
