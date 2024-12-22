package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/26 0026
 * @description https://leetcode-cn.com/problems/heaters/
 * ☆☆ 试试【排序+双指针】
 */
public class FindRadius {
    public static void main(String[] args) {
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};
        System.out.println(new FindRadius().findRadius(houses, heaters));
    }

    public int findRadius(int[] houses, int[] heaters) {
        int ans = 0;
        Arrays.sort(heaters);
        for (int house : houses) {
            int left = binarySearch(heaters, house);
            int right = left + 1;
            int leftDistance = left == -1 ? Integer.MAX_VALUE : house - heaters[left];
            int rightDistance = right == heaters.length ? Integer.MAX_VALUE : heaters[right] - house;
            int shortestDistance = Math.min(leftDistance, rightDistance);
            ans = Math.max(ans, shortestDistance);
        }
        return ans;
    }

    private int binarySearch(int[] heaters, int target) {
        int left = 0, right = heaters.length - 1;
        if (heaters[left] > target) {
            return -1;
        }

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (heaters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return left;
    }
}
