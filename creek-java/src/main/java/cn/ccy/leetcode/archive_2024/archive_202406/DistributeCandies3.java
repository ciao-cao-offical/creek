package cn.ccy.leetcode.archive_2024.archive_202406;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/3 23:11:56
 * @description https://leetcode.cn/problems/distribute-candies-to-people/?envType=daily-question&envId=2024-06-03
 */
public class DistributeCandies3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DistributeCandies3().distributeCandies(7, 4)));
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int start = 0;
        while (candies > 0) {
            for (int i = 0; i < res.length && candies > 0; i++) {
                res[i] += Math.min(++start, candies);
                candies -= start;
            }
        }

        return res;
    }
}
