package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/4 0004
 * @description https://leetcode-cn.com/problems/range-sum-query-mutable/
 * ☆☆☆ 试试【线段树】和【树状数组】
 * 【宫水三叶】解题模板
 */
public class NumArray {
    private int[] sums;
    private int size;
    private int[] nums;

    //分块处理
    public NumArray(int[] nums) {
        this.nums = nums;
        int len = nums.length;
        size = (int) Math.sqrt(len);
        //向上取整
        sums = new int[(len + size - 1) / size];
        for (int i = 0; i < len; i++) {
            sums[i / size] += nums[i];
        }
    }

    public static void main(String[] args) {

    }

    public void update(int index, int val) {
        sums[index / size] += val - nums[index];
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int b1 = left / size;
        int i1 = left % size;
        int b2 = right / size;
        int i2 = right % size;
        if (b1 == b2) {
            int sum = 0;
            for (int i = b1 * size + i1; i <= b1 * size + i2; i++) {
                sum += nums[i];
            }
            return sum;
        }

        int sum1 = 0;
        for (int i = b1 * size + i1; i < b1 * size + size; i++) {
            sum1 += nums[i];
        }
        int sum2 = 0;
        for (int i = b2 * size; i <= b2 * size + i2; i++) {
            sum2 += nums[i];
        }
        int sum3 = 0;
        for (int i = b1 + 1; i < b2; i++) {
            sum3 += sums[i];
        }
        return sum1 + sum2 + sum3;
    }
}
