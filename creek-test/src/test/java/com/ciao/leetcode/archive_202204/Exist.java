package com.ciao.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/25
 * @description https://leetcode-cn.com/problems/word-search/
 */
public class Exist {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(new Exist().exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        return false;
    }
}
