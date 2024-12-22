package cn.ccy.leetcode.archive_2022.archive_202205;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/6 0006
 * @description https://leetcode-cn.com/problems/number-of-recent-calls/
 * 试试【线段树（动态开点）】-【宫水三叶】
 */
public class RecentCounter {
    public static void main(String[] args) {

    }

    Deque<Integer> dq;

    public RecentCounter() {
        dq = new ArrayDeque<>();
    }

    public int ping(int t) {
        dq.add(t);
        while (!dq.isEmpty() && dq.peek() < t - 3000) {
            dq.pop();
        }
        return dq.size();
    }
}
