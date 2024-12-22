package cn.ccy.leetcode.archive_2024.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/20 23:45:23
 * @description https://leetcode.cn/problems/number-of-beautiful-pairs/?envType=daily-question&envId=2024-06-20
 */
public class CountBeautifulPairs {
    public static void main(String[] args) {

    }

    public int countBeautifulPairs(int[] nums) {
        int res = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 10) {
                nums[i] /= 10;
            }
            for (int j = i + 1; j < n; j++) {
                if (gcd(nums[i], nums[j] % 10) == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
