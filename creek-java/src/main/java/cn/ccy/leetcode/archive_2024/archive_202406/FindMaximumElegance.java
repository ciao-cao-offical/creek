package cn.ccy.leetcode.archive_2024.archive_202406;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/13 23:14:44
 * @description https://leetcode.cn/problems/maximum-elegance-of-a-k-length-subsequence/?envType=daily-question&envId=2024-06-13
 * ☆☆☆☆☆ 2024cvd
 */
public class FindMaximumElegance {
    public static void main(String[] args) {

    }

    public long findMaximumElegance(int[][] items, int k) {
        Arrays.sort(items, (item0, item1) -> item1[0] - item0[0]);
        Set<Integer> categorySet = new HashSet<>();
        long profit = 0, res = 0;
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < items.length; i++) {
            if (i < k) {
                profit += items[i][0];
                if (!categorySet.add(items[i][1])) {
                    st.push(items[i][0]);
                }
            } else if (!st.isEmpty() && categorySet.add(items[i][1])) {
                profit += items[i][0] - st.pop();
            }
            res = Math.max(res, profit + (long) categorySet.size() * categorySet.size());
        }
        return res;
    }
}
