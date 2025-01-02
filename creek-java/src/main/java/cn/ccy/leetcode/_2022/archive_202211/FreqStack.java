package cn.ccy.leetcode._2022.archive_202211;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/30 0030
 * @description https://leetcode.cn/problems/maximum-frequency-stack/
 */
public class FreqStack {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> map = new HashMap<>();
    List<Deque<Integer>> stack = new ArrayList<>();


    public FreqStack() {

    }

    public void push(int val) {
        Integer time = map.getOrDefault(val, 0);
        if (stack.size() == time) {
            stack.add(new ArrayDeque<>());
        }
        stack.get(time).push(val);
        map.put(val, ++time);
    }

    public int pop() {
        int back = stack.size() - 1;
        Integer pop = stack.get(back).pop();
        if (stack.get(back).isEmpty()) {
            stack.remove(back);
        }

        map.put(pop, map.get(pop) - 1);
        return pop;
    }
}
