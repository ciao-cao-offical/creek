package cn.ccy.leetcode.archive_2022.archive_202205;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/3 0003
 * @description https://leetcode-cn.com/problems/reorder-data-in-log-files/
 */
public class ReorderLogFiles {
    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        System.out.println(Arrays.toString(new ReorderLogFiles().reorderLogFiles(logs)));
    }

    public String[] reorderLogFiles(String[] logs) {
        int len = logs.length;
        if (len <= 1) {
            return logs;
        }

        Pair[] pairs = new Pair[len];
        for (int i = 0; i < len; i++) {
            pairs[i] = new Pair(logs[i], i);
        }

        Arrays.sort(pairs, (o1, o2) -> {
            String log_1 = o1.log;
            String log_2 = o2.log;
            Integer i_1 = o1.index;
            Integer i_2 = o2.index;
            String[] s_1 = log_1.split(" ", 2);
            boolean is_digit_1 = Character.isDigit(s_1[1].charAt(0));
            String[] s_2 = log_2.split(" ", 2);
            boolean is_digit_2 = Character.isDigit(s_2[1].charAt(0));
            if (is_digit_1 && is_digit_2) {
                return i_1 - i_2;

            } else if (!is_digit_1 && !is_digit_2) {
                int sc = s_1[1].compareTo(s_2[1]);
                if (sc != 0) {
                    return sc;

                } else {
                    return s_1[0].compareTo(s_2[0]);
                }

            } else {
                return is_digit_1 ? 1 : -1;
            }
        });

        String[] ans = new String[len];
        for (int i = 0; i < len; i++) {
            ans[i] = pairs[i].log;
        }
        return ans;
    }

    static class Pair {
        String log;
        Integer index;

        public Pair(String log, Integer index) {
            this.log = log;
            this.index = index;
        }
    }
}
