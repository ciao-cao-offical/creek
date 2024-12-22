package cn.ccy.leetcode.archive_2022.archive_202208;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/25 0025
 * @description https://leetcode.cn/problems/find-k-closest-elements/
 */
public class FindClosestElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4, x = 3;
        System.out.println(new FindClosestElements().findClosestElements(arr, k, x));
    }

    //二分法+双指针
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int right = binarySearch(arr, x);
        int left = right - 1;
        while (k-- > 0) {
            if (left < 0) {
                right++;

            } else if (right >= arr.length) {
                left--;

            } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left--;

            } else {
                right++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = left + 1; i < right; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    private int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                high = mid;

            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
