package cn.ccy.leetcode._2023.archive_202309;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/11 0011 00:28:57
 * @description https://leetcode.cn/problems/course-schedule-iii/?envType=daily-question&envId=2023-09-11
 * ☆☆☆☆☆ cvd，加班完，干不动了...
 */
public class ScheduleCourse {
    public static void main(String[] args) {

    }

    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
        // 优先队列中所有课程的总时间
        int total = 0;

        for (int[] course : courses) {
            int ti = course[0], di = course[1];
            if (total + ti <= di) {
                total += ti;
                q.offer(ti);
            } else if (!q.isEmpty() && q.peek() > ti) {
                total -= q.poll() - ti;
                q.offer(ti);
            }
        }

        return q.size();
    }
}
