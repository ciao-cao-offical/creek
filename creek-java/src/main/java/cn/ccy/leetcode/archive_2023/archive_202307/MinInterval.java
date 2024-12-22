package cn.ccy.leetcode.archive_2023.archive_202307;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/18 0018 00:32:42
 * @description https://leetcode.cn/problems/minimum-interval-to-include-each-query/
 * ☆☆☆☆☆ cvd
 */
public class MinInterval {
    public static void main(String[] args) {

    }

    // cvd from：https://leetcode.cn/problems/minimum-interval-to-include-each-query/solutions/755827/javayou-xian-ji-dui-lie-jie-ti-qian-xian-v4s6/
    public int[] minInterval(int[][] intervals, int[] queries) {
        //将区间按区间头从小到大排序
        Arrays.sort(intervals, (o1, o2) -> (o1[0] - o2[0]));
        //记录queries以及i，也就是queries[i]和i
        int[][] que = new int[queries.length][2];
        for (int i = 0; i < queries.length; ++i) {
            que[i][0] = queries[i];
            que[i][1] = i;
        }
        //将值排序，小的在前
        Arrays.sort(que, (o1, o2) -> (o1[0] - o2[0]));
        int[] res = new int[queries.length];
        Arrays.fill(res, -1);
        //优先级队列，区间长度小的区间优先，在队列头
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((o1, o2) -> (o1[1] - o1[0] - o2[1] + o2[0]));
        //记录第几个区间，因为intervals和queries都是排好序的，所以用index记录目前走到哪里了
        int index = 0;
        for (int i = 0; i < queries.length; ++i) {
            //先把区间左边界小于等于queries[i]的区间加进去
            while (index < intervals.length && que[i][0] >= intervals[index][0]) {
                queue.offer(new int[]{intervals[index][0], intervals[index][1]});
                index += 1;
            }
            //再把区间右边界小于queries[i]的区间删除
            while (!queue.isEmpty() && queue.peek()[1] < que[i][0]) {
                queue.poll();
            }
            /*
            为什么不需要动index？
            正如上面的注释，intervals和queries都是排好序的
            如果这个区间不合适被删除了，是因为这个区间是在queries[i]的左面，但是之后的queries[i + 1]都比queries[i]大
            所以这个区间在以后肯定也不合适，就删除了，不再要了
            */
            if (!queue.isEmpty()) {
                int[] t = queue.peek();
                res[que[i][1]] = t[1] - t[0] + 1;
            }
        }

        return res;

    }
}
