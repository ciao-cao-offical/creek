package cn.ccy.leetcode._2026._07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximize-active-section-with-trade-i/?envType=daily-question&envId=2026-07-21">3499. 操作后最大活跃区段数 I</a>
 * @since 2026/7/21 00:57
 */
public class MaxActiveSectionsAfterTrade {
    public static void main(String[] args) {

    }

    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int cnt1 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') cnt1++;
        }

        List<Integer> zeroBlocks = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int start = i;
            while (i < n && s.charAt(i) == s.charAt(start)) {
                i++;
            }
            if (s.charAt(start) == '0') {
                zeroBlocks.add(i - start);
            }
        }

        int m = zeroBlocks.size();
        if (m < 2) {
            return cnt1;
        }
        int bestGain = 0; // 最优增量
        for (int j = 0; j < m - 1; j++) {
            bestGain = Math.max(bestGain, zeroBlocks.get(j) + zeroBlocks.get(j + 1));
        }

        return cnt1 + bestGain;
    }
}
