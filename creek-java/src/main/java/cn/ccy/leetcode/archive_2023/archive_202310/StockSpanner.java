package cn.ccy.leetcode.archive_2023.archive_202310;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/7 0007 18:36:22
 * @description https://leetcode.cn/problems/online-stock-span/description/?envType=daily-question&envId=2023-10-07
 */
public class StockSpanner {
    public static void main(String[] args) {

    }
    
    Deque<int[]> stack;
    int idx;

    public StockSpanner() {
        stack = new ArrayDeque<int[]>();
        stack.push(new int[]{-1, Integer.MAX_VALUE});
        idx = -1;
    }

    public int next(int price) {
        idx++;
        while (price >= stack.peek()[1]) {
            stack.pop();
        }
        int ret = idx - stack.peek()[0];
        stack.push(new int[]{idx, price});
        return ret;
    }
}
