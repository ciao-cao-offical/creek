package cn.ccy.leetcode._2024.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/21 0021 00:17:06
 * @description https://leetcode.cn/problems/split-array-largest-sum/?envType=daily-question&envId=2024-01-21
 */
public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
            if (left < nums[i]) {
                left = nums[i];
            }
        }
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (check(nums, mid, m)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check(int[] nums, int x, int m) {
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > x) {
                cnt++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }
        return cnt <= m;
    }
}
