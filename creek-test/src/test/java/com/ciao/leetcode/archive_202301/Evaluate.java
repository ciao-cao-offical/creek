package com.ciao.leetcode.archive_202301;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/12 0012 21:47:11
 * @description https://leetcode.cn/problems/evaluate-the-bracket-pairs-of-a-string/
 */
public class Evaluate {
    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        //["name","bob"],["age","two"]
        List<String> l1 = Arrays.asList("name", "bob");
        List<String> l2 = Arrays.asList("age", "two");
        List<List<String>> knowledge = Arrays.asList(l1, l2);
        System.out.println(new Evaluate().evaluate(s, knowledge));
    }

    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> dic = new HashMap<>();
        for (List<String> k : knowledge) {
            dic.put(k.get(0), k.get(1));
        }

        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                StringBuilder key = new StringBuilder();
                while (++i < chars.length) {
                    if (chars[i] == ')') {
                        break;
                    }
                    key.append(chars[i]);
                }
                result.append(dic.getOrDefault(key.toString(), "?"));

            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
