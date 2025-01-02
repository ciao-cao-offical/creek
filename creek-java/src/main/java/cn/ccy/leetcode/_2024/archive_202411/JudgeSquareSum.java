package cn.ccy.leetcode._2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/4 00:39:46
 * @description https://leetcode.cn/problems/sum-of-square-numbers/?envType=daily-question&envId=2024-11-04
 */
public class JudgeSquareSum {
    public static void main(String[] args) {

    }

    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
