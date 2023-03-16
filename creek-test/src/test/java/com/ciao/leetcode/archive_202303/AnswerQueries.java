package com.ciao.leetcode.archive_202303;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/17 0017 00:18:09
 * @description https://leetcode.cn/problems/longest-subsequence-with-limited-sum/
 */
public class AnswerQueries {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 1}, queries = {3, 10, 21};
        System.out.println(Arrays.toString(new AnswerQueries().answerQueries(nums, queries)));
    }

    //排序 + 前缀和 + 二分法
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length, m = queries.length;
        Arrays.sort(nums);
        int[] f = new int[n + 1];
        for (int i = 0; i < n; i++) {
            f[i + 1] = f[i] + nums[i];
        }
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            answer[i] = binarySearch(f, queries[i]) - 1;
        }
        return answer;
    }

    //二分法怎么写？https://www.bilibili.com/video/BV1AP41137w7/?spm_id_from=333.999.0.0&vd_source=c2c3d3a7f53d70f3b7f4a5cd4d543bff
    public int binarySearch(int[] f, int target) {
        int low = 1, high = f.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (f[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
