package cn.ccy.leetcode.archive_202203;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/28
 * @description https://leetcode-cn.com/problems/decode-string/
 * ☆☆☆ 尝试一下【递归】
 */
public class DecodeString {
    private int curIndex;

    public static void main(String[] args) {
        System.out.println(new DecodeString().decodeString("2[abc]3[cd]ef"));
    }

    public String decodeString(String s) {
        int len = s.length();
        if (len == 0 || len == 1) {
            return s;
        }

        curIndex = 0;
        LinkedList<String> ans = new LinkedList<>();
        while (curIndex < len) {
            char c = s.charAt(curIndex);
            if (Character.isDigit(c)) {
                //数字
                ans.addLast(getDigital(s));

            } else if (Character.isLetter(c) || '[' == c) {
                //字母或左方括号
                ans.add(String.valueOf(c));
                curIndex++;

            } else {
                curIndex++;
                //右方括号
                LinkedList<String> part = new LinkedList<>();
                while (!"[".equals(ans.peekLast())) {
                    part.addLast(ans.removeLast());
                }

                Collections.reverse(part);
                String partStr = getString(part);
                //左括号出栈
                ans.removeLast();

                //获取重复次数
                int repeatNumber = Integer.parseInt(Objects.requireNonNull(ans.pollLast()));
                StringBuilder sb = new StringBuilder();
                while (repeatNumber-- > 0) {
                    sb.append(partStr);
                }
                ans.addLast(sb.toString());
            }
        }

        return getString(ans);
    }

    private String getDigital(String s) {
        StringBuilder sb = new StringBuilder();
        while (Character.isDigit(s.charAt(curIndex))) {
            sb.append(s.charAt(curIndex++));
        }

        return sb.toString();
    }

    private String getString(LinkedList<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }
}
