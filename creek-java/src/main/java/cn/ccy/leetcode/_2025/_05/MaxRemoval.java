package cn.ccy.leetcode._2025._05;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/zero-array-transformation-iii/?envType=daily-question&envId=2025-05-22">3362. 零数组变换 III</a>
 * @since 2025/5/22 23:43
 */
public class MaxRemoval {
    public static void main(String[] args) {

    }

    public int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int[] deltaArray = new int[nums.length + 1];
        int operations = 0;

        for (int i = 0, j = 0; i < nums.length; i++) {
            operations += deltaArray[i];
            while (j < queries.length && queries[j][0] == i) {
                heap.offer(queries[j][1]);
                j++;
            }
            while (operations < nums[i] && !heap.isEmpty() && heap.peek() >= i) {
                operations += 1;
                deltaArray[heap.poll() + 1] -= 1;
            }
            if (operations < nums[i]) {
                return -1;
            }
        }
        return heap.size();
    }
}
