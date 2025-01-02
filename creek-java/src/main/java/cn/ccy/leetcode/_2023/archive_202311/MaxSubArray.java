package cn.ccy.leetcode._2023.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/20 0020 00:33:58
 * @description https://leetcode.cn/problems/maximum-subarray/?envType=daily-question&envId=2023-11-20
 * ☆☆☆ 2023b2t
 */
public class MaxSubArray {
    public static void main(String[] args) {

    }

    // 学习一下官解的分治算法：https://leetcode.cn/problems/maximum-subarray/solutions/228009/zui-da-zi-xu-he-by-leetcode-solution/?envType=daily-question&envId=2023-11-20
    public class Status {
        public int lSum, rSum, mSum, iSum;

        public Status(int lSum, int rSum, int mSum, int iSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.iSum = iSum;
        }
    }

    public int maxSubArray(int[] nums) {
        return getInfo(nums, 0, nums.length - 1).mSum;
    }

    public Status getInfo(int[] a, int l, int r) {
        if (l == r) {
            return new Status(a[l], a[l], a[l], a[l]);
        }
        int m = (l + r) >> 1;
        Status lSub = getInfo(a, l, m);
        Status rSub = getInfo(a, m + 1, r);
        return pushUp(lSub, rSub);
    }

    public Status pushUp(Status l, Status r) {
        int iSum = l.iSum + r.iSum;
        int lSum = Math.max(l.lSum, l.iSum + r.lSum);
        int rSum = Math.max(r.rSum, r.iSum + l.rSum);
        int mSum = Math.max(Math.max(l.mSum, r.mSum), l.rSum + r.lSum);
        return new Status(lSum, rSum, mSum, iSum);
    }

    /* // 动态规划
    public int maxSubArray(int[] nums) {
        int pre = 0, max = nums[0];
        for (int n : nums) {
            pre = Math.max(pre + n, n);
            max = Math.max(pre, max);
        }

        return max;
    }*/
}
