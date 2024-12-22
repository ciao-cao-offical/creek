package cn.ccy.leetcode.archive_2023.archive_202310;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/16 0016 00:48:56
 * @description https://leetcode.cn/problems/single-number-iii/?envType=daily-question&envId=2023-10-16
 */
public class SingleNumber3 {
    public static void main(String[] args) {

    }

    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                ans[index++] = entry.getKey();
            }
        }
        return ans;
    }
}
