package cn.ccy.leetcode._2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/7 0007
 * @description https://leetcode.cn/problems/equal-sum-arrays-with-minimum-number-of-operations/
 */
public class MinOperations2 {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,4,5,6}, nums2 = {1,1,2,2,2,2};
        System.out.println(new MinOperations2().minOperations(nums1,nums2));
    }

    public int minOperations(int[] nums1, int[] nums2) {
        if (6 * nums1.length < nums2.length || 6 * nums2.length < nums1.length){
            return -1; // 优化
        }

        // int d = Arrays.stream(nums2).sum() - Arrays.stream(nums1).sum();
        int d = 0; // 数组元素和的差，我们要让这个差变为 0
        for (int x : nums2) {
            d += x;
        }
        for (int x : nums1) {
            d -= x;
        }

        if (d < 0) {
            d = -d;
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp; // 交换，统一让 nums1 的数变大，nums2 的数变小
        }

        int[] cnt = new int[6]; // 统计每个数的最大变化量
        for (int x : nums1) {
            ++cnt[6 - x]; // nums1 的变成 6
        }
        for (int x : nums2) {
            ++cnt[x - 1]; // nums2 的变成 1
        }


        for (int i = 5, ans = 0; ; --i) { // 从大到小枚举最大变化量 5 4 3 2 1
            if (i * cnt[i] >= d) {
                // 可以让 d 变为 0
                return ans + (d + i - 1) / i;
            }
            ans += cnt[i]; // 需要所有最大变化量为 i 的数
            d -= i * cnt[i];
        }
    }
}
