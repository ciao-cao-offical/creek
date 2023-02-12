package com.ciao.leetcode.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/12 0012 19:05:37
 * @description https://leetcode.cn/problems/alphabet-board-path/
 */
public class AlphabetBoardPath {
    public static void main(String[] args) {
        System.out.println(new AlphabetBoardPath().alphabetBoardPath("leet"));
    }

    //【直接模拟】，优先处理'U'和'L'，可以有效避免'z'带来的问题。
    public String alphabetBoardPath(String target) {
        int cx = 0, cy = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            int nx = (c - 'a') / 5;
            int ny = (c - 'a') % 5;
            if (nx < cx) {
                for (int j = 0; j < cx - nx; j++) {
                    res.append('U');
                }
            }
            if (ny < cy) {
                for (int j = 0; j < cy - ny; j++) {
                    res.append('L');
                }
            }
            if (nx > cx) {
                for (int j = 0; j < nx - cx; j++) {
                    res.append('D');
                }
            }
            if (ny > cy) {
                for (int j = 0; j < ny - cy; j++) {
                    res.append('R');
                }
            }
            res.append('!');
            cx = nx;
            cy = ny;
        }
        return res.toString();
    }
}
