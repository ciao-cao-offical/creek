package cn.ccy.leetcode._2024.archive_202408;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/28 00:07:31
 * @description https://leetcode.cn/problems/minimum-substring-partition-of-equal-character-frequency/?envType=daily-question&envId=2024-08-28
 * ☆☆☆ 2024cvd
 */
public class MinimumSubstringsInPartition {
    public static void main(String[] args) {

    }

    static final int INF = 0x3f3f3f3f;

    public int minimumSubstringsInPartition(String s) {
        int n = s.length();
        int[] d = new int[n + 1];
        Arrays.fill(d, INF);
        d[0] = 0;
        for (int i = 1; i <= n; i++) {
            Map<Character, Integer> occCnt = new HashMap<Character, Integer>();
            int maxCnt = 0;
            for (int j = i; j >= 1; j--) {
                occCnt.put(s.charAt(j - 1), occCnt.getOrDefault(s.charAt(j - 1), 0) + 1);
                maxCnt = Math.max(maxCnt, occCnt.get(s.charAt(j - 1)));
                if (maxCnt * occCnt.size() == (i - j + 1) && d[j - 1] != INF) {
                    d[i] = Math.min(d[i], d[j - 1] + 1);
                }
            }
        }
        return d[n];
    }
}
