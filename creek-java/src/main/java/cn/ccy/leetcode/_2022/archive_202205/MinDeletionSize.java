package cn.ccy.leetcode._2022.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/12 0012
 * @description https://leetcode.cn/problems/delete-columns-to-make-sorted/
 */
public class MinDeletionSize {
    public static void main(String[] args) {
        String[] strs = {"cba", "daf", "ghi"};
        System.out.println(new MinDeletionSize().minDeletionSize(strs));
    }

    public int minDeletionSize(String[] strs) {
        int m = strs.length;
        if (m == 0) {
            return 0;
        }
        int n = strs[0].length();
        int del = 0;
        for (int j = 0; j < n; j++) {
            char p = 'a';
            for (String str : strs) {
                char c = str.charAt(j);
                if (c < p) {
                    del++;
                    break;
                }
                p = c;
            }
        }

        return del;
    }
}
