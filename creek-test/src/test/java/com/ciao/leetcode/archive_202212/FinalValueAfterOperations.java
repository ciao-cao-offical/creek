package com.ciao.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/23 0023 21:01:27
 * @description https://leetcode.cn/problems/final-value-of-variable-after-performing-operations/
 */
public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(new FinalValueAfterOperations().finalValueAfterOperations(operations));
    }

    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                res++;

            } else {
                res--;
            }
        }
        return res;
    }
}
