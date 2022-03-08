package com.ciao.leetcode.archive_202203;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/8
 * @description https://leetcode-cn.com/problems/daily-temperatures/
 */
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(temperatures)));
    }

    //单调栈
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        //单调栈：从栈底到栈顶温度逐渐降低
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            int temperature = temperatures[i];
            while (!deque.isEmpty() && temperature > temperatures[deque.peek()]) {
                Integer pop = deque.pop();
                ans[pop] = i - pop;
            }

            deque.push(i);
        }

        return ans;
    }

    //暴力二
    /*public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = length - 1; i >= 0; --i) {
            int warmerIndex = Integer.MAX_VALUE;
            for (int t = temperatures[i] + 1; t <= 100; ++t) {
                if (next[t] < warmerIndex) {
                    warmerIndex = next[t];
                }
            }
            if (warmerIndex < Integer.MAX_VALUE) {
                ans[i] = warmerIndex - i;
            }
            next[temperatures[i]] = i;
        }
        return ans;
    }*/

    //暴力一
    /*
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            int temperature = temperatures[i];
            for (int j = i + 1; j < len; j++) {
                if (temperatures[j] > temperature) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }*/
}
