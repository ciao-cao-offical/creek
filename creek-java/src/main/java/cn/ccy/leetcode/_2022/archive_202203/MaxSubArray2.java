package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/29 0029
 * @description https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */
public class MaxSubArray2 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSubArray2().maxSubArray(nums));
    }

    //分治方法
    public int maxSubArray(int[] nums) {
        return getInfo(nums, 0, nums.length - 1).mSum;
    }

    private Status getInfo(int[] nums, int l, int r) {
        if (l == r) {
            return new Status(nums[l], nums[l], nums[l], nums[l]);
        }

        int m = (l + r) >> 1;
        Status leftInfo = getInfo(nums, l, m);
        Status rightInfo = getInfo(nums, m + 1, r);
        return pushUp(leftInfo, rightInfo);
    }

    private Status pushUp(Status leftInfo, Status rightInfo) {
        int iSum = leftInfo.iSum + rightInfo.iSum;
        int lSum = Math.max(leftInfo.lSum, leftInfo.iSum + rightInfo.lSum);
        int rSum = Math.max(rightInfo.rSum, rightInfo.iSum + leftInfo.rSum);
        int mSum = Math.max(Math.max(leftInfo.mSum, rightInfo.mSum), leftInfo.rSum + rightInfo.lSum);

        return new Status(lSum, rSum, mSum, iSum);
    }


    class Status {
        int lSum, rSum, mSum, iSum;

        public Status(int lSum, int rSum, int mSum, int iSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.iSum = iSum;
        }
    }

    //动态规划
    /*public int maxSubArray(int[] nums) {
        int max = nums[0];
        int pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(pre, max);
        }
        return max;
    }*/
}
