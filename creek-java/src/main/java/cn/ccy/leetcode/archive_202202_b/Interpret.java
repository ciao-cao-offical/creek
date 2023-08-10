package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/25
 * @description https://leetcode-cn.com/problems/goal-parser-interpretation/
 */
public class Interpret {
    public static void main(String[] args) {
        System.out.println(new Interpret().interpret("G()(al)"));
    }

    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            char c = command.charAt(i);
            if (c == 'G') {
                builder.append('G');
                i++;
            } else {
                if (command.charAt(i + 1) == 'a') {
                    builder.append('a');
                    builder.append('l');
                    i += 4;

                } else {
                    builder.append('o');
                    i += 2;
                }
            }
        }
        return builder.toString();
    }
}
