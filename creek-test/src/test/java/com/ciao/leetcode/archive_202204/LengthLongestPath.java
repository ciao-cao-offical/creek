package com.ciao.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/20
 * @description https://leetcode-cn.com/problems/longest-absolute-file-path/
 * ☆☆☆ 试试【栈】和【遍历】
 */
public class LengthLongestPath {
    public static void main(String[] args) {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(new LengthLongestPath().lengthLongestPath(input));
    }

    //模拟+哈希表
    /*public int lengthLongestPath(String input) {
        Map<Integer, String> map = new HashMap<>();
        int n = input.length();
        String ans = null;
        for (int i = 0; i < n; ) {
            int level = 0;

            while (i < n && input.charAt(i) == '\t' && ++level >= 0) {
                i++;
            }
            int j = i;
            boolean isDir = true;
            while (j < n && input.charAt(j) != '\n') {
                if (input.charAt(j++) == '.') {
                    isDir = false;
                }
            }
            String cur = input.substring(i, j);
            String prev = map.getOrDefault(level - 1, null);
            String path = prev == null ? cur : prev + "/" + cur;
            if (isDir) {
                map.put(level, path);
            } else if (ans == null || path.length() > ans.length()) {
                ans = path;
            }

            i = j + 1;
        }
        return ans == null ? 0 : ans.length();
    }*/

    //模拟+数组
    public int lengthLongestPath(String input) {
        int[] hash = new int[10010];
        int ans = 0;
        int n = input.length();
        Arrays.fill(hash, -1);
        for (int i = 0; i < n; ) {
            int level = 0;
            while (i < n && input.charAt(i) == '\t' && ++level >= 0) {
                i++;
            }

            int j = i;
            boolean isDir = true;
            while (j < n && input.charAt(j) != '\n') {
                if (input.charAt(j++) == '.') {
                    isDir = false;
                }
            }

            int cur = j - i;
            int prev = level - 1 >= 0 ? hash[level - 1] : -1;
            int path = prev + 1 + cur;
            if (isDir) {
                hash[level] = path;

            } else if (path > ans) {
                ans = path;
            }

            i = j + 1;
        }
        return ans;
    }
}
