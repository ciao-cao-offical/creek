package cn.ccy.leetcode._2025._11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-convert-all-elements-to-zero/?envType=daily-question&envId=2025-11-10">3542. 将所有元素变为 0 的最少操作次数</a>
 * @since 2025/11/10 00:10
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums) {
        List<Integer> s = new ArrayList<>();
        int res = 0;
        for (int a : nums) {
            while (!s.isEmpty() && s.get(s.size() - 1) > a) {
                s.remove(s.size() - 1);
            }
            if (a == 0) continue;
            if (s.isEmpty() || s.get(s.size() - 1) < a) {
                res++;
                s.add(a);
            }
        }
        return res;
    }
}
