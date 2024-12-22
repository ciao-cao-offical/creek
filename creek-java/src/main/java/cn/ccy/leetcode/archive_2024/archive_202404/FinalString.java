package cn.ccy.leetcode.archive_2024.archive_202404;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/1 0001 00:43:12
 * @description https://leetcode.cn/problems/faulty-keyboard/?envType=daily-question&envId=2024-04-01
 */
public class FinalString {
    public static void main(String[] args) {

    }

    public String finalString(String s) {
        Deque<Character> q = new ArrayDeque<Character>();
        boolean head = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'i') {
                if (head) {
                    q.offerFirst(ch);
                } else {
                    q.offerLast(ch);
                }
            } else {
                head = !head;
            }
        }
        StringBuilder ans = new StringBuilder();
        if (head) {
            while (!q.isEmpty()) {
                ans.append(q.pollLast());
            }
        } else {
            while (!q.isEmpty()) {
                ans.append(q.pollFirst());
            }
        }
        return ans.toString();
    }
}
