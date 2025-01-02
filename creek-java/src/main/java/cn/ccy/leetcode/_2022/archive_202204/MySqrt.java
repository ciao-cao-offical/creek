package cn.ccy.leetcode._2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/4 0004
 * @description https://leetcode-cn.com/problems/sqrtx/
 */
public class MySqrt {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(new MySqrt().mySqrt(x));
    }

    //二分法 k平方 <= x
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 0;
        int right = x;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
