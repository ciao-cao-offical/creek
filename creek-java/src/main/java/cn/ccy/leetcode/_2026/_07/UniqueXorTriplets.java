package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-unique-xor-triplets-i/?envType=daily-question&envId=2026-07-23">3513. 不同 XOR 三元组的数目 I</a>
 * @since 2026/7/23 02:07
 */
public class UniqueXorTriplets {
    public static void main(String[] args) {

    }

    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int ans = 1;
        while (ans <= n) {
            ans <<= 1;
        }
        return ans;
    }
}
