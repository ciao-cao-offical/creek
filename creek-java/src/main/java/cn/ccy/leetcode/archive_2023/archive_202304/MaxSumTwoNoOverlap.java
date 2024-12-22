package cn.ccy.leetcode.archive_2023.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/26 0026 22:27:48
 * @description https://leetcode.cn/problems/maximum-sum-of-two-non-overlapping-subarrays/
 * ★★★ cvd，练一下PPT，最后一天了，加油！(ง •_•)ง
 */
public class MaxSumTwoNoOverlap {
    public static void main(String[] args) {

    }

    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(help(nums, firstLen, secondLen), help(nums, secondLen, firstLen));
    }

    public int help(int[] nums, int firstLen, int secondLen) {
        int suml = 0;
        for (int i = 0; i < firstLen; ++i) {
            suml += nums[i];
        }
        int maxSumL = suml;
        int sumr = 0;
        for (int i = firstLen; i < firstLen + secondLen; ++i) {
            sumr += nums[i];
        }
        int res = maxSumL + sumr;
        for (int i = firstLen + secondLen, j = firstLen; i < nums.length; ++i, ++j) {
            suml += nums[j] - nums[j - firstLen];
            maxSumL = Math.max(maxSumL, suml);
            sumr += nums[i] - nums[i - secondLen];
            res = Math.max(res, maxSumL + sumr);
        }
        return res;
    }
}
