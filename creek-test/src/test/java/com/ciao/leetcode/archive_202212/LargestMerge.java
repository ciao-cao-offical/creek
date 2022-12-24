package com.ciao.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/24 0024 21:32:44
 * @description https://leetcode.cn/problems/largest-merge-of-two-strings/
 */
public class LargestMerge {
    public static void main(String[] args) {
        String word1 = "cabaa";
        String word2 = "bcaaa";
        System.out.println(new LargestMerge().largestMerge(word1, word2));
    }

    //【贪心算法】，如此算法居然不会TLE(Time Limit Error)
    public String largestMerge(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length() && word1.substring(i).compareTo(word2.substring(j)) > 0) {
                merge.append(word1.charAt(i));
                i++;
            } else {
                merge.append(word2.charAt(j));
                j++;
            }
        }
        return merge.toString();
    }
}
