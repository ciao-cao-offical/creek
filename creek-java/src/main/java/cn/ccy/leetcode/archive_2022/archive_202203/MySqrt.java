package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/24
 * @description https://leetcode-cn.com/problems/sqrtx/
 * ☆ 尝试一下【牛顿迭代法】
 */
public class MySqrt {
    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(3));
    }

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 0;
        int right = x;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long squ = (long) mid * mid;
            if (squ <= x) {
                ans = mid;
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
