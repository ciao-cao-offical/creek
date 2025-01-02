package cn.ccy.leetcode._2023.archive_202311;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/24 0024 00:41:01
 * @description https://leetcode.cn/problems/count-pairs-whose-sum-is-less-than-target/?envType=daily-question&envId=2023-11-24
 */
public class CountPairs {
    public static void main(String[] args) {

    }

    public int countPairs(List<Integer> nums, int target) {
        Integer[] array = nums.toArray(new Integer[0]);
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (a + array[j] < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
