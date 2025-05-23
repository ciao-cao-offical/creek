package cn.ccy.leetcode._2023.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/4 0004 22:23:22
 * @description https://leetcode.cn/problems/maximum-value-at-a-given-index-in-a-bounded-array/
 */
public class MaxValue {
    public static void main(String[] args) {
        int n = 4;
        int index = 2;
        int maxSum = 6;
        System.out.println(new MaxValue().maxValue(n, index, maxSum));
    }

    //【贪心+二分查找】，看晕了...
    public int maxValue(int n, int index, int maxSum) {
        int left = 1, right = maxSum;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (valid(mid, n, index, maxSum)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public boolean valid(int mid, int n, int index, int maxSum) {
        int left = index;
        int right = n - index - 1;
        return mid + cal(mid, left) + cal(mid, right) <= maxSum;
    }

    public long cal(int big, int length) {
        if (length + 1 < big) {
            int small = big - length;
            return (long) (big - 1 + small) * length / 2;
        } else {
            int ones = length - (big - 1);
            //why？why？why？
            return (long) big * (big - 1) / 2 + ones;
        }
    }
}
