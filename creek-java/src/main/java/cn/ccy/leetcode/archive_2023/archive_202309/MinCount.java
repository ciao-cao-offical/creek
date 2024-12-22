package cn.ccy.leetcode.archive_2023.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/20 0020 02:22:16
 * @description https://leetcode.cn/problems/na-ying-bi/?envType=daily-question&envId=2023-09-20
 */
public class MinCount {
    public static void main(String[] args) {

    }

    public int minCount(int[] coins) {
        int sum = 0;
        for (int i : coins) {
            sum += (i + 1) / 2;
        }
        return sum;
    }
}
