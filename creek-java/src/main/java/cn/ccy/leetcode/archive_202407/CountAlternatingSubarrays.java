package cn.ccy.leetcode.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/6 10:47:52
 * @description https://leetcode.cn/problems/count-alternating-subarrays/?envType=daily-question&envId=2024-07-06
 */
public class CountAlternatingSubarrays {
    public static void main(String[] args) {

    }

    public long countAlternatingSubarrays(int[] nums) {
        long res = 0, cur = 0;
        int pre = -1;
        for (int a : nums) {
            cur = (pre != a) ? cur + 1 : 1;
            pre = a;
            res += cur;
        }
        return res;
    }
}
