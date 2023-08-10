package cn.ccy.leetcode.archive_202207;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/16 0016
 * @description https://leetcode.cn/problems/qIsx9U/
 */
public class MovingAverage {

    public static void main(String[] args) {

    }

    Queue<Integer> queue;
    int size;
    double sum;

    public MovingAverage(int size) {
        queue = new ArrayDeque<Integer>();
        this.size = size;
        sum = 0;
    }

    public double next(int val) {
        if (queue.size() == size) {
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }
}
