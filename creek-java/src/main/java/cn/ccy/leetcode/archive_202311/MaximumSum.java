package cn.ccy.leetcode.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/18 0018 20:13:44
 * @description https://leetcode.cn/problems/max-sum-of-a-pair-with-equal-sum-of-digits/?envType=daily-question&envId=2023-11-18
 * ☆☆☆ cvd，加班ing...T^T
 */
public class MaximumSum {
    public static void main(String[] args) {

    }

    // copy from https://leetcode.cn/problems/max-sum-of-a-pair-with-equal-sum-of-digits/solutions/2531487/mei-ju-you-wei-hu-zuo-pythonjavacgojsrus-eoys/?envType=daily-question&envId=2023-11-18
    public int maximumSum(int[] nums) {
        int ans = -1;
        int[] mx = new int[82]; // 至多 9 个 9 相加
        for (int num : nums) {
            int s = 0; // num 的数位和
            for (int x = num; x > 0; x /= 10) { // 枚举 num 的每个数位
                s += x % 10;
            }
            if (mx[s] > 0) { // 说明左边也有数位和等于 s 的元素
                ans = Math.max(ans, mx[s] + num); // 更新答案的最大值
            }
            mx[s] = Math.max(mx[s], num); // 维护数位和等于 s 的最大元素
        }
        return ans;
    }
}
