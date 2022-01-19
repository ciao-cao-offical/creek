package com.ciao.leetcode;

import java.util.ArrayDeque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/6
 * @description https://leetcode-cn.com/problems/simplify-path/
 */
public class SimplifyPath {
    public String simplify(String path) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        String[] split = path.split("/");
        for (String s : split) {
            if ("..".equals(s)) {
                deque.pollLast();

            }else if (s != null && s.length() > 0 && !".".equals(s)){
                deque.offerLast(s);
            }
        }

        if (deque.isEmpty()){
            return "/";
        }else{
            StringBuilder builder = new StringBuilder();
            while (!deque.isEmpty()) {
                builder.append("/").append(deque.pollFirst());
            }

            return builder.toString();
        }
    }
}
