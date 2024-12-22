package cn.ccy.leetcode.archive_2023.archive_202302;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/14
 * @description https://leetcode.cn/problems/longest-well-performing-interval/
 */
public class LongestWPI {
    public static void main(String[] args) {
        int[] hours = {9, 9, 6, 0, 6, 6, 9};
        System.out.println(new LongestWPI().longestWPI(hours));
    }

    //【哈希表】
    public int longestWPI(int[] hours) {
        int n = hours.length;
        Map<Integer, Integer> map = new HashMap<>();
        int s = 0, res = 0;
        for (int i = 0; i < n; i++) {
            s += hours[i] > 8 ? 1 : -1;
            if (s > 0) {
                res = Math.max(res, i + 1);
            } else {
                if (map.containsKey(s - 1)) {
                    res = Math.max(res, i - map.get(s - 1));
                }
            }
            if (!map.containsKey(s)) {
                map.put(s, i);
            }
        }
        return res;
    }
}
