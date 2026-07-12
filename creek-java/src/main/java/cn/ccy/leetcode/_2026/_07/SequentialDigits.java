package cn.ccy.leetcode._2026._07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/sequential-digits/?envType=daily-question&envId=2026-07-13">1291. 顺次数</a>
 * @since 2026/7/13 00:21
 */
public class SequentialDigits {
    public static void main(String[] args) {

    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int num = i;
            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        ans.sort((a, b) -> a - b);
        return ans;
    }
}
