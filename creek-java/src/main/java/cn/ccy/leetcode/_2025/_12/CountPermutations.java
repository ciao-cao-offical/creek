package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-computer-unlocking-permutations/?envType=daily-question&envId=2025-12-10">3577. 统计计算机解锁顺序排列数</a>
 * @since 2025/12/10 22:08
 */
public class CountPermutations {
    public static void main(String[] args) {

    }

    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        for (int i = 1; i < n; i++) {
            if (complexity[i] <= complexity[0]) {
                return 0;
            }
        }

        int ans = 1;
        int mod = 1000000007;
        for (int i = 2; i < n; i++) {
            ans = (int) ((long) ans * i % mod);
        }
        return ans;
    }
}
