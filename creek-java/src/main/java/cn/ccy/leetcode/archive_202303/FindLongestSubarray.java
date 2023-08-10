package cn.ccy.leetcode.archive_202303;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/11 0011 19:54:36
 * @description https://leetcode.cn/problems/find-longest-subarray-lcci/
 */
public class FindLongestSubarray {
    public static void main(String[] args) {
        String[] array = {"A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7", "H", "I", "J", "K", "L", "M"};
        System.out.println(Arrays.toString(new FindLongestSubarray().findLongestSubarray(array)));
    }

    public String[] findLongestSubarray(String[] array) {
        int len = array.length;
        if (len == 1) {
            return new String[0];
        }

        int[] preSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            boolean alphabetic = Character.isAlphabetic(array[i].charAt(0));
            preSum[i + 1] = preSum[i] + (alphabetic ? 1 : -1);
        }

        int start = 0, end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < preSum.length; i++) {
            int ps = preSum[i];
            Integer first = map.getOrDefault(ps, -1);
            if (first < 0) {
                map.put(ps, i);

            } else if (i - first > end - start) {
                start = first;
                end = i;
            }
        }
        return Arrays.copyOfRange(array, start, end);
    }
}
