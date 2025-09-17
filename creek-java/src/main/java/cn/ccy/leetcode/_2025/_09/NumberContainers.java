package cn.ccy.leetcode._2025._09;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/design-a-number-container-system/?envType=daily-question&envId=2025-09-17">2349. 设计数字容器系统</a>
 * @since 2025/9/17 22:26
 */
public class NumberContainers {
    public static void main(String[] args) {

    }

    private Map<Integer, Integer> nums = new HashMap<>();
    private Map<Integer, PriorityQueue<Integer>> heaps = new HashMap<>();

    public void change(int index, int number) {
        nums.put(index, number);
        heaps.computeIfAbsent(number, k -> new PriorityQueue<>()).add(index);
    }

    public int find(int number) {
        PriorityQueue<Integer> heap = heaps.get(number);
        if (heap == null) {
            return -1;
        }
        while (!heap.isEmpty() && !nums.get(heap.peek()).equals(number)) {
            heap.poll();
        }
        return heap.isEmpty() ? -1 : heap.peek();
    }
}
