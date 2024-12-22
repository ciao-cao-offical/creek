package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/16 0016
 * @description https://leetcode-cn.com/problems/palindrome-number/
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rn = 0;
        while (x > rn) {
            rn = rn * 10 + x % 10;
            x /= 10;
        }
        return x == rn || x == rn / 10;
    }
}
