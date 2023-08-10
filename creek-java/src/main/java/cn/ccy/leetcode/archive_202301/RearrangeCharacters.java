package cn.ccy.leetcode.archive_202301;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/13 0013 23:29:10
 * @description https://leetcode.cn/problems/rearrange-characters-to-make-target-string/
 */
public class RearrangeCharacters {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode", target = "code";
        System.out.println(new RearrangeCharacters().rearrangeCharacters(s, target));
    }

    //【哈希表计数】
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> sCounts = new HashMap<>();
        Map<Character, Integer> targetCounts = new HashMap<>();
        int n = s.length(), m = target.length();
        for (int i = 0; i < m; i++) {
            char c = target.charAt(i);
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (targetCounts.containsKey(c)) {
                sCounts.put(c, sCounts.getOrDefault(c, 0) + 1);
            }
        }
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : targetCounts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            int totalCount = sCounts.getOrDefault(c, 0);
            ans = Math.min(ans, totalCount / count);
            if (ans == 0) {
                return 0;
            }
        }
        return ans;
    }
}
