package cn.ccy.leetcode.archive_2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/21 0021 20:39:38
 * @description https://leetcode.cn/problems/maximum-score-from-removing-stones/
 */
public class MaximumScore {
    public static void main(String[] args) {

    }

    //【贪心】
    public int maximumScore(int a, int b, int c) {
        int sum = a + b + c;
        int max = Math.max(Math.max(a, b), c);
        return Math.min(sum - max, sum / 2);
    }
}
