package cn.ccy.leetcode.archive_2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/24
 * @description https://leetcode.cn/problems/partition-array-into-disjoint-intervals/
 * cvd, fucking work!
 */
public class PartitionDisjoint {
    public static void main(String[] args) {

    }

    //【简单模拟】from：https://leetcode.cn/problems/partition-array-into-disjoint-intervals/solution/by-ac_oier-yyen/
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] min = new int[n + 10];
        min[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) min[i] = Math.min(min[i + 1], nums[i]);
        for (int i = 0, max = 0; i < n - 1; i++) {
            max = Math.max(max, nums[i]);
            if (max <= min[i + 1]) return i + 1;
        }
        return -1; // never
    }
}
