package cn.ccy.leetcode._2026._08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/make-lexicographically-smallest-array-by-swapping-elements/?envType=daily-question&envId=2026-08-29">2948. 交换得到字典序最小的数组</a>
 * @since 2026/8/29 02:58
 */
public class LexicographicallySmallestArray {
    public static void main(String[] args) {

    }

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] ans = new int[n];

        // 将元素值与原下标绑定
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // 按元素值升序排序
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int[] values = new int[n];
        int[] indices = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = arr[i][0];
            indices[i] = arr[i][1];
        }

        int i = 0;
        while (i < n) {
            int start = i;

            // 当前连通块中的原下标
            List<Integer> groupIndices = new ArrayList<>();

            // 当前连通块中的元素值
            List<Integer> groupValues = new ArrayList<>();

            while (i < n && (i == start || values[i] - values[i - 1] <= limit)) {
                groupIndices.add(indices[i]);
                groupValues.add(values[i]);
                i++;
            }

            // 由于元素值数组已经有序，这里不需要再排序
            Collections.sort(groupIndices);

            // 为得到字典序最小的结果，将较小元素放到较小下标处
            for (int k = 0; k < groupIndices.size(); k++) {
                ans[groupIndices.get(k)] = groupValues.get(k);
            }
        }

        return ans;
    }
}
