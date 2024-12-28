package cn.ccy.leetcode.archive_2024.archive_202412;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/28 22:02:45
 * @description https://leetcode.cn/problems/split-the-array/?envType=daily-question&envId=2024-12-28
 */
public class IsPossibleToSplit {
    public static void main(String[] args) {

    }

    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > 2) {
                return false;
            }
        }
        return true;
    }
}
