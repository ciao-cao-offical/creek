package cn.ccy.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/3 0003
 * @description https://leetcode.cn/problems/second-largest-digit-in-a-string/
 */
public class SecondHighest {
    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(new SecondHighest().secondHighest(s));
    }

    public int secondHighest(String s) {
        int first = -1;
        int second = -1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (num > first) {
                    second = first;
                    first = num;

                } else if (num < first && num > second) {
                    second = num;
                }
            }
        }

        return second;
    }
}
