package cn.ccy.leetcode.archive_2024.archive_202405;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/30 22:54:56
 * @description https://leetcode.cn/problems/find-longest-special-substring-that-occurs-thrice-ii/?envType=daily-question&envId=2024-05-30
 */
public class MaximumLength2 {
    public static void main(String[] args) {

    }

    public int maximumLength(String s) {
        int n = s.length();
        Map<Character, List<Integer>> cnt = new HashMap<>();

        for (int i = 0, j = 0; i < n; i = j) {
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            cnt.computeIfAbsent(s.charAt(i), k -> new ArrayList<>()).add(j - i);
        }

        int res = -1;
        for (List<Integer> vec : cnt.values()) {
            int lo = 1, hi = n - 2;
            while (lo <= hi) {
                int mid = (lo + hi) >> 1;
                int count = 0;
                for (int x : vec) {
                    if (x >= mid) {
                        count += x - mid + 1;
                    }
                }
                if (count >= 3) {
                    res = Math.max(res, mid);
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return res;
    }
}
