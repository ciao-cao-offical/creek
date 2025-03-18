package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/prime-in-diagonal/?envType=daily-question&envId=2025-03-18">2614. 对角线上的质数</a>
 * @since 2025/3/18 22:45
 */
public class DiagonalPrime {
    public static void main(String[] args) {

    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length, res = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) {
                res = Math.max(res, nums[i][i]);
            }
            if (isPrime(nums[i][n - i - 1])) {
                res = Math.max(res, nums[i][n - i - 1]);
            }
        }
        return res;
    }

    private boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        int factor = 2;
        while (factor * factor <= num) {
            if (num % factor == 0) {
                return false;
            }
            factor++;
        }
        return true;
    }
}
