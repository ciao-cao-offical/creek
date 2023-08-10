package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/16 0016
 * @description https://leetcode-cn.com/problems/largest-palindrome-product/
 * 注意【数据类型】！！！
 */
public class LargestPalindrome {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(new LargestPalindrome().largestPalindrome(n));
    }

    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }

        int upper = (int) Math.pow(10, n) - 1;
        int ans = 0;
        for (int left = upper; ans == 0; --left) {
            long p = left;
            for (int x = left; x > 0; x /= 10) {
                p = p * 10 + x % 10;
            }

            for (long x = upper; x * x >= p; --x) {
                if (p % x == 0) {
                    ans = (int) (p % 1337);
//                    ans = p % 1337;
                    break;
                }
            }
        }
        return ans;
    }
}
