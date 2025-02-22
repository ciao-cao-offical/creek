package cn.ccy.leetcode._2025._02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/22 20:29
 * @description/link https://leetcode.cn/problems/count-pairs-of-similar-strings/?envType=daily-question&envId=2025-02-22
 */
public class SimilarPairs {
    public static void main(String[] args) {

    }

    public int similarPairs(String[] words) {
        int res = 0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (String word : words) {
            int state = 0;
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                state |= 1 << (c - 'a');
            }
            res += cnt.getOrDefault(state, 0);
            cnt.put(state, cnt.getOrDefault(state, 0) + 1);
        }
        return res;
    }
}
