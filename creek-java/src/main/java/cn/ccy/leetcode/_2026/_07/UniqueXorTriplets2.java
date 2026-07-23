package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-unique-xor-triplets-ii/?envType=daily-question&envId=2026-07-24">3514. 不同 XOR 三元组的数目 II</a>
 * @since 2026/7/24 00:59
 */
public class UniqueXorTriplets2 {
    public static void main(String[] args) {

    }

    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int m = 0;
        for (int v : nums) {
            m = Math.max(m, v);
        }
        int u = 1;
        while (u <= m) {
            u <<= 1;
        }
        boolean[] s = new boolean[u];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                s[nums[i] ^ nums[j]] = true;
            }
        }
        boolean[] t = new boolean[u];
        for (int x = 0; x < u; x++) {
            if (!s[x]) {
                continue;
            }
            for (int v : nums) {
                t[x ^ v] = true;
            }
        }
        int ans = 0;
        for (boolean b : t) {
            if (b) {
                ans++;
            }
        }
        return ans;
    }
}
