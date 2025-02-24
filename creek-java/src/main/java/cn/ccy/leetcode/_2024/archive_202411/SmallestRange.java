package cn.ccy.leetcode._2024.archive_202411;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/24 22:29:27
 * @description https://leetcode.cn/problems/smallest-range-covering-elements-from-k-lists/description/?envType=daily-question&envId=2024-11-24
 * ☆☆☆☆☆ 2024cvd
 */
public class SmallestRange {
    public static void main(String[] args) {

    }

    public int[] smallestRange(List<List<Integer>> nums) {
        int rangeLeft = 0, rangeRight = Integer.MAX_VALUE;
        int minRange = rangeRight - rangeLeft;
        int max = Integer.MIN_VALUE;
        int size = nums.size();
        int[] next = new int[size];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer index1, Integer index2) {
                return nums.get(index1).get(next[index1]) - nums.get(index2).get(next[index2]);
            }
        });
        for (int i = 0; i < size; i++) {
            priorityQueue.offer(i);
            max = Math.max(max, nums.get(i).get(0));
        }
        while (true) {
            int minIndex = priorityQueue.poll();
            int curRange = max - nums.get(minIndex).get(next[minIndex]);
            if (curRange < minRange) {
                minRange = curRange;
                rangeLeft = nums.get(minIndex).get(next[minIndex]);
                rangeRight = max;
            }
            next[minIndex]++;
            if (next[minIndex] == nums.get(minIndex).size()) {
                break;
            }
            priorityQueue.offer(minIndex);
            max = Math.max(max, nums.get(minIndex).get(next[minIndex]));
        }
        return new int[]{rangeLeft, rangeRight};
    }
}
