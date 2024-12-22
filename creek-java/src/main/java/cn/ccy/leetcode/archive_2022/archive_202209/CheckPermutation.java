package cn.ccy.leetcode.archive_2022.archive_202209;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/27
 * @description https://leetcode.cn/problems/check-permutation-lcci/
 */
public class CheckPermutation {
    public static void main(String[] args) {

    }

    public boolean CheckPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            Integer num = map.get(c);
            --num;
            if (num < 0) {
                return false;
            }
            map.put(c, num);
        }

        return true;
    }
}
