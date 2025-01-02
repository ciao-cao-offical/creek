package cn.ccy.leetcode._2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/6 0006 23:31:39
 * @description https://leetcode.cn/problems/find-the-k-or-of-an-array/?envType=daily-question&envId=2024-03-06
 * 题都看不懂...MD，智障一样...T^T...
 */
public class FindKOr {
    public static void main(String[] args) {

    }

    public int findKOr(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < 31; ++i) {
            int cnt = 0;
            for (int num : nums) {
                if (((num >> i) & 1) != 0) {
                    ++cnt;
                }
            }
            if (cnt >= k) {
                ans |= 1 << i;
            }
        }
        return ans;
    }
}
