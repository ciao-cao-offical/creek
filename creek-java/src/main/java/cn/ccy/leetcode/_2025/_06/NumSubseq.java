package cn.ccy.leetcode._2025._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/?envType=daily-question&envId=2025-06-29">1498. 满足条件的子序列数目</a>
 * @since 2025/6/29 17:28
 */
public class NumSubseq {
    public static void main(String[] args) {

    }

    static final int P = 1000000007;
    static final int MAX_N = 100005;

    int[] f = new int[MAX_N];

    public int numSubseq(int[] nums, int target) {
        pretreatment();

        Arrays.sort(nums);

        int ans = 0;
        for (int i = 0; i < nums.length && nums[i] * 2 <= target; ++i) {
            int maxValue = target - nums[i];
            int pos = binarySearch(nums, maxValue) - 1;
            int contribute = (pos >= i) ? f[pos - i] : 0;
            ans = (ans + contribute) % P;
        }

        return ans;
    }

    public void pretreatment() {
        f[0] = 1;
        for (int i = 1; i < MAX_N; ++i) {
            f[i] = (f[i - 1] << 1) % P;
        }
    }

    public int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (mid == nums.length) {
                return mid;
            }
            int num = nums[mid];
            if (num <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
