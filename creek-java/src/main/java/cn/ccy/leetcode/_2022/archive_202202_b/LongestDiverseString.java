package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/7
 * @description https://leetcode-cn.com/problems/longest-happy-string/
 */
public class LongestDiverseString {

    public static void main(String[] args) {
        System.out.println(new LongestDiverseString().longestDiverseString(7, 1, 0));
    }

    //贪心算法
    public String longestDiverseString(int a, int b, int c) {
        Pair[] pairs = new Pair[]{new Pair('a', a), new Pair('b', b), new Pair('c', c)};

        StringBuilder builder = new StringBuilder();
        while (true) {
            boolean hasNext = false;
            Arrays.sort(pairs, (p1, p2) -> p2.freq - p1.freq);
            for (Pair pair : pairs) {
                if (pair.freq <= 0) {
                    break;
                }

                char ch = pair.ch;
                int len = builder.length();
                if (len >= 2 && builder.charAt(len - 1) == ch && builder.charAt(len - 2) == ch) {
                    continue;
                }
                hasNext = true;
                builder.append(ch);
                pair.freq--;
                break;
            }

            if (!hasNext) {
                break;
            }
        }

        return builder.toString();
    }

    class Pair {
        char ch;
        int freq;

        public Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
}
