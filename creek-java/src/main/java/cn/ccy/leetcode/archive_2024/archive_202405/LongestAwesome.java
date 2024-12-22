package cn.ccy.leetcode.archive_2024.archive_202405;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/20 00:43:22
 * @description https://leetcode.cn/problems/find-longest-awesome-substring/?envType=daily-question&envId=2024-05-20
 * ☆☆☆☆☆ 2024cvd
 */
public class LongestAwesome {
    public static void main(String[] args) {

    }

    public int longestAwesome(String s) {
        int n = s.length();
        Map<Integer, Integer> prefix = new HashMap<Integer, Integer>();
        prefix.put(0, -1);
        int ans = 0;
        int sequence = 0;
        for (int j = 0; j < n; ++j) {
            int digit = s.charAt(j) - '0';
            sequence ^= (1 << digit);
            if (prefix.containsKey(sequence)) {
                ans = Math.max(ans, j - prefix.get(sequence));
            } else {
                prefix.put(sequence, j);
            }
            for (int k = 0; k < 10; ++k) {
                if (prefix.containsKey(sequence ^ (1 << k))) {
                    ans = Math.max(ans, j - prefix.get(sequence ^ (1 << k)));
                }
            }
        }
        return ans;
    }
}
