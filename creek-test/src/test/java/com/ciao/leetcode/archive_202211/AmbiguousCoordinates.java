package com.ciao.leetcode.archive_202211;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/7
 * @description https://leetcode.cn/problems/ambiguous-coordinates/
 */
public class AmbiguousCoordinates {
    public static void main(String[] args) {
        String s = "(00011)";
        System.out.println(new AmbiguousCoordinates().ambiguousCoordinates(s));
    }

    //【模拟】参考自：https://leetcode.cn/problems/ambiguous-coordinates/solutions/1953793/zhua-wa-mou-si-tu-jie-leetcode-by-muse-7-7y25/
    public List<String> ambiguousCoordinates(String s) {
        List<String> res = new ArrayList<>();
        s = s.substring(1, s.length() - 1);
        for (int i = 1; i < s.length(); i++) {
            for (String l : getNums(s.substring(0, i))) {
                for (String r : getNums(s.substring(i))) {
                    res.add("(" + l + ", " + r + ")");
                }
            }
        }
        return res;
    }

    private List<String> getNums(String sub) {
        List<String> list = new ArrayList<>();
        String left;
        String right;
        int i = 1;
        while (i <= sub.length()) {
            left = sub.substring(0, i);
            right = sub.substring(i++);
            if ((!left.equals("0") && left.charAt(0) == '0') ||
                    (!right.isEmpty() && right.charAt(right.length() - 1) == '0')) {
                continue;
            }
            if (right.isEmpty()) {
                list.add(left);
            } else {
                list.add(left + "." + right);
            }
        }
        return list;
    }
}
