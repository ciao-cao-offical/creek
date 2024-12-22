package cn.ccy.leetcode.archive_2022.archive_202211;

import java.util.Stack;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/5 0005
 * @description https://leetcode.cn/problems/parsing-a-boolean-expression/
 */
public class ParseBoolExpr {
    public static void main(String[] args) {
        String expr = "|(&(t,f,t),!(t))";
        System.out.println(new ParseBoolExpr().parseBoolExpr(expr));
    }

    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        //'(', ')', '&', '|', '!', 't', 'f', ','
        for (char c : expression.toCharArray()) {
            if (c == ',') {
                continue;

            } else if (c != ')') {
                stack.push(c);

            } else {
                //c == ')'
                int t = 0, f = 0;
                while (stack.peek() != '(') {
                    Character val = stack.pop();
                    if (val == 't') {
                        ++t;
                    } else {
                        ++f;
                    }
                }
                //弹出'('
                stack.pop();

                Character op = stack.pop();
                switch (op) {
                    case '&':
                        stack.push(f > 0 ? 'f' : 't');
                        break;

                    case '|':
                        stack.push(t > 0 ? 't' : 'f');
                        break;

                    case '!':
                        stack.push(f == 1 ? 't' : 'f');
                        break;

                    default:
                        break;
                }
            }
        }

        return stack.pop() == 't';
    }
}
