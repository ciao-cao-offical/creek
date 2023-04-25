package com.ciao.leetcode.archive_202304;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/25 0025 23:36:45
 * @description 简要描述当前类の作用
 */
public class SortPeople {
    public static void main(String[] args) {

    }

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[names.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            res[heights.length - 1 - i] = map.get(heights[i]);
        }
        return res;
    }
}
