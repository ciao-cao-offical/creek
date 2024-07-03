package cn.ccy.leetcode.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/3 21:39:36
 * @description https://leetcode.cn/problems/harshad-number/?envType=daily-question&envId=2024-07-03
 */
public class SumOfTheDigitsOfHarshadNumber {
    public static void main(String[] args) {

    }

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x % sum == 0 ? sum : -1;
    }
}
