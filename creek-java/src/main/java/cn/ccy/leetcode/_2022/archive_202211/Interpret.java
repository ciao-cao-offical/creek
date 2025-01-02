package cn.ccy.leetcode._2022.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/6 0006
 * @description https://leetcode.cn/problems/goal-parser-interpretation/
 */
public class Interpret {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(new Interpret().interpret(command));
    }

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append("G");
                i++;

            } else if (c == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i += 2;

                } else {
                    sb.append("al");
                    i += 4;
                }
            }
        }
        return sb.toString();
    }
}
