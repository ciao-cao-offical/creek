package cn.ccy.leetcode.archive_2023.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/24 0024 20:39:05
 * @description https://leetcode.cn/problems/minimum-garden-perimeter-to-collect-enough-apples/?envType=daily-question&envId=2023-12-24
 */
public class MinimumPerimeter {
    public static void main(String[] args) {

    }

    public long minimumPerimeter(long neededApples) {
        long left = 1, right = 100000, ans = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (2 * mid * (mid + 1) * (mid * 2 + 1) >= neededApples) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans * 8;
    }
}
