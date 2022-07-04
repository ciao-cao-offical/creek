package com.ciao.leetcode.archive_202207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/4
 * @description https://leetcode.cn/problems/minimum-absolute-difference/
 */
public class MinimumAbsDifference {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        System.out.println(new MinimumAbsDifference().minimumAbsDifference(arr));
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int gap = Integer.MAX_VALUE;
        for (int i = 0; i + 1 < arr.length; i++) {
            int newGap = Math.abs(arr[i + 1] - arr[i]);
            if (newGap < gap) {
                gap = newGap;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));

            } else if (newGap == gap) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return res;
    }
}
