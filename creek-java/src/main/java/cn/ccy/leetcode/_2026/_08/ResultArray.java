package cn.ccy.leetcode._2026._08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/distribute-elements-into-two-arrays-i/?envType=daily-question&envId=2026-08-20">3069. 将元素分配到两个数组中 I</a>
 * @since 2026/8/20 01:41
 */
public class ResultArray {
    public static void main(String[] args) {

    }

    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for (int i = 2; i < n; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        int[] res = new int[n];
        int idx = 0;
        for (int x : arr1) {
            res[idx++] = x;
        }
        for (int x : arr2) {
            res[idx++] = x;
        }
        return res;
    }
}
