package cn.ccy.leetcode.archive_2022.archive_202205;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/20 0020
 * @description https://leetcode.cn/problems/find-right-interval/
 * ☆☆☆ 试试【方法二：双指针】
 * 思考：二分查找left和right如何靠近...
 */
public class FindRightInterval {
    public static void main(String[] args) {
        int[][] intervals = {{3, 4}, {2, 3}, {1, 2}};
        System.out.println(Arrays.toString(new FindRightInterval().findRightInterval(intervals)));
    }

    //二分查找
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] startIntervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            startIntervals[i][0] = intervals[i][0];
            startIntervals[i][1] = i;
        }
        //研究研究 Comparator.comparingInt(o -> o[0])
        Arrays.sort(startIntervals, Comparator.comparingInt(o -> o[0]));

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int target = -1;
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (intervals[i][1] <= startIntervals[mid][0]) {
                    target = startIntervals[mid][1];
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }

            ans[i] = target;
        }

        return ans;
    }
}
