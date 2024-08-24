package cn.ccy.leetcode.archive_202408;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/24 23:13:44
 * @description https://leetcode.cn/problems/permutation-difference-between-two-strings/?envType=daily-question&envId=2024-08-24
 */
public class FindPermutationDifference {
    public static void main(String[] args) {

    }

    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> char2index = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char2index.put(s.charAt(i), i);
        }
        int sum = 0;
        for (int i = 0; i < t.length(); ++i) {
            sum += Math.abs(i - char2index.get(t.charAt(i)));
        }
        return sum;
    }
}
